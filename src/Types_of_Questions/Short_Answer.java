package Types_of_Questions;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

public class Short_Answer extends JPanel {

	private JPanel panel, labelPanel, txtPanel;
	private JScrollPane scrPane;
	private JTextField textField;;
	private JLabel label;
	private TextArea textArea;
	private PrintWriter out;

	private ArrayList<JLabel> labelList = new ArrayList<JLabel>();
	private ArrayList<JTextField> fieldList = new ArrayList<JTextField>();
	private String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I",
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
			"W", "X", "Y", "Z" };
	int i = 1;

	private ArrayList<String> data = new ArrayList<String>();
	private ArrayList<String> data2 = new ArrayList<String>();

	int n = 0;

	public Short_Answer() {
		setLayout(new MigLayout("", "[112.00,right][260.00,grow]",
				"[]10[188.00,grow,top][][]"));

		JLabel lblNewLabel = new JLabel("Quistion Titil (optional) ");
		add(lblNewLabel, "cell 0 0,alignx trailing");

		textField = new JTextField();
		add(textField, "cell 1 0,growx");
		textField.setColumns(10);

		JLabel lblQuistion = new JLabel("Quistion");
		add(lblQuistion, "cell 0 1,alignx right");

		textArea = new TextArea();
		add(textArea, "cell 1 1,grow");

		JLabel lblAnswer = new JLabel("Answer");
		add(lblAnswer, "cell 0 2");

		panel = new JPanel();
		panel.setLayout(new MigLayout("", "[right][grow]", "[]"));
		panel.setBorder(new TitledBorder(new LineBorder(
				new Color(171, 173, 179)), "", TitledBorder.LEFT,
				TitledBorder.TOP, null, null));

		scrPane = new JScrollPane(panel);
		add(scrPane, "cell 1 2,grow");

		labelPanel = new JPanel(new GridLayout(i, 1, 0, 5));
		txtPanel = new JPanel(new GridLayout(i, 1, 0, 5));

		labelList.add(new JLabel(letters[i - 1]));
		fieldList.add(new JTextField());

		setAddAnswer(i);

		JButton btnSaveQuestion = new JButton("Save Question");
		add(btnSaveQuestion, "flowx,cell 1 3,growy");
		btnSaveQuestion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				String qusetionTitle = textField.getText();
				String qusetionQ = textArea.getText();

				try {

					out = new PrintWriter(new BufferedWriter(new FileWriter(
							"Gift_ExamQ_Format.txt", true)));

					out.append("\n::" + qusetionTitle + "::" + qusetionQ + "{");

					for (int x = 0; x < fieldList.size(); x++) {

						out.append("=" + fieldList.get(x).getText() + " ");

					}

					out.append(" S. ");

					for (int x = 0; x < fieldList.size() - 1; x++) {

						out.append(fieldList.get(x).getText() + " = ");

					}
					out.append(fieldList.get(fieldList.size() - 1).getText());
					out.append("}");
					out.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				} finally {

					textField.setText("");
					textArea.setText("");
					JOptionPane.showMessageDialog(null,
							"Question has been saved");
				}
			}
		});

		JButton addAnswer = new JButton("Add Answare");
		add(addAnswer, "cell 1 3,alignx right,growy");

		panel.add(labelPanel);
		panel.add(txtPanel, "grow, wrap");

		JButton delAnswer = new JButton("Delete");
		add(delAnswer, "cell 1 3,alignx left");

		delAnswer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (i > 1) {
					i--;
					setDelAnswer(i);
					scrPane.updateUI();
				} else
					JOptionPane.showMessageDialog(null,
							"You must have at least one answer");

			}
		});

		addAnswer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				n++;
				i++;
				labelList.add(new JLabel(letters[i - 1]));
				fieldList.add(new JTextField());
				setAddAnswer(i);
				scrPane.updateUI();

			}
		});

	}

	private void setAddAnswer(int i) {

		labelPanel.setLayout((new GridLayout(i, 1, 0, 5)));
		txtPanel.setLayout((new GridLayout(i, 1, 0, 5)));

		for (int x = 0; x < i; x++) {

			labelPanel.add(labelList.get(x));
			txtPanel.add(fieldList.get(x));

		}
	}

	private void setDelAnswer(int i) {

		labelPanel.setLayout((new GridLayout(i, 1, 0, 5)));
		txtPanel.setLayout((new GridLayout(i, 1, 0, 5)));

		labelPanel.remove(labelList.get(i));
		txtPanel.remove(fieldList.get(i));

	}

}
