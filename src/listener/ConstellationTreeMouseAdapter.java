package listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import core.enums.Constellation;
import model.ChosenDevotionTableModel;

public class ConstellationTreeMouseAdapter extends MouseAdapter {

	private final JTree constellationTree;
	private JTable tableChosenDevotion;

	public ConstellationTreeMouseAdapter(JTree constellationTree, JTable tableChosenDevotion) {
		this.constellationTree = constellationTree;
		this.tableChosenDevotion = tableChosenDevotion;
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
		}
	}
}
