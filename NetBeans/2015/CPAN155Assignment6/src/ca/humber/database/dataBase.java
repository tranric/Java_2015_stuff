package ca.humber.dataBase;
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
import oracle.jdbc.pool.OracleDataSource;

public class dataBase implements AutoCloseable {
    private final Connection con;
    public dataBase(String url) throws SQLException {
        OracleDataSource dataSourse = new OracleDataSource();
        dataSourse.setURL(url);
        con = dataSourse.getConnection();
    }
    public void createDB() throws SQLException {
        try (Statement stmt = con.createStatement()) {
            stmt.executeQuery("DROP TABLE n01027509_Accounts");
            stmt.execute("CREATE TABLE n01027509_Accounts ("
                    + "Account# VARCHAR(16),"
                    + "Balance# VARCHAR(5), "
                    + "Holds VARCHAR(16)");
        } 
    }
    public void insertData() throws SQLException {
        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate("");
        }
    }
    public void queryDB() throws SQLException {
        try (Statement stmt = con.createStatement()) {
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM n01027509_Accounts")) {
                System.out.println("CUSTOMER\tPRICE\n------------\t-----");
                while (rs.next()) {
                    System.out.println(rs.getString(1) + "    \t" + rs.getString(3));
                }
            }
        }
    }
    public void close() throws SQLException {
        con.close();
    }
        public static void main(String[] args) {
            File Sales = new File("Transactions.txt");
            BufferedReader in;
            record[] record = new record[12];
            for(int counter = 0; counter<12; counter++ ){
                try{
                ArrayList<record> dataRecords = new ArrayList<record>();
                in = new BufferedReader(new FileReader(Sales));
                String line = in.readLine();
                int Balance, AccountNumber;
                String HoldsOnAccount;
                while (line != null ){
                    StringTokenizer st = new StringTokenizer(line, " ");
                    while (st.hasMoreTokens()) {
                        final String token = st.nextToken();
                    }
                    System.out.println(line);
                    line = in.readLine();
                }
                counter++;
            }
            catch (IOException ex){
                JOptionPane.showMessageDialog(null, "FILE IS MISSING", "ERROR", JOptionPane.ERROR_MESSAGE);     
            }
            }
        try (dataBase db = new dataBase("jdbc:oracle:thin:n01027509/oracle@dilbert.humber.ca:1521:grok") ) {
            db.createDB();
            db.insertData();
            db.queryDB();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
            System.out.println(e.getSQLState());
        }
    }
}