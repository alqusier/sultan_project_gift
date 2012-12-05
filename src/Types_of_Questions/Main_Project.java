package Types_of_Questions;


	 
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;


	public class Main_Project {

		public static File file;
		public static PrintWriter out;

		/**
		 * @param args
		 * @throws IOException 
		 */
		public static void main(String[] args) throws IOException  {
			 
			JFrame frame = new JFrame();
			JTabbedPane tab = new JTabbedPane();
			frame.add(tab);
			
			tab.add("True False", new True_False());
			tab.add("Short Answer", new Short_Answer());
			tab.add("Multiple Choice", new Multiple_Choice());
			
			frame.setDefaultCloseOperation(3);
			frame.setSize(800,600);
			frame.setVisible(true);
			
			
		}
		



	}
