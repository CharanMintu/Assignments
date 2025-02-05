package jdbc_demo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/techM?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "SPADEVENOM";
        
        Connection con = null;
        Statement st = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();

            // Corrected INSERT statement (check for correct column types in your table)
            int result = st.executeUpdate("INSERT INTO dept (deptid, deptname, loc) VALUES (105, 'rstw', 'tamilnadu')");
            
            // Checking the result of the insert
            if (result > 0) {
                System.out.println("Insert successful");
            } else {
                System.out.println("Insert unsuccessful");
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources to avoid memory leaks
            try {
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
