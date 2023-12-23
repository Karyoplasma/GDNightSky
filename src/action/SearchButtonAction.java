package action;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
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

	public SearchButtonAction(JTable tableChosenDevotion, JTable tableResults) {
		putValue(Action.NAME, "Search");
		this.tableChosenDevotion = tableChosenDevotion;
		this.tableResults = tableResults;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ChosenDevotionTableModel chosenDevotionModel = (ChosenDevotionTableModel) tableChosenDevotion.getModel();
		ResultTableModel resultModel = (ResultTableModel) tableResults.getModel();
		Devotion start = new Devotion();
		Devotion goal = new Devotion();

		for (Constellation c : chosenDevotionModel.getDevotion()) {
			goal.assign(c);
		}

		List<Constellation> illegalConstellations = goal.getIllegalConstellations();
		StringBuffer buffer = new StringBuffer();
		if (goal.getPointsRemaining() < 0) {
			buffer.append(String.format("You are using %d devotion points. The maximum is 55.",
					55 - goal.getPointsRemaining()));
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
		Node<Devotion> startNode = new Node<Devotion>(start);
		Node<Devotion> goalNode = new Node<Devotion>(goal);

		Node<Devotion> result = DevotionSearch.aStarSearch(startNode, goalNode);
		if (result != null) {
			String path = DevotionSearch.reconstructPath(result);
			resultModel.addPath(path);
		}
	}

}
