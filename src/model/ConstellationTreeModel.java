package model;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import comparator.ConstellationTreeComparator;
import core.enums.Constellation;

public class ConstellationTreeModel implements TreeModel {

	private DefaultMutableTreeNode root;

	public ConstellationTreeModel() {
		root = new DefaultMutableTreeNode("Constellations");

		DefaultMutableTreeNode tier0 = new DefaultMutableTreeNode("Crossroads");
		DefaultMutableTreeNode tier1 = new DefaultMutableTreeNode("Tier 1");
		DefaultMutableTreeNode tier2 = new DefaultMutableTreeNode("Tier 2");
		DefaultMutableTreeNode tier3 = new DefaultMutableTreeNode("Tier 3");
		ArrayList<Constellation> tier1List = new ArrayList<Constellation>();
		ArrayList<Constellation> tier2List = new ArrayList<Constellation>();
		ArrayList<Constellation> tier3List = new ArrayList<Constellation>();
		for (Constellation c : Constellation.values()) {
			switch (c.getTier()) {
			case 0:
				tier0.add(new DefaultMutableTreeNode(c));
				break;
			case 1:
				tier1List.add(c);
				break;
			case 2:
				tier2List.add(c);
				break;
			case 3:
				tier3List.add(c);
				break;
			default:
				break;
			}
		}
		ConstellationTreeComparator comp = new ConstellationTreeComparator();
		Collections.sort(tier1List, comp);
		Collections.sort(tier2List, comp);
		Collections.sort(tier3List, comp);
		for (Constellation con : tier1List) {
			tier1.add(new DefaultMutableTreeNode(con));
		}
		for (Constellation con : tier2List) {
			tier2.add(new DefaultMutableTreeNode(con));
		}
		for (Constellation con : tier3List) {
			tier3.add(new DefaultMutableTreeNode(con));
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

	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {

	}

}
