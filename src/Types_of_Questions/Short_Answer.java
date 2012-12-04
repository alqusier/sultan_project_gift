package Types_of_Questions;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class Short_Answer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;


	/**
	 * Create the frame.
	 */
	public Short_Answer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 857, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[right][grow][]", "[]10[252.00,grow,top][grow][]"));
		
		JLabel lblNewLabel = new JLabel("Quistion Titil (optional) ");
		contentPane.add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 1 0 2 1,growx");
		textField.setColumns(10);
		
		JLabel lblQuistion = new JLabel("Quistion");
		contentPane.add(lblQuistion, "cell 0 1,alignx right");
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, "cell 1 1 2 1,grow");
		
		JLabel lblAnswer = new JLabel("Answer");
		contentPane.add(lblAnswer, "cell 0 2");
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 1 2 2 1,grow");
		panel.setLayout(new MigLayout("", "[][grow][]", "[][][]"));
		
		JLabel lblNewLabel_1 = new JLabel("A");
		panel.add(lblNewLabel_1, "cell 0 0,alignx trailing");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "cell 1 0,growx");
		textField_1.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Delete");
		panel.add(chckbxNewCheckBox, "cell 2 0");
		
		JLabel lblNewLabel_2 = new JLabel("B");
		panel.add(lblNewLabel_2, "cell 0 1,alignx trailing");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "cell 1 1,growx");
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Delete");
		panel.add(chckbxNewCheckBox_1, "cell 2 1");
		
		JLabel lblNewLabel_3 = new JLabel("C");
		panel.add(lblNewLabel_3, "cell 0 2,alignx trailing");
		
		textField_3 = new JTextField();
		panel.add(textField_3, "cell 1 2,growx");
		textField_3.setColumns(10);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Delete");
		panel.add(chckbxNewCheckBox_2, "cell 2 2");
		
		JButton btnNewButton = new JButton("Add Answare");
		contentPane.add(btnNewButton, "cell 1 3,alignx right");
		
		JButton btnNewButton_1 = new JButton("Delete");
		contentPane.add(btnNewButton_1, "cell 2 3");
		
		setVisible(true);
	}

}
