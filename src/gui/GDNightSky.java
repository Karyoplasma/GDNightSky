package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTree;
import listener.ConstellationTreeMouseAdapter;
import model.ConstellationTreeModel;
import javax.swing.JButton;

public class GDNightSky {

	private JFrame frame;
	private JTable tableChosenDevotions;
	private JTable tableResult;
	private JSeparator separator;
	private JScrollPane scrollPaneConstellationTree;
	private JTree constellationTree;
	private JButton btnSearch;
	private JLabel lblResults;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GDNightSky window = new GDNightSky();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GDNightSky() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("GD Night Sky");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow][grow][]", "[][grow][][][grow][]"));

		JLabel lblChooseDevotions = new JLabel("Choose desired devotions:");
		lblChooseDevotions.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(lblChooseDevotions, "cell 0 0");

		scrollPaneConstellationTree = new JScrollPane();
		frame.getContentPane().add(scrollPaneConstellationTree, "cell 0 1,grow");

		constellationTree = new JTree(new ConstellationTreeModel());
		constellationTree.addMouseListener(new ConstellationTreeMouseAdapter(constellationTree, tableChosenDevotions));
		scrollPaneConstellationTree.setViewportView(constellationTree);

		JScrollPane scrollPaneChosenDevotions = new JScrollPane();
		frame.getContentPane().add(scrollPaneChosenDevotions, "cell 1 1 2 1,grow");

		tableChosenDevotions = new JTable();
		tableChosenDevotions.setRowSelectionAllowed(false);
		tableChosenDevotions.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableChosenDevotions.setFillsViewportHeight(true);
		tableChosenDevotions.setShowGrid(false);
		tableChosenDevotions.setShowHorizontalLines(false);
		tableChosenDevotions.setShowVerticalLines(false);
		scrollPaneChosenDevotions.setViewportView(tableChosenDevotions);

		JPanel panelSeparator = new JPanel();
		frame.getContentPane().add(panelSeparator, "cell 0 2 3 1,grow");
		panelSeparator.setLayout(new BorderLayout(0, 0));

		separator = new JSeparator();
		panelSeparator.add(separator, BorderLayout.CENTER);

		lblResults = new JLabel("Path:");
		lblResults.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(lblResults, "cell 0 3");

		JScrollPane scrollPaneResult = new JScrollPane();
		frame.getContentPane().add(scrollPaneResult, "cell 0 4 2 2,grow");

		tableResult = new JTable();
		tableResult.setFillsViewportHeight(true);
		tableResult.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableResult.setShowVerticalLines(false);
		tableResult.setShowHorizontalLines(false);
		tableResult.setRowSelectionAllowed(false);
		tableResult.setShowGrid(false);
		scrollPaneResult.setViewportView(tableResult);

		btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnSearch, "cell 2 5");

	}

}
