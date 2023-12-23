package listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import core.enums.Constellation;
import model.ChosenDevotionTableModel;

public class ConstellationTreeMouseAdapter extends MouseAdapter {

	private final JTree constellationTree;
	private JTable tableChosenDevotion;
	private JTextField textFieldFilter;

	public ConstellationTreeMouseAdapter(JTree constellationTree, JTable tableChosenDevotion,
			JTextField textFieldFilter) {
		this.constellationTree = constellationTree;
		this.tableChosenDevotion = tableChosenDevotion;
		this.textFieldFilter = textFieldFilter;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 2) {
			DefaultMutableTreeNode node = (DefaultMutableTreeNode) constellationTree.getLastSelectedPathComponent();
			if (node == null || !(node.isLeaf())) {
				return;
			}

			Constellation constellation = (Constellation) node.getUserObject();
			((ChosenDevotionTableModel) tableChosenDevotion.getModel()).addConstellation(constellation);
			String filterText = textFieldFilter.getText();
			if (filterText == null) {
				return;
			}
			textFieldFilter.requestFocus();
			textFieldFilter.setCaretPosition(filterText.length());
			textFieldFilter.selectAll();
		}
	}
}
