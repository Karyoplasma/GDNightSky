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
import action.SearchButtonAction;
import action.ClearButtonAction;
import listener.ChosenDevotionMouseAdapter;
import listener.ConstellationTreeMouseAdapter;
import listener.FilterDocumentListener;
import model.ChosenDevotionTableModel;
import model.ConstellationTreeFilterModel;
import model.ConstellationTreeModel;
import model.ResultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JCheckBox;

public class GDNightSky {

	private JFrame frame;
	private JTable tableChosenDevotion;
	private JTable tableResult;
	private JSeparator separator;
	private JScrollPane scrollPaneConstellationTree;
	private JTree constellationTree;
	private JButton btnSearch;
	private JTextField textFieldFilter;
	private JButton btnClear;
	private JCheckBox chckbxPreferActives;
	
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
		frame.setBounds(new Rectangle(100, 100, 500, 600));
		frame.setTitle("GD Night Sky");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow][grow][]", "[][grow][][][grow][]"));

		JLabel lblChooseDevotions = new JLabel("Choose desired constellations:");
		lblChooseDevotions.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(lblChooseDevotions, "cell 0 0,alignx trailing");

		JScrollPane scrollPaneChosenDevotions = new JScrollPane();
		frame.getContentPane().add(scrollPaneChosenDevotions, "cell 1 1 2 1,grow");

		tableChosenDevotion = new JTable(new ChosenDevotionTableModel());
		tableChosenDevotion.addMouseListener(new ChosenDevotionMouseAdapter(tableChosenDevotion));
		tableChosenDevotion.setRowSelectionAllowed(false);
		tableChosenDevotion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableChosenDevotion.setFillsViewportHeight(true);
		tableChosenDevotion.setShowGrid(false);
		tableChosenDevotion.setShowHorizontalLines(false);
		tableChosenDevotion.setShowVerticalLines(false);
		scrollPaneChosenDevotions.setViewportView(tableChosenDevotion);

		scrollPaneConstellationTree = new JScrollPane();
		frame.getContentPane().add(scrollPaneConstellationTree, "cell 0 1,grow");
		ConstellationTreeModel model = new ConstellationTreeModel();
		ConstellationTreeFilterModel filter = new ConstellationTreeFilterModel(model);
		constellationTree = new JTree(filter);
		constellationTree.setToggleClickCount(1);
		scrollPaneConstellationTree.setViewportView(constellationTree);

		textFieldFilter = new JTextField();
		textFieldFilter.getDocument()
				.addDocumentListener(new FilterDocumentListener(filter, textFieldFilter, constellationTree));
		textFieldFilter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(textFieldFilter, "cell 1 0 2 1,growx");
		constellationTree.addMouseListener(
				new ConstellationTreeMouseAdapter(constellationTree, tableChosenDevotion, textFieldFilter));

		btnClear = new JButton(new ClearButtonAction(tableChosenDevotion));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnClear, "cell 2 2,growx,aligny top");

		JPanel panelSeparator = new JPanel();
		frame.getContentPane().add(panelSeparator, "cell 0 3 3 1,grow");
		panelSeparator.setLayout(new BorderLayout(0, 0));

		separator = new JSeparator();
		panelSeparator.add(separator, BorderLayout.CENTER);

		JScrollPane scrollPaneResult = new JScrollPane();
		frame.getContentPane().add(scrollPaneResult, "cell 0 4 2 1,grow");

		tableResult = new JTable(new ResultTableModel());
		tableResult.setFillsViewportHeight(true);
		tableResult.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableResult.setShowVerticalLines(false);
		tableResult.setShowHorizontalLines(false);
		tableResult.setRowSelectionAllowed(false);
		tableResult.setShowGrid(false);
		scrollPaneResult.setViewportView(tableResult);
		
		chckbxPreferActives = new JCheckBox("Prefer actives");
		chckbxPreferActives.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(chckbxPreferActives, "cell 1 5,alignx right");
		
		btnSearch = new JButton();
		SearchButtonAction searchButtonAction = new SearchButtonAction(tableChosenDevotion, tableResult, btnSearch, chckbxPreferActives);
		btnSearch.setAction(searchButtonAction);
		
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnSearch, "cell 2 5,growx,aligny bottom");
		
	}

}
