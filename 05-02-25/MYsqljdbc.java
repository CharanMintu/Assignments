package jdbc_demo;

import java.sql.*;

public class MYsqljdbc {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/techM?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "SPADEVENOM";  // ⚠️ Consider storing in an environment variable

        // Try-with-resources to ensure proper resource management
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM jokers")
            		 ) {
        	

            // Process the result set
            while (rs.next()) {
                System.out.println("Dept ID: " + rs.getInt(1) + 
                                   ",Name: " + rs.getString(2) + 
                                   ", Location: " + rs.getString(3)+
                ",company: " + rs.getString(4));
            }

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
        
    }
}
