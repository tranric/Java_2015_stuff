package testing;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Testing { 
//The class name here needs to be changed if the java file isn't titled Testing
    public static void main(String[] args) {
        boolean append = true;
        File newFile = new File("input.txt"); //Get file
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(newFile));
            String line = in.readLine();
            String data[];
            int counter;
            while (line != null)
            {
                data = line.split(" ");
                counter = data.length;
                System.out.println(counter);
                BufferedWriter exportFile = new BufferedWriter(new FileWriter("output.txt", append));
                //Export file
                exportFile.write(Integer.toString(counter));
                exportFile.close();
                line = in.readLine();
            }
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "FILE COULD NOT BE FOUND","", JOptionPane.ERROR_MESSAGE);
            //Display error if file could not be found
        }
    }
}