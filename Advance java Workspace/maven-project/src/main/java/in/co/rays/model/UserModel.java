package in.co.rays.model;




import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import in.co.rays.bean.UserBean;

public class UserModel {
	
	public void add(UserBean bean)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratise","root", "root");
		PreparedStatement pstmt = conn.prepareStatement("insert into user values (?,?,?,?,?,?,?)");
		
		pstmt.setInt(1, bean.getId());
		pstmt.setString(2, bean.getFirstName());
		pstmt.setString(3, bean.getLastName());
		pstmt.setString(4, bean.getLoginId());
		pstmt.setString(5, bean.getPassword());
		pstmt.setDate(6, new java.sql.Date(bean.getDob().getTime()) );
		pstmt.setString(7, bean.getAddress());
		
		int i= pstmt.executeUpdate();
		System.out.println("data inserted" + i);
		
	}
}
	
//	public void add(UserBean bean)throws Exception{
//        Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratise", "root", "root");
//	PreparedStatement pstmt = conn.prepareStatement("insert into user values (?,?,?,?,?,?,?)");
//		
//	pstmt.setInt(1, bean.getId());
//	pstmt.setString(2, bean.getFirstName());
//	pstmt.setString(3, bean.getLastName());
//	pstmt.setString(4, bean.getLoginId());
//	pstmt.setString(5, bean.getPassword());
//	pstmt.setDate(6, new java.sql.Date(bean.getDob().getTime()) );
//	pstmt.setString(7, bean.getAddress());
//	
//	 int i =  pstmt.executeUpdate();
//	 System.out.println("data inserted");
//	}
//
//}
