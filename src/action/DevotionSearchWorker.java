package action;

import javax.swing.JButton;
import javax.swing.SwingWorker;
import javax.swing.table.TableModel;

import core.Devotion;
import core.DevotionSearch;
import core.Node;
import model.ResultTableModel;

public class DevotionSearchWorker extends SwingWorker<Node<Devotion>, Void> {
	private JButton searchButton;
	private ResultTableModel modelResults;

	public DevotionSearchWorker(JButton searchButton, TableModel tableModel) {
		this.searchButton = searchButton;
		this.modelResults = (ResultTableModel) tableModel;
	}

	@Override
	protected Node<Devotion> doInBackground() throws Exception {

		return ((SearchButtonAction) searchButton.getAction()).performSearch();
	}

	@Override
	protected void done() {
		try {
			Node<Devotion> result = get();
			String path = DevotionSearch.reconstructPath(result);
			modelResults.addPath(path);
		} catch (Exception ex) {
			modelResults.addPath("No path found.");
			modelResults.addPath("Please report this on github.");
			modelResults.addPath("https://github.com/Karyoplasma/GDNightSky/");
			ex.printStackTrace();
		} finally {
			searchButton.setEnabled(true);
		}
	}

}
