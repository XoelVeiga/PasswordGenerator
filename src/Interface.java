import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Interface {

	private JFrame frame;
	private JTextField textPassOutput;
	private JTextField txtRoute;
	private JTextField txtName;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel pnlBasic = new JPanel();
		tabbedPane.addTab("Basic Options", null, pnlBasic, null);
		GridBagLayout gbl_pnlBasic = new GridBagLayout();
		gbl_pnlBasic.columnWidths = new int[]{0, 0};
		gbl_pnlBasic.rowHeights = new int[]{92, 0, 0, 0};
		gbl_pnlBasic.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pnlBasic.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		pnlBasic.setLayout(gbl_pnlBasic);
		
		JPanel pnlCharOpts = new JPanel();
		GridBagConstraints gbc_pnlCharOpts = new GridBagConstraints();
		gbc_pnlCharOpts.insets = new Insets(0, 0, 5, 0);
		gbc_pnlCharOpts.fill = GridBagConstraints.BOTH;
		gbc_pnlCharOpts.gridx = 0;
		gbc_pnlCharOpts.gridy = 0;
		pnlBasic.add(pnlCharOpts, gbc_pnlCharOpts);
		GridBagLayout gbl_pnlCharOpts = new GridBagLayout();
		gbl_pnlCharOpts.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnlCharOpts.rowHeights = new int[]{14, 0, 0};
		gbl_pnlCharOpts.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlCharOpts.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		pnlCharOpts.setLayout(gbl_pnlCharOpts);
		
		JLabel lblSelect = new JLabel("Select one as min:");
		GridBagConstraints gbc_lblSelect = new GridBagConstraints();
		gbc_lblSelect.insets = new Insets(0, 0, 0, 5);
		gbc_lblSelect.anchor = GridBagConstraints.WEST;
		gbc_lblSelect.gridx = 0;
		gbc_lblSelect.gridy = 1;
		pnlCharOpts.add(lblSelect, gbc_lblSelect);
		
		JCheckBox chckbxLower = new JCheckBox("Lower");
		chckbxLower.setSelected(true);
		GridBagConstraints gbc_chckbxLower = new GridBagConstraints();
		gbc_chckbxLower.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxLower.gridx = 1;
		gbc_chckbxLower.gridy = 1;
		pnlCharOpts.add(chckbxLower, gbc_chckbxLower);
		
		JCheckBox chckbxCaps = new JCheckBox("Caps");
		GridBagConstraints gbc_chckbxCaps = new GridBagConstraints();
		gbc_chckbxCaps.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxCaps.gridx = 2;
		gbc_chckbxCaps.gridy = 1;
		pnlCharOpts.add(chckbxCaps, gbc_chckbxCaps);
		
		JCheckBox chckbxNumbers = new JCheckBox("Nums");
		GridBagConstraints gbc_chckbxNumbers = new GridBagConstraints();
		gbc_chckbxNumbers.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxNumbers.gridx = 3;
		gbc_chckbxNumbers.gridy = 1;
		pnlCharOpts.add(chckbxNumbers, gbc_chckbxNumbers);
		
		JCheckBox chckbxSpecialCharacters = new JCheckBox("Special characters");
		GridBagConstraints gbc_chckbxSpecialCharacters = new GridBagConstraints();
		gbc_chckbxSpecialCharacters.gridx = 4;
		gbc_chckbxSpecialCharacters.gridy = 1;
		pnlCharOpts.add(chckbxSpecialCharacters, gbc_chckbxSpecialCharacters);
		
		JPanel pnlLenght = new JPanel();
		GridBagConstraints gbc_pnlLenght = new GridBagConstraints();
		gbc_pnlLenght.insets = new Insets(0, 0, 5, 0);
		gbc_pnlLenght.fill = GridBagConstraints.BOTH;
		gbc_pnlLenght.gridx = 0;
		gbc_pnlLenght.gridy = 1;
		pnlBasic.add(pnlLenght, gbc_pnlLenght);
		GridBagLayout gbl_pnlLenght = new GridBagLayout();
		gbl_pnlLenght.columnWidths = new int[]{100, 0, 0, 118, 26, 0};
		gbl_pnlLenght.rowHeights = new int[]{0, 0};
		gbl_pnlLenght.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlLenght.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlLenght.setLayout(gbl_pnlLenght);
		
		JLabel lblPassword = new JLabel("Password lenght");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 0, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 0;
		pnlLenght.add(lblPassword, gbc_lblPassword);
		
		JSpinner spinnerLength = new JSpinner();
		spinnerLength.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spinnerLength = new GridBagConstraints();
		gbc_spinnerLength.insets = new Insets(0, 0, 0, 5);
		gbc_spinnerLength.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerLength.gridx = 3;
		gbc_spinnerLength.gridy = 0;
		pnlLenght.add(spinnerLength, gbc_spinnerLength);
		
		JPanel pnlPage = new JPanel();
		GridBagConstraints gbc_pnlPage = new GridBagConstraints();
		gbc_pnlPage.anchor = GridBagConstraints.NORTH;
		gbc_pnlPage.fill = GridBagConstraints.HORIZONTAL;
		gbc_pnlPage.gridx = 0;
		gbc_pnlPage.gridy = 2;
		pnlBasic.add(pnlPage, gbc_pnlPage);
		GridBagLayout gbl_pnlPage = new GridBagLayout();
		gbl_pnlPage.columnWidths = new int[]{90, 0, 152, 0, 0};
		gbl_pnlPage.rowHeights = new int[]{0, 0, 0};
		gbl_pnlPage.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlPage.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		pnlPage.setLayout(gbl_pnlPage);
		
		JLabel lblPage = new JLabel("Set page to password");
		GridBagConstraints gbc_lblPage = new GridBagConstraints();
		gbc_lblPage.insets = new Insets(0, 0, 0, 5);
		gbc_lblPage.gridx = 1;
		gbc_lblPage.gridy = 1;
		pnlPage.add(lblPage, gbc_lblPage);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 0, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 1;
		pnlPage.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JPanel pnlAdvanced = new JPanel();
		tabbedPane.addTab("Advanced Options", null, pnlAdvanced, null);
		GridBagLayout gbl_pnlAdvanced = new GridBagLayout();
		gbl_pnlAdvanced.columnWidths = new int[]{35, 266, 0, 0, 0, 0, 0, 0};
		gbl_pnlAdvanced.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 19, 0, 0};
		gbl_pnlAdvanced.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlAdvanced.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		pnlAdvanced.setLayout(gbl_pnlAdvanced);
		
		JLabel lblSelectIfYou = new JLabel("Select if you want to create a document with password");
		GridBagConstraints gbc_lblSelectIfYou = new GridBagConstraints();
		gbc_lblSelectIfYou.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectIfYou.gridx = 1;
		gbc_lblSelectIfYou.gridy = 1;
		pnlAdvanced.add(lblSelectIfYou, gbc_lblSelectIfYou);
		
		JCheckBox checkBoxDoc = new JCheckBox("");
		checkBoxDoc.setSelected(true);
		GridBagConstraints gbc_checkBoxDoc = new GridBagConstraints();
		gbc_checkBoxDoc.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxDoc.gridx = 4;
		gbc_checkBoxDoc.gridy = 1;
		pnlAdvanced.add(checkBoxDoc, gbc_checkBoxDoc);
		
		JLabel lblIfItIs = new JLabel("If it is already created it will be overwrited");
		GridBagConstraints gbc_lblIfItIs = new GridBagConstraints();
		gbc_lblIfItIs.insets = new Insets(0, 0, 5, 5);
		gbc_lblIfItIs.gridx = 1;
		gbc_lblIfItIs.gridy = 2;
		pnlAdvanced.add(lblIfItIs, gbc_lblIfItIs);
		
		txtRoute = new JTextField();
		txtRoute.setText("C:");
		GridBagConstraints gbc_txtRoute = new GridBagConstraints();
		gbc_txtRoute.insets = new Insets(0, 0, 5, 5);
		gbc_txtRoute.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRoute.gridx = 1;
		gbc_txtRoute.gridy = 4;
		pnlAdvanced.add(txtRoute, gbc_txtRoute);
		txtRoute.setColumns(10);
		
		JLabel lblSetRute = new JLabel("Set route");
		GridBagConstraints gbc_lblSetRute = new GridBagConstraints();
		gbc_lblSetRute.insets = new Insets(0, 0, 5, 5);
		gbc_lblSetRute.gridx = 3;
		gbc_lblSetRute.gridy = 4;
		pnlAdvanced.add(lblSetRute, gbc_lblSetRute);
		
		JCheckBox checkBoxRoute = new JCheckBox("");
		GridBagConstraints gbc_checkBoxRoute = new GridBagConstraints();
		gbc_checkBoxRoute.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxRoute.gridx = 4;
		gbc_checkBoxRoute.gridy = 4;
		pnlAdvanced.add(checkBoxRoute, gbc_checkBoxRoute);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 6;
		pnlAdvanced.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		txtName = new JTextField();
		GridBagConstraints gbc_txtName = new GridBagConstraints();
		gbc_txtName.insets = new Insets(0, 0, 0, 5);
		gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtName.gridx = 0;
		gbc_txtName.gridy = 0;
		panel_4.add(txtName, gbc_txtName);
		txtName.setColumns(10);
		
		JLabel lbltxt = new JLabel(".txt");
		GridBagConstraints gbc_lbltxt = new GridBagConstraints();
		gbc_lbltxt.gridx = 1;
		gbc_lbltxt.gridy = 0;
		panel_4.add(lbltxt, gbc_lbltxt);
		
		JLabel lblSetName = new JLabel("Set name");
		GridBagConstraints gbc_lblSetName = new GridBagConstraints();
		gbc_lblSetName.insets = new Insets(0, 0, 5, 5);
		gbc_lblSetName.gridx = 3;
		gbc_lblSetName.gridy = 6;
		pnlAdvanced.add(lblSetName, gbc_lblSetName);
		
		JCheckBox checkBoxName = new JCheckBox("");
		GridBagConstraints gbc_checkBoxName = new GridBagConstraints();
		gbc_checkBoxName.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxName.gridx = 4;
		gbc_checkBoxName.gridy = 6;
		pnlAdvanced.add(checkBoxName, gbc_checkBoxName);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{58, 201, 127, 0};
		gbl_panel.rowHeights = new int[]{23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		textPassOutput = new JTextField();
		GridBagConstraints gbc_textPassOutput = new GridBagConstraints();
		gbc_textPassOutput.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPassOutput.insets = new Insets(0, 0, 0, 5);
		gbc_textPassOutput.gridx = 1;
		gbc_textPassOutput.gridy = 0;
		panel.add(textPassOutput, gbc_textPassOutput);
		textPassOutput.setColumns(10);
		
		JButton btnGeneratePassword = new JButton("Generate Password");
		btnGeneratePassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//This happens when you click on the "generate password" button.
				//String lng is just to get the text from the spinner.
				String lng = spinnerLength.getValue().toString();
				//Integer length is the text got with lng parsed into a integer.
				int length = Integer.parseInt(lng);
				boolean lowercase = chckbxMayus.isSelected();
				boolean uppercase = chckbxMayus.isSelected();
				boolean num = chckbxNumbers.isSelected();
				boolean symbol = chckbxSpecialCharacters.isSelected();
				String finalPassword = Principal.generatePassword(lowercase, uppercase, num, symbol, length);
				textPassOutput.setText(finalPassword);
			}
		});
		GridBagConstraints gbc_btnGeneratePassword = new GridBagConstraints();
		gbc_btnGeneratePassword.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnGeneratePassword.gridx = 2;
		gbc_btnGeneratePassword.gridy = 0;
		panel.add(btnGeneratePassword, gbc_btnGeneratePassword);
	}

}
