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
import javax.swing.JSpinner;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Multiple_Choice extends JPanel {

	private JTextField questionTitle_multi;
	private JTextField choiseTextFilde1;
	private JTextField choiseTextFilde2;
	private JTextField choiseTextFilde3;
	private JTextField choiseTextFilde4;
	public static PrintWriter out;

	public Multiple_Choice() {

		setLayout(new MigLayout("", "[][289.00px,grow][:40px:80px,grow]",
				"[][grow][][][][][][]"));

		JLabel lblQuestionTitleoptional_1 = new JLabel(
				"Question Title (optional)");
		add(lblQuestionTitleoptional_1, "cell 0 0,alignx right");

		questionTitle_multi = new JTextField();
		add(questionTitle_multi, "cell 1 0 2 1,growx");
		questionTitle_multi.setColumns(10);

		JLabel lblQuestion_1 = new JLabel("Question");
		add(lblQuestion_1, "cell 0 1,alignx right,aligny top");

		final TextArea textArea = new TextArea();
		add(textArea, "cell 1 1 2 1,grow");

		JLabel lblAnswer = new JLabel("Answer");
		add(lblAnswer, "cell 0 3,alignx trailing");

		choiseTextFilde1 = new JTextField();
		add(choiseTextFilde1, "flowx,cell 1 3,growx");
		choiseTextFilde1.setColumns(10);

		final JSpinner spinner = new JSpinner();
		add(spinner, "cell 2 3,growx");

		choiseTextFilde2 = new JTextField();
		add(choiseTextFilde2, "flowx,cell 1 4,growx");
		choiseTextFilde2.setColumns(10);

		final JSpinner spinner_1 = new JSpinner();
		add(spinner_1, "cell 2 4,growx");

		choiseTextFilde3 = new JTextField();
		add(choiseTextFilde3, "flowx,cell 1 5,growx");
		choiseTextFilde3.setColumns(10);

		final JSpinner spinner_2 = new JSpinner();
		add(spinner_2, "cell 2 5,growx");

		choiseTextFilde4 = new JTextField();
		add(choiseTextFilde4, "flowx,cell 1 6,growx");
		choiseTextFilde4.setColumns(10);

		final JSpinner spinner_3 = new JSpinner();
		add(spinner_3, "cell 2 6,growx");

		JButton btnAddAnotherMultiple = new JButton(
				"Save and Add Another Multiple Choice"); // Multi
		add(btnAddAnotherMultiple, "cell 1 7,alignx center");

		btnAddAnotherMultiple.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String qusetionTitle = questionTitle_multi.getText();
				String qusetionQ = textArea.getText();

				String choise1 = choiseTextFilde1.getText();
				String choise2 = choiseTextFilde2.getText();
				String choise3 = choiseTextFilde3.getText();
				String choise4 = choiseTextFilde4.getText();

				String mark1 = spinner.getValue().toString();
				String mark2 = spinner_1.getValue().toString();
				String mark3 = spinner_2.getValue().toString();
				String mark4 = spinner_3.getValue().toString();

				try {
					out = new PrintWriter(new BufferedWriter(new FileWriter(
							"Gift_ExamQ_Format.txt", true)));

					out.append("\n::" + qusetionTitle + "::" + qusetionQ + "{"
							+ "\n~%" + setzero(mark1) + "%" + choise1 + "\n~%"
							+ setzero(mark2) + "%" + choise2 + "\n~%"
							+ setzero(mark3) + "%" + choise3 + "\n~%"
							+ setzero(mark4) + "%" + choise4 + "\n}" + "\n");
					out.close();

					questionTitle_multi.setText("");
					textArea.setText("");

					choiseTextFilde1.setText("");
					choiseTextFilde2.setText("");
					choiseTextFilde3.setText("");
					choiseTextFilde4.setText("");
					JOptionPane.showMessageDialog(null,
							"Question has been saved");

					spinner.setValue(0);
					spinner_1.setValue(0);
					spinner_2.setValue(0);
					spinner_3.setValue(0);

				} catch (IOException e) {
					e.printStackTrace();
				}

			}

			private String setzero(String mark) {
				if (mark.compareTo("0") == 0) {
					mark = "-100";
					return mark;
				} else
					return mark;

			}
		});

	}

}
