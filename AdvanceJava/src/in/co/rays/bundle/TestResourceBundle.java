package in.co.rays.bundle;

import java.util.ResourceBundle;

public class TestResourceBundle {
	public static void main(String[]args) {
		
		ResourceBundle rb= ResourceBundle.getBundle("in.co.rays.Bundle.system");
		
		System.out.println(rb.getString("Driver"));
		System.out.println(rb.getString("url"));
		System.out.println(rb.getString("username"));
		System.out.println(rb.getString("password"));
		System.out.println(rb.getString("initialpoolsize"));
		System.out.println(rb.getString("maxpoolsize"));
		System.out.println(rb.getString("acquireincrement"));	
	}

}
 