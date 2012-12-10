package Types_of_Questions;

import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

public class True_False extends JPanel {
	private JTextField textfildeTitle;
	private JButton btnAddAnpther;
	private char answer;
	public static PrintWriter out;

	public True_False() throws IOException {

		setLayout(new MigLayout("", "[grow]", "[][grow]"));

		JPanel panel = new JPanel();
		panel.setLayout(new MigLayout("",
				"[100.00px][108.00px][410px,grow][218px]",
				"[28px][169px,grow][29px][29px][29px]"));

		JLabel lblQuestionTitleoptional = new JLabel(
				"Question Title (optional)"); // //true
		panel.add(lblQuestionTitleoptional,
				"cell 0 0,alignx right,aligny center");

		textfildeTitle = new JTextField();
		panel.add(textfildeTitle, "cell 1 0 3 1,growx,aligny top");
		textfildeTitle.setColumns(10);

		JLabel lblQuestion = new JLabel("Question");
		panel.add(lblQuestion, "cell 0 1,alignx right,aligny top");

		JRadioButton rdbtnTrue = new JRadioButton("True");
		JRadioButton rdbtnFalse = new JRadioButton("Fales");
		rdbtnFalse.addActionListener(new myAction());
		rdbtnTrue.addActionListener(new myAction());

		JPanel radioPanelGroup = new JPanel();

		radioPanelGroup.setLayout(new MigLayout("", "[grow 99]", "[grow 99]"));
		radioPanelGroup.setBorder(BorderFactory.createLineBorder(Color.black));
		TitledBorder title = BorderFactory.createTitledBorder("Answer");
		radioPanelGroup.setBorder(title);

		radioPanelGroup.add(rdbtnTrue);
		radioPanelGroup.add(rdbtnFalse);

		ButtonGroup ttt = new ButtonGroup();
		ttt.add(rdbtnTrue);
		ttt.add(rdbtnFalse);

		JButton btnCancelclearQuestionText = new JButton(
				"Cancel/Clear Question Text");
		btnCancelclearQuestionText.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textfildeTitle.setText("");

			}
		});

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "cell 1 1 3 1,grow");
		panel_1.setLayout(new MigLayout("", "[grow]", "[grow]"));

		final TextArea textArea = new TextArea();
		panel_1.add(textArea, "cell 0 0,grow");
		panel.add(btnCancelclearQuestionText,
				"cell 3 2,alignx right,aligny top");

		btnAddAnpther = new JButton("Save and Add another True/False Question"); // True

		btnAddAnpther.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String qusetionTitle = textfildeTitle.getText();
				String qusetionQ = textArea.getText();

				try {
					out = new PrintWriter(new BufferedWriter(new FileWriter(
							"Gift_ExamQ_Format.txt", true)));

					out.append("\n::" + qusetionTitle + "::" + qusetionQ + "{"
							+ answer + "}" + "\n");
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				} finally {

					textfildeTitle.setText("");
					textArea.setText("");
					JOptionPane.showMessageDialog(null,
							"Question has been saved");
				}

			}
		});

		panel.add(btnAddAnpther, "cell 0 4 2 1,alignx left,aligny top");

		panel.add(radioPanelGroup, "cell 1 2 3 1,alignx left,aligny top");

		add(panel);
		setVisible(true);

	}

	public class myAction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "True") {
				answer = 'T';

			} else
				answer = 'F';

		}

	}

}
