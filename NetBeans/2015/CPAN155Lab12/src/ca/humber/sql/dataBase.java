package ca.humber.sql;
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
            stmt.executeQuery("DROP TABLE n01027509_orders");
            stmt.execute("CREATE TABLE n01027509_orders ("
                    + "Customer VARCHAR(32),"
                    + "Products VARCHAR(16), "
                    + "Price SMALLINT)");
        } 
    }
    public void insertData() throws SQLException {
        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate("INSERT INTO n01027509_orders (Customer, Products, Price) VALUES ('Washington', 'Dress', 119)");
            stmt.executeUpdate("INSERT INTO n01027509_orders (Customer, Products, Price) VALUES ('Adams', 'Shirt', 55)");
            stmt.executeUpdate("INSERT INTO n01027509_orders (Customer, Products, Price) VALUES ('Adams', 'Tie', 22)");
            stmt.executeUpdate("INSERT INTO n01027509_orders (Customer, Products, Price) VALUES ('Washington', 'Blouse', 75)");
            stmt.executeUpdate("INSERT INTO n01027509_orders (Customer, Products, Price) VALUES ('Franklin', 'Hat', 33)");
            stmt.executeUpdate("INSERT INTO n01027509_orders (Customer, Products, Price) VALUES ('Livingston', 'Gloves', 19)");
            stmt.executeUpdate("INSERT INTO n01027509_orders (Customer, Products, Price) VALUES ('Livingston', 'Pants', 89)");
            stmt.executeUpdate("INSERT INTO n01027509_orders (Customer, Products, Price) VALUES ('Read', 'Dress', 99)");
        }
    }
    public void queryDB() throws SQLException {
        try (Statement stmt = con.createStatement()) {
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM n01027509_orders")) {
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