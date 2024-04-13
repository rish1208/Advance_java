package in.co.rays.model;

import java.text.SimpleDateFormat;

import in.co.rays.bean.UserBean;

public class TestModel {
	public static void main(String[]args) throws Exception {
		testAdd();
	}

		
	
public static void testAdd() throws Exception{
	UserBean bean = new UserBean();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	bean.setId(7);
	bean.setFirstName("mno");
	bean.setLastName("zab");
	bean.setLoginId("mno@gmail.com");
	bean.setPassword("123");
	bean.setDob(sdf.parse("12/12/2024"));
	bean.setAddress("bhopal");
	
	UserModel model = new UserModel();
	System.out.println("Login");
		model.add(bean);
	
}
}
