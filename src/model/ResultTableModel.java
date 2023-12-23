package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ResultTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 7190299146798857134L;
	private ArrayList<String> path;

	public ResultTableModel() {
		this.path = new ArrayList<String>();
	}

	public void addPath(String step) {
		String[] stepSplit = step.split("\n");
		for (String s : stepSplit) {
			path.add(s);
		}
		fireTableDataChanged();
	}

	public void clearPath() {
		path.clear();
		fireTableDataChanged();
	}

	@Override
	public String getColumnName(int column) {
		return "Path";
	}

	@Override
	public int getRowCount() {
		return path.size();
	}

	@Override
	public int getColumnCount() {
		return 1;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return path.get(rowIndex);
	}

}
