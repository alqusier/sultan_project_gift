package Types_of_Questions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Main_Project {

	public static File file;
	public static PrintWriter out;

	public static void main(String[] args) throws IOException {

		JFrame frame = new JFrame("Types_of_Questions");
		JTabbedPane tab = new JTabbedPane();
		frame.add(tab);
		File file = new File("Gift_ExamQ_Format.txt");
		file.delete();
		tab.add("Description", new Description_of_Exam());
		tab.add("True False", new True_False());
		tab.add("Short Answer", new Short_Answer());
		tab.add("Multiple Choice", new Multiple_Choice());
		tab.add("Math Range", new Math_Range());
		tab.add("Essay", new Essay());
		tab.add("Numerical Question", new Numerical_Question());
		tab.add("Matching", new Matching());

		frame.setDefaultCloseOperation(3);
		frame.setSize(800, 400);
		frame.setVisible(true);

	}

}
