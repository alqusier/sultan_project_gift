package Types_of_Questions;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Matching extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	public static PrintWriter out;
	private TextArea textArea;

	public Matching() {

		setLayout(new MigLayout("", "[][277.00,grow][123.00,center][80.00]",
				"[][206.00,grow][92.00,grow][]"));

		JLabel lblNewLabel = new JLabel("Quistion Titil (optional)");
		add(lblNewLabel, "cell 0 0,alignx trailing");

		textField = new JTextField();
		add(textField, "cell 1 0 3 1,growx");
		textField.setColumns(10);

		JLabel lblQuistion = new JLabel("Quistion");
		add(lblQuistion, "cell 0 1,alignx right,aligny top");

		final TextArea textArea = new TextArea();
		add(textArea, "cell 1 1 3 1,grow");

		JPanel panel = new JPanel();
		add(panel, "cell 1 2 3 1,grow");
		panel.setLayout(new MigLayout("",
				"[][227.00,grow][2.00,grow][142.00,grow][]", "[][][][]"));

		JLabel lblA = new JLabel("A");
		panel.add(lblA, "cell 0 0,alignx trailing");

		textField_1 = new JTextField();
		panel.add(textField_1, "cell 1 0,growx");
		textField_1.setColumns(10);

		JLabel lblA_1 = new JLabel("A");
		panel.add(lblA_1, "cell 2 0,alignx center");

		textField_4 = new JTextField();
		panel.add(textField_4, "cell 3 0 2 1,growx");
		textField_4.setColumns(10);

		JLabel lblB = new JLabel("B");
		panel.add(lblB, "cell 0 1,alignx trailing");

		textField_2 = new JTextField();
		panel.add(textField_2, "cell 1 1,growx");
		textField_2.setColumns(10);

		JLabel lblB_1 = new JLabel("B");
		panel.add(lblB_1, "cell 2 1,alignx center");

		textField_5 = new JTextField();
		panel.add(textField_5, "cell 3 1 2 1,growx");
		textField_5.setColumns(10);

		JLabel lblC = new JLabel("C");
		panel.add(lblC, "cell 0 2,alignx trailing");

		textField_3 = new JTextField();
		panel.add(textField_3, "cell 1 2,growx");
		textField_3.setColumns(10);

		JLabel lblC_1 = new JLabel("C");
		panel.add(lblC_1, "cell 2 2,alignx center");

		textField_6 = new JTextField();
		panel.add(textField_6, "cell 3 2 2 1,growx");
		textField_6.setColumns(10);

		JButton btnSaveQusetion = new JButton("Save and Add  Qusetion");
		add(btnSaveQusetion, "cell 1 3,alignx center");
		btnSaveQusetion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					out = new PrintWriter(new BufferedWriter(new FileWriter(
							"Gift_ExamQ_Format.txt", true)));

					String qusetionQ = textArea.getText();

					out.append("\n::" + textField.getText().toString() + "::"
							+ qusetionQ + "  . {\n" + "="
							+ textField_1.getText().toString() + "  ->  "
							+ textField_4.getText().toString() + "\n" + "="
							+ textField_2.getText().toString() + "  ->  "
							+ textField_5.getText().toString() + "\n" + "="
							+ textField_3.getText().toString() + "  ->  "
							+ textField_6.getText().toString() + "\n}");
					out.close();

				} catch (IOException e) {

					e.printStackTrace();
				} finally {
					textField.setText("");
					textArea.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					JOptionPane.showMessageDialog(null,
							"Question has been saved");
				}

			}
		});

	}

}
