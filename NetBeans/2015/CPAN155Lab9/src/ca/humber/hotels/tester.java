package ca.humber.hotels;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class tester {
    public static void main(String[] args) {
        boolean allow = true;
        File hotelsFile = new File("Hotels.txt");
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(hotelsFile));
            String line = in.readLine();
            String data[] = new String[27];
            for (int i=0; i<data.length; i++){
                while (line != null){
                    data[i]=line; 
                    line = in.readLine();
                    i++;
                }
            }
            Arrays.sort(data);
            for(int i=0; i<data.length; i++){
                System.out.println(data[i]);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }
}