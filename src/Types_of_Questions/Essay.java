package Types_of_Questions;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Essay extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
  	public Essay() {
  		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		//setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setLayout(new MigLayout("", "[][grow]", "[][221.00,grow][grow]"));
		
		JLabel lblNewLabel = new JLabel("Quistion Titil (optional)");
		add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Qusition");
		add(lblNewLabel_1, "cell 0 1,alignx right,aligny top");
		
		JTextArea textArea = new JTextArea();
		add(textArea, "cell 1 1,grow");
		
		JButton btnSaveAndAdd = new JButton("Save and Add Question");
		add(btnSaveAndAdd, "cell 1 2,alignx center");
		
		setVisible(true);
	}

}
