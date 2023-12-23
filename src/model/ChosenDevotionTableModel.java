package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import core.enums.Constellation;

public class ChosenDevotionTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 7413748875419445434L;
	private ArrayList<Constellation> devotion;

	public ChosenDevotionTableModel() {
		this.devotion = new ArrayList<Constellation>();
	}

	public void addConstellation(Constellation constellation) {
		if (!devotion.contains(constellation)) {
			devotion.add(constellation);
			fireTableDataChanged();
		}
	}

	public void removeConstellation(int index) {
		devotion.remove(index);
		fireTableDataChanged();
	}

	public void clear() {
		devotion.clear();
		fireTableDataChanged();
	}

	public ArrayList<Constellation> getDevotion() {
		return devotion;
	}

	@Override
	public int getRowCount() {
		return devotion.size();
	}

	@Override
	public String getColumnName(int column) {
		return "Chosen constellations";
	}

	@Override
	public int getColumnCount() {
		return 1;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return devotion.get(rowIndex);
	}

}
