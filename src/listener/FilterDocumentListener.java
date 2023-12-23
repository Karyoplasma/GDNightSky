package listener;

import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.ConstellationTreeFilterModel;

public class FilterDocumentListener implements DocumentListener {
	ConstellationTreeFilterModel filter;
	JTextField filterText;
	JTree constellationTree;

	public FilterDocumentListener(ConstellationTreeFilterModel filter, JTextField filterText, JTree constellationTree) {
		this.filterText = filterText;
		this.filter = filter;
		this.constellationTree = constellationTree;
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		filter();

	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		filter();

	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		filter();

	}

	public void filter() {
		filter.setFilter(filterText.getText());
		expandAllNodes(constellationTree, 0, constellationTree.getRowCount());
	}

	public void expandAllNodes(JTree tree, int startingIndex, int rowCount) {
		for (int i = startingIndex; i < rowCount; ++i) {
			tree.expandRow(i);
		}

		if (tree.getRowCount() != rowCount) {
			expandAllNodes(tree, rowCount, tree.getRowCount());
		}
	}
}
