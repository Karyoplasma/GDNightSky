package action;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
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

		// IMPLEMENT THIS
		List<Constellation> illegalConstellations = goal.isLegalConfiguration();

		resultModel.clearPath();
		// THIS IS UGLY, FIX THE NODE CONSTRUCTOR
		Node<Devotion> startNode = new Node<Devotion>(start, "Start");
		Node<Devotion> goalNode = new Node<Devotion>(goal, "Goal");

		Node<Devotion> result = DevotionSearch.aStarSearch(startNode, goalNode);
		if (result != null) {
			String path = DevotionSearch.reconstructPath(result);
			resultModel.addPath(path);
		}
	}

}
