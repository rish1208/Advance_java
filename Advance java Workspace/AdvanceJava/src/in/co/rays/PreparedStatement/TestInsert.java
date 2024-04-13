package in.co.rays.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class TestInsert {
	public static void main(String[]args)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance11", "root","root");
	    PreparedStatement ps = conn.prepareStatement("insert into emp values(4,'mno',4000)");
	    ps.execute();
	    System.out.println("Data inserted");
	}

}
