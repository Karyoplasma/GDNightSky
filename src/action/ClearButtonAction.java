package action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTable;

import model.ChosenDevotionTableModel;

public class ClearButtonAction extends AbstractAction {
	
	private static final long serialVersionUID = -4821366710952476197L;
	JTable tableChosenDevotion;
	
	public ClearButtonAction(JTable tableChosenDevotion) {
		putValue(Action.NAME, "Clear");
		this.tableChosenDevotion = tableChosenDevotion;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		((ChosenDevotionTableModel) this.tableChosenDevotion.getModel()).clear();
	}

}
