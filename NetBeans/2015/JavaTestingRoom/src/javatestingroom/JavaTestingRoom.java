import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JavaTestingRoom {
    public static void main(String[] args) {
try {
    int a = 1;
    for (int i = -1; i < 2 ; i++) {
        a = (a / i);
        System.out.print(i);
    }
}
catch(ArithmeticException e) {          
    System.out.print("0");
} finally {
    System.out.print("-1");
}
    }}