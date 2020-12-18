package ca.humber.store.maintains;
import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.io.FileReader;
import java.util.StringTokenizer;

public class tester {
    public static void main(String[] args) {
        File Sales = new File("Sales.txt");
        BufferedReader in;
        record[] record = new record[22];
        for(int counter = 0; counter<22; counter++ ){
            try{
                ArrayList<record> dataRecords = new ArrayList<record>();
                in = new BufferedReader(new FileReader(Sales));
                String line = in.readLine();
                int CustomerID, ProductID, SingleItemPrice, ItemsPurchased;
                String FirstName, LastName, ProductName;
                while (line != null ){
                    StringTokenizer st = new StringTokenizer(line, " ");
                    while (st.hasMoreTokens()) {
                        final String token = st.nextToken();
                    }
                    //dataRecords.add(FirstName,LastName,ProductName,CustomerID,ProductID,SingleItemPrice,ItemsPurchased);
                    System.out.println(line);
                    line = in.readLine();
                }
                counter++;
            }
            catch (IOException ex){
                JOptionPane.showMessageDialog(null, "FILE IS MISSING", "ERROR", JOptionPane.ERROR_MESSAGE);     
            }
        }
    }
}