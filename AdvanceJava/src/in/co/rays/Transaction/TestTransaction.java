package in.co.rays.Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class TestTransaction {
	public static void main(String[]args) throws Exception{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance11", "root", "root");
//		conn.setAutoCommit(false);
//		Statement stmt = conn.createStatement();
		
//		int i = stmt.executeUpdate("insert into emp values(10, 'aja' , 3000)");
//		 i = stmt.executeUpdate("insert into emp values(11,'aja' , 2600)");
//		 i = stmt.executeUpdate("insert into emp values(11, 'vijay' , 2000)");
//		conn.commit();
//		conn.close();
//		System.out.println("Data inserted = " + i);
//		
		Connection conn= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance11", "root", "root");
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			
			int i = stmt.executeUpdate("insert into emp values(10, 'aja' , 3000)");
			 i = stmt.executeUpdate("insert into emp values(11,'aja' , 2600)");
			 i = stmt.executeUpdate("insert into emp values(11, 'vijay' , 2000)");
			conn.commit();
			conn.close();
			System.out.println("Data inserted = " + i);
			
		} catch (Exception e) {
		conn.rollback();
		}
	} 
}