package model;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

public class ConstellationTreeFilterModel extends DefaultTreeModel {

	private static final long serialVersionUID = -2287987214068673407L;
	private String filter;
	private ConstellationTreeModel model;

	public ConstellationTreeFilterModel(ConstellationTreeModel model) {
		super((TreeNode) model.getRoot());
		this.model = model;
	}

	public void setFilter(String filter) {
		this.filter = filter;
		reload((TreeNode) model.getRoot());
	}

	@Override
	public Object getChild(Object parent, int index) {
		if (filter == null || filter.isEmpty()) {
			return model.getChild(parent, index);
		} else {
			int count = 0;
			int childCount = model.getChildCount(parent);
			for (int i = 0; i < childCount; i++) {
				Object child = model.getChild(parent, i);
				if (containsFilter(child)) {
					if (count == index) {
						return child;
					}
					count++;
				}
			}
			return null;
		}
	}

	@Override
	public int getChildCount(Object parent) {
		if (filter == null || filter.isEmpty()) {
			return model.getChildCount(parent);
		} else {
			int count = 0;
			int childCount = model.getChildCount(parent);
			for (int i = 0; i < childCount; i++) {
				Object child = model.getChild(parent, i);
				if (containsFilter(child)) {
					count++;
				}
			}
			return count;
		}
	}

	private boolean containsFilter(Object node) {
		if (node.toString().toLowerCase().contains(filter.toLowerCase())) {
			return true;
		} else if (!model.isLeaf(node)) {
			int childCount = model.getChildCount(node);
			for (int i = 0; i < childCount; i++) {
				Object child = model.getChild(node, i);
				if (containsFilter(child)) {
					return true;
				}
			}
		}
		return false;
	}
}
