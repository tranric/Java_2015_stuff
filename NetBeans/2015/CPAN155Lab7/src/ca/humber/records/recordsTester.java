package ca.humber.records;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class recordsTester {
        public static void main(String[] args) {
            File fInput = new File("C:\\Users\\Nickolaus\\Documents\\Projects\\Java\\NetBeans\\CPAN115Lab7\\people.txt");
            try{
                copyPossion();
            }   catch(IOException e){System.out.println(e.getMessage());}
        }
    public static void copyPossion() throws IOException {
        try( BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Nickolaus\\Documents\\Projects\\Java\\NetBeans\\CPAN115Lab7\\people.txt"))) {
            String line;
            String info[];
            int count = 0;
            while ((line = in.readLine()) != null) {
                if (line.contains("Professor")){
                    count+=1;
                    info[count]=(line);
                }else
                if (line.contains("Student")){
                    count+=1;                    
                }
            }
        }
    }
}