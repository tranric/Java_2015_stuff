import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		boolean append = true;
		
		File f = new File("people.txt");
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(f));
			String line = in.readLine();
			String data[];
			while (line != null)
			{
				//Know what the data in the file is split by
				data = line.split(", ");
				//Output the name and type
				if (data[0].equalsIgnoreCase("Professor")) {
					System.out.println(data[1] + data[2]);
					BufferedWriter out = new BufferedWriter(new FileWriter("professor.txt", append));
					out.newLine();
					out.write(data[1] + data[2]);
					out.close();
				}
				else if (data[0].equalsIgnoreCase("Student")) {
					System.out.println(data[1] + data[2]);
					BufferedWriter out = new BufferedWriter(new FileWriter("student.txt", append));
					out.newLine();
					out.write(data[1] + data[2]);
					out.close();
				}
				//Move on to the next line
				line = in.readLine();
			}

		}
		catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "The file could not be found!", "Error!", JOptionPane.ERROR_MESSAGE);
		}
	}
}
