package listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

import model.ChosenDevotionTableModel;

public class ChosenDevotionMouseAdapter extends MouseAdapter {

	JTable tableChosenDevotion;

	public ChosenDevotionMouseAdapter(JTable tableChosenDevotion) {
		this.tableChosenDevotion = tableChosenDevotion;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 2) {
			int row = tableChosenDevotion.rowAtPoint(e.getPoint());

			if (row >= 0) {
				((ChosenDevotionTableModel) tableChosenDevotion.getModel()).removeConstellation(row);
			}
		}
	}
}
