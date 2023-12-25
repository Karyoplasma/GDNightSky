package action;

import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import core.Devotion;
import core.DevotionSearch;
import core.Node;
import core.enums.Constellation;
import model.ChosenDevotionTableModel;
import model.ResultTableModel;

public class SearchButtonAction extends AbstractAction {

	private static final long serialVersionUID = 6504529512326768326L;
	private JTable tableResults, tableChosenDevotion;
	private JButton searchButton;
	private DevotionSearchWorker workerThread;
	private JCheckBox chckbxPreferActives;
	private Node<Devotion> start, goal;

	public SearchButtonAction(JTable tableChosenDevotion, JTable tableResults, JButton searchButton,
			JCheckBox chckbxPreferActives) {
		putValue(Action.NAME, "Search");
		this.tableChosenDevotion = tableChosenDevotion;
		this.tableResults = tableResults;
		this.searchButton = searchButton;
		this.chckbxPreferActives = chckbxPreferActives;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ChosenDevotionTableModel chosenDevotionModel = (ChosenDevotionTableModel) tableChosenDevotion.getModel();
		ResultTableModel resultModel = (ResultTableModel) tableResults.getModel();
		Devotion startDevotion = new Devotion();
		Devotion goalDevotion = new Devotion();
		for (Constellation c : chosenDevotionModel.getDevotion()) {
			goalDevotion.assign(c);
		}

		List<Constellation> illegalConstellations = goalDevotion.getIllegalConstellations();
		StringBuffer buffer = new StringBuffer();
		if (goalDevotion.getPointsRemaining() < 0) {
			buffer.append(String.format("You are using %d devotion points. The maximum is 55.",
					55 - goalDevotion.getPointsRemaining()));
		}
		if (!illegalConstellations.isEmpty()) {
			if (buffer.length() != 0) {
				buffer.append(System.getProperty("line.separator"));
				buffer.append(System.getProperty("line.separator"));
			}
			buffer.append("The following constellations cannot sustain themselves:");
			buffer.append(System.getProperty("line.separator"));
			for (Constellation constellation : illegalConstellations) {
				buffer.append(constellation.toString());
				buffer.append(System.getProperty("line.separator"));
			}
		}
		if (!(buffer.length() == 0)) {
			JOptionPane.showMessageDialog(tableChosenDevotion, buffer.toString(), "Illegal Devotion",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		resultModel.clearPath();

		this.start = new Node<Devotion>(startDevotion);
		this.goal = new Node<Devotion>(goalDevotion);
		searchButton.setEnabled(false);
		workerThread = new DevotionSearchWorker(searchButton, tableResults.getModel());
		workerThread.execute();
	}

	Node<Devotion> performSearch() {
		return DevotionSearch.aStarSearch(start, goal, chckbxPreferActives.isSelected());
	}
}
