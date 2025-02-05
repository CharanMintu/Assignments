package jdbc_demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class assign {
	static String url = "jdbc:mysql://localhost:3306/techM?autoReconnect=true&useSSL=false";
    static String user = "root";
    static String password = "SPADEVENOM";


	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
			Connection con=DriverManager.getConnection(url,user,password);
			boolean exit=true;
			
			while(exit) {
				System.out.println("Menu:");
                System.out.println("1. Insert a new Row");
                System.out.println("2. Update a Row");
                System.out.println("3. Delete a Row");
                System.out.println("4. Select the rows");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                
                switch(choice){
                case 1:
                	insertrow(con,sc);
                	break;
                case 2:
                	updaterow(con,sc);
                	break;
                case 3:
                	deleterow(con,sc);
                	break;
                case 4:
                	selectrow(con,sc);
                	break;
                case 5:
                	exit=false;
                	break;
                default:
                	System.out.println("invalid");
                }

				
			}
		}catch(Exception e) {}
		
				
				
		
		// TODO Auto-generated method stub

	}


	private static void selectrow(Connection con, Scanner sc) throws SQLException {
		// TODO Auto-generated method stub
		String sql="select * from dept";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("Dept ID: " + rs.getInt("deptid"));
            System.out.println("Dept Name: " + rs.getString("deptname"));
            System.out.println("Location: " + rs.getString("loc"));
            System.out.println("-------------");
		}
		
		
	}


	private static void deleterow(Connection con, Scanner sc) throws SQLException {
		// TODO Auto-generated method stub
		String sql="DELETE FROM dept WHERE deptid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		
		System.out.print("Enter Dept ID to delete: ");
        int deptid = sc.nextInt();
        ps.setInt(1, deptid);
        int result=ps.executeUpdate();
        if(result>0) {
        	System.out.println("success");
        }else System.out.println("not successful");
	}


	private static void updaterow(Connection con, Scanner sc) throws SQLException {
		// TODO Auto-generated method stub
		String sql="UPDATE dept SET deptname=?,loc=? WHERE deptid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		
        System.out.print("Enter Dept ID to update: ");
        int deptid = sc.nextInt();
        System.out.print("Enter new Dept Name: ");
        String deptname = sc.next();
        System.out.print("Enter new Location: ");
        String loc = sc.next();
        
        ps.setString(1, deptname);
        ps.setString(2, loc);
        ps.setInt(3, deptid);
		
		int result=ps.executeUpdate();
		if(result>0) {
			System.out.println("success");
		}else
		System.out.println("fail");

	}
	


	public static void insertrow(Connection con, Scanner sc) throws SQLException {
		String sql="INSERT INTO dept (deptid,deptname,loc) VALUES(?,?,?)";
		PreparedStatement ps=  con.prepareStatement(sql);
		
        System.out.print("Enter Dept ID: ");
        int deptid = sc.nextInt();
        System.out.print("Enter Dept Name: ");
        String deptname = sc.next();
        System.out.print("Enter Location: ");
        String loc = sc.next();
        
        ps.setInt(1, deptid);
        ps.setString(2, deptname);
        ps.setString(3, loc);
        
        int result=ps.executeUpdate();
        if (result > 0) {
            System.out.println("Insert successful");
        } else {
            System.out.println("Insert unsuccessful");
        }

		
	}

}
