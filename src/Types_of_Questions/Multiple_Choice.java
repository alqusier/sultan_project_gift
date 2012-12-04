package Types_of_Questions;

 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import net.miginfocom.swing.MigLayout;

public class Multiple_Choice {

	private JTextField questionTitle_multi;
	private JTextField choiseTextFilde1;
	private JTextField choiseTextFilde2;
	private JTextField choiseTextFilde3;
	private JTextField choiseTextFilde4;
	JTextPane question_mulit;
	private JFrame frame;
	public static PrintWriter out;

	public Multiple_Choice() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 966, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new MigLayout("", "[][700px,grow][:40px:80px,grow]", "[][grow][][][][][][][][]"));
		
		JLabel lblQuestionTitleoptional_1 = new JLabel("Question Title (optional)");
		panel_1.add(lblQuestionTitleoptional_1, "cell 0 0,alignx right");
		
		questionTitle_multi = new JTextField();
		panel_1.add(questionTitle_multi, "cell 1 0,growx,span");
		questionTitle_multi.setColumns(10);
		
		JLabel lblQuestion_1 = new JLabel("Question");
		panel_1.add(lblQuestion_1, "cell 0 1,alignx right,aligny top");
		
		question_mulit = new JTextPane();
		panel_1.add(question_mulit, "cell 1 1,grow,span");
		
//		JButton btnCancelclearQuestionText_1 = new JButton("Cancel/Clear Question Text");
//		panel_1.add(btnCancelclearQuestionText_1, "cell 1 2,alignx right");
		
//		JButton btnAddAnswer = new JButton("Add Answer");
//		panel_1.add(btnAddAnswer, "cell 0 3,alignx left");
		
		choiseTextFilde1 = new JTextField();
		panel_1.add(choiseTextFilde1, "flowx,cell 1 3,growx");
		choiseTextFilde1.setColumns(10);
		
		final JSpinner spinner = new JSpinner();
		panel_1.add(spinner, "cell 2 3,growx");
		
		choiseTextFilde2 = new JTextField();
		panel_1.add(choiseTextFilde2, "flowx,cell 1 4,growx");
		choiseTextFilde2.setColumns(10);
		
		final JSpinner spinner_1 = new JSpinner();
		panel_1.add(spinner_1, "cell 2 4,growx");
		
		choiseTextFilde3 = new JTextField();
		panel_1.add(choiseTextFilde3, "flowx,cell 1 5,growx");
		choiseTextFilde3.setColumns(10);
		
		final JSpinner spinner_2 = new JSpinner();
		panel_1.add(spinner_2, "cell 2 5,growx");
		
		choiseTextFilde4 = new JTextField();
		panel_1.add(choiseTextFilde4, "flowx,cell 1 6,growx");
		choiseTextFilde4.setColumns(10);
		
		final JSpinner spinner_3 = new JSpinner();
		panel_1.add(spinner_3, "cell 2 6,growx");
		
//		JButton btnSaveToTest_1 = new JButton("Save to test file");
//		panel_1.add(btnSaveToTest_1, "cell 0 7");
		JButton btnAddAnotherMultiple = new JButton("Save and Add Another Multiple Choice");	//Multi
		panel_1.add(btnAddAnotherMultiple, "cell 0 9 2097051 1");
		
		btnAddAnotherMultiple.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String qusetionTitle = questionTitle_multi.getText();
				String qusetionQ = question_mulit.getText();
				
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
							"ExamQ.txt", true)));
					
					out.append("::" + qusetionTitle + "::" + qusetionQ + "{"
							+ "\n~%" + setzero(mark1) +"%"+ choise1 + "\n~%" +setzero(mark2) + "%"+ choise2 + "\n~%" + 
							setzero(mark3) + "%"+ choise3+ "\n~%" + 
							setzero(mark4) + "%"+ choise4+"\n}" + "\n");
					out.close();
					
					
					questionTitle_multi.setText("");
					question_mulit.setText("");
					
					choiseTextFilde1.setText("");
					choiseTextFilde2.setText("");
					choiseTextFilde3.setText("");
					choiseTextFilde4.setText("");
					
					
					spinner.setValue(0);
					spinner_1.setValue(0);
					spinner_2.setValue(0);
					spinner_3.setValue(0);
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			private String setzero(String mark) {
				if(mark.compareTo("0")==0){
					mark = "-100";
					return mark;
				}else
					return mark;
				
				
			}
		});
		
		frame.add(panel_1);
		frame.setVisible(true);

	}

}
