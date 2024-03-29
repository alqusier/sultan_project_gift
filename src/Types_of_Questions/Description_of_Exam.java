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
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Description_of_Exam extends JPanel {
	private TextArea textArea;

	public static PrintWriter out;

	public Description_of_Exam() {

		
		setLayout(new MigLayout("", "[right][grow]", "[252.00,grow,top][]"));
		JLabel lblNewLabel = new JLabel("Exam Titil");
		add(lblNewLabel, "cell 0 0,alignx trailing");
		
		final TextField textField = new TextField();
		add(textField, "cell 0 0,growx");
		textField.setColumns(10);

		JLabel lblQuistion = new JLabel("Description this Exam");

		add(lblQuistion, "cell 0 0,alignx right");

		textArea = new TextArea();
		add(textArea, "cell 1 0,grow");

		JButton btnNewButton = new JButton("Save and go to Questions");
		add(btnNewButton, "cell 1 1,alignx left");

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					out = new PrintWriter(new BufferedWriter(new FileWriter(
							"Gift_ExamQ_Format.txt", true)));
					
					out.append("Exam Title: " + textField.getText() +  "\nDescription: \n" + textArea.getText() + "\n");
					out.close();
					
//					out.append("\n::" + qusetionTitle + "::" + qusetionQ + "{}"
//							+ "\n");
//					out.close();

				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					
					textArea.setText("");
					textField.setText(" ");
					JOptionPane.showMessageDialog(null,
							"Description has been saved");
				}

			}
		});

	}
}
