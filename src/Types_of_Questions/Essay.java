package Types_of_Questions;

import java.awt.TextArea;
import java.awt.TextField;
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

import net.miginfocom.swing.MigLayout;

public class Essay extends JPanel {
	private TextField jtfTitle;
	private TextArea textArea;

	public static PrintWriter out;

	public Essay() {

		setLayout(new MigLayout("", "[right][grow]",
				"[]10[252.00,grow,top][grow][]"));

		JLabel lblNewLabel = new JLabel("Question Titil (optional) ");
		add(lblNewLabel, "cell 0 0,alignx trailing");

		jtfTitle = new TextField();
		add(jtfTitle, "cell 1 0,growx");
		jtfTitle.setColumns(10);

		JLabel lblQuistion = new JLabel("Question");

		add(lblQuistion, "cell 0 1,alignx right");

		textArea = new TextArea();
		add(textArea, "cell 1 1,grow");

		JButton btnNewButton = new JButton("Save and Add a other Question");
		add(btnNewButton, "cell 1 3,alignx right");

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					out = new PrintWriter(new BufferedWriter(new FileWriter(
							"Gift_ExamQ_Format.txt", true)));
					String qusetionTitle = jtfTitle.getText();
					String qusetionQ = textArea.getText();

					out.append("\n::" + qusetionTitle + "::" + qusetionQ + "{}"
							+ "\n");
					out.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					jtfTitle.setText("");
					textArea.setText("");
					JOptionPane.showMessageDialog(null,
							"Question has been saved");
				}

			}
		});

	}
}
