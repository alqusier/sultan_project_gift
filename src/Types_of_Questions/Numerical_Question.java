package Types_of_Questions;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Numerical_Question extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public Numerical_Question() {
		// //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(100, 100, 808, 404);
		// contentPane = new JPanel();
		// contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// contentPane.setLayout(new BorderLayout(0, 0));
		// //setContentPane(contentPane);
		//
		// JPanel panel = new JPanel();
		// contentPane.add(panel, BorderLayout.CENTER);
		// panel.

		setLayout(new MigLayout("", "[][223.00,grow][91.00,grow][]",
				"[][153.00,grow][89.00,grow][35.00]"));

		JLabel lblQuestionTitleoptional = new JLabel(
				"Question Title (optional)");
		add(lblQuestionTitleoptional, "cell 0 0,alignx trailing");

		textField = new JTextField();
		add(textField, "cell 1 0 3 1,growx");
		textField.setColumns(10);

		JLabel lblQuestion = new JLabel("Question");
		add(lblQuestion, "cell 0 1,alignx right,aligny top");

		JTextArea textArea = new JTextArea();
		add(textArea, "cell 1 1 3 1,grow");

		JPanel panel_1 = new JPanel();
		add(panel_1, "cell 1 2 3 1,grow");
		panel_1.setLayout(new MigLayout("",
				"[][102.00,grow][85.00][63.00][117.00][grow][][][44.00][][]",
				"[][][]"));

		JLabel lblNewLabel = new JLabel("A");
		panel_1.add(lblNewLabel, "cell 0 0,alignx trailing");

		textField_1 = new JTextField();
		panel_1.add(textField_1, "cell 1 0,growx");
		textField_1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Tolerance +/-");
		panel_1.add(lblNewLabel_1, "cell 2 0");

		JSpinner spinner = new JSpinner();
		panel_1.add(spinner, "cell 3 0,growx");

		JLabel lblFeedback = new JLabel("FeedBack(optional)");
		panel_1.add(lblFeedback, "cell 4 0,alignx trailing");

		textField_4 = new JTextField();
		panel_1.add(textField_4, "cell 5 0,growx");
		textField_4.setColumns(10);

		JLabel label = new JLabel("%");
		panel_1.add(label, "cell 7 0");

		JSpinner spinner_3 = new JSpinner();
		panel_1.add(spinner_3, "cell 8 0,growx");

		JCheckBox chckbxNewCheckBox = new JCheckBox("Delete");
		panel_1.add(chckbxNewCheckBox, "cell 9 0");

		JLabel lblB = new JLabel("B");
		panel_1.add(lblB, "cell 0 1,alignx trailing");

		textField_2 = new JTextField();
		panel_1.add(textField_2, "cell 1 1,growx");
		textField_2.setColumns(10);

		JLabel lblTolerance = new JLabel("Tolerance +/-");
		panel_1.add(lblTolerance, "cell 2 1");

		JSpinner spinner_1 = new JSpinner();
		panel_1.add(spinner_1, "cell 3 1,growx");

		JLabel lblFeedbackoptional = new JLabel("FeedBack(optional)");
		panel_1.add(lblFeedbackoptional, "cell 4 1,alignx trailing");

		textField_5 = new JTextField();
		panel_1.add(textField_5, "cell 5 1,growx");
		textField_5.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("%");
		panel_1.add(lblNewLabel_2, "cell 7 1");

		JSpinner spinner_4 = new JSpinner();
		panel_1.add(spinner_4, "cell 8 1,growx");

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Delete");
		panel_1.add(chckbxNewCheckBox_1, "cell 9 1");

		JLabel lblC = new JLabel("C");
		panel_1.add(lblC, "cell 0 2,alignx trailing");

		textField_3 = new JTextField();
		panel_1.add(textField_3, "cell 1 2,growx");
		textField_3.setColumns(10);

		JLabel lblTolerance_1 = new JLabel("Tolerance +/-");
		panel_1.add(lblTolerance_1, "cell 2 2");

		JSpinner spinner_2 = new JSpinner();
		panel_1.add(spinner_2, "cell 3 2,growx");

		JLabel lblFeedbackoptional_1 = new JLabel("FeedBack(optional)");
		panel_1.add(lblFeedbackoptional_1, "cell 4 2,alignx trailing");

		textField_6 = new JTextField();
		panel_1.add(textField_6, "cell 5 2,growx");
		textField_6.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("%");
		panel_1.add(lblNewLabel_3, "cell 7 2");

		JSpinner spinner_5 = new JSpinner();
		panel_1.add(spinner_5, "cell 8 2,growx");

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Delete");
		panel_1.add(chckbxNewCheckBox_2, "cell 9 2");

		JButton btnSaveQuestion = new JButton("Save Question");
		add(btnSaveQuestion, "cell 1 3,alignx right");

		JButton btnNewButton = new JButton("Add answer");
		add(btnNewButton, "cell 2 3,alignx right");

		JButton btnNewButton_1 = new JButton("Delete Checked");
		add(btnNewButton_1, "cell 3 3");

		setVisible(true);
	}

}
