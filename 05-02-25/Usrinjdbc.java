package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Usrinjdbc {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/techM?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "SPADEVENOM";
        
        int deptid;
        String deptname;
        String loc;
        
        Connection con = null;
        Statement st = null;
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Dept ID: ");
        deptid = sc.nextInt();
        System.out.print("Enter Dept Name: ");
        deptname = sc.next();
        System.out.print("Enter Location: ");
        loc = sc.next();
        
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            
            // Corrected SQL query with user inputs
            String sql = "INSERT INTO dept (deptid, deptname, loc) VALUES ("+deptid+",'"+deptname+"','"+loc+"')";
            
            // Execute the query
            int result = st.executeUpdate(sql);
            
            if (result > 0) {
                System.out.println("Insert successful");
            } else {
                System.out.println("Insert unsuccessful");
            }
            
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (st != null) st.close();
                if (con != null) con.close();
                sc.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
