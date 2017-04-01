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

public class Interface {

	private JFrame frame;
	private JTextField textField;
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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel pnlBasic = new JPanel();
		tabbedPane.addTab("Basic Options", null, pnlBasic, null);
		pnlBasic.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		pnlBasic.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblSelect = new JLabel("Select");
		panel_1.add(lblSelect);
		
		JCheckBox chckbxMinus = new JCheckBox("Minus");
		chckbxMinus.setSelected(true);
		panel_1.add(chckbxMinus);
		
		JCheckBox chckbxMayus = new JCheckBox("Mayus");
		panel_1.add(chckbxMayus);
		
		JCheckBox chckbxNumbers = new JCheckBox("Numbers");
		panel_1.add(chckbxNumbers);
		
		JCheckBox chckbxCharacters = new JCheckBox("Special Characters");
		panel_1.add(chckbxCharacters);
		
		JPanel panel_2 = new JPanel();
		pnlBasic.add(panel_2, BorderLayout.CENTER);
		
		JLabel lblNumberOfCharacters = new JLabel("Number of characters: ");
		panel_2.add(lblNumberOfCharacters);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		panel_2.add(spinner);
		
		JPanel panel_3 = new JPanel();
		pnlBasic.add(panel_3, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Set page of account: ");
		panel_3.add(lblNewLabel);
		
		textField_1 = new JTextField();
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel pnlAdvanced = new JPanel();
		tabbedPane.addTab("Advanced Options", null, pnlAdvanced, null);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnGeneratePassword = new JButton("Generate Password");
		panel.add(btnGeneratePassword);
	}

}
