package Types_of_Questions;

import java.awt.BorderLayout;
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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class Math_Range extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public static PrintWriter out;

	public Math_Range() {
		
		setBounds(100, 100, 908, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setLayout(new MigLayout(
				"",
				"[84.00][148.00,grow][][82.00,grow][51.00][66.00,grow,fill][67.00][grow][][grow]",
				"[][grow][]"));

		JLabel lblQusitionTitleoptional = new JLabel(
				"Qusition Title (optional)");
		add(lblQusitionTitleoptional, "cell 0 0,alignx trailing");

		textField = new JTextField();
		add(textField, "cell 1 0 9 1,growx");
		textField.setColumns(10);

		JLabel lblQusition = new JLabel("Qusition");
		add(lblQusition, "cell 0 1,alignx right,aligny top");

		final TextArea textArea = new TextArea();
		add(textArea, "cell 1 1 9 1,grow");

		JLabel lblAnswre = new JLabel("Answer");
		add(lblAnswre, "cell 2 2,alignx trailing");

		textField_1 = new JTextField();
		add(textField_1, "cell 3 2,growx");
		textField_1.setColumns(10);

		JLabel lblRange = new JLabel("Range  of Answer +/-");
		add(lblRange, "cell 4 2,alignx trailing");

		final JSpinner spinner = new JSpinner();
		add(spinner, "cell 5 2,growx");

		JLabel lblRangeOfMark = new JLabel("Range of Mark+/-");
		add(lblRangeOfMark, "cell 6 2,alignx trailing");

		final JSpinner spinner_1 = new JSpinner();
		add(spinner_1, "cell 7 2,growx");

		JButton btnNewButton = new JButton("Save and Add Question");
		add(btnNewButton, "cell 1 2,growx");
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					out = new PrintWriter(new BufferedWriter(new FileWriter(
							"Gift_ExamQ_Format.txt", true)));
					out.append("::" + textField.getText() + "::\n"
							+ textArea.getText() + " {#\n="
							+ textField_1.getText() + ":0" + "\n=%"
							+ spinner_1.getValue() + "%"
							+ textField_1.getText().toString() + ":"
							+ spinner.getValue() + "\n");

					out.append("}\n\n");
					out.close();

				} catch (IOException e) {
					e.printStackTrace();

				} finally {

					JOptionPane.showMessageDialog(null,
							"Question has been saved");
					textField.setText("");
					textArea.setText("");

					textField_1.setText("");
					spinner_1.setValue(0);
					spinner.setValue(0);
				}
			}
		});

	}

}
