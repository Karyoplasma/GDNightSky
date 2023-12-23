package model;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import core.enums.Constellation;

public class ConstellationTreeModel implements TreeModel {

	private DefaultMutableTreeNode root;

	public ConstellationTreeModel() {
		root = new DefaultMutableTreeNode("Constellations");

		DefaultMutableTreeNode tier0 = new DefaultMutableTreeNode("Crossroads");
		DefaultMutableTreeNode tier1 = new DefaultMutableTreeNode("Tier 1");
		DefaultMutableTreeNode tier2 = new DefaultMutableTreeNode("Tier 2");
		DefaultMutableTreeNode tier3 = new DefaultMutableTreeNode("Tier 3");

		for (Constellation c : Constellation.values()) {
			switch (c.getTier()) {
			case 0:
				tier0.add(new DefaultMutableTreeNode(c));
				break;
			case 1:
				tier1.add(new DefaultMutableTreeNode(c));
				break;

			case 2:
				tier2.add(new DefaultMutableTreeNode(c));
				break;
			case 3:
				tier3.add(new DefaultMutableTreeNode(c));
				break;
			default:
				break;
			}
		}
		root.add(tier0);
		root.add(tier1);
		root.add(tier2);
		root.add(tier3);
	}

	@Override
	public Object getRoot() {
		return root;
	}

	@Override
	public Object getChild(Object parent, int index) {
		return ((DefaultMutableTreeNode) parent).getChildAt(index);
	}

	@Override
	public int getChildCount(Object parent) {
		return ((DefaultMutableTreeNode) parent).getChildCount();
	}

	@Override
	public boolean isLeaf(Object node) {
		return ((DefaultMutableTreeNode) node).isLeaf();
	}

	@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		return ((DefaultMutableTreeNode) parent).getIndex((DefaultMutableTreeNode) child);
	}

	@Override
	public void addTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub

	}

}
