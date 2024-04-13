package in.co.rays.model;

import java.text.SimpleDateFormat;

import in.co.rays.bean.UserBean;

public class Test {
	public static void main(String[] args) throws Exception {
//		testadd();
//		testupdate();
//		testdelete();
//		testfindByPk();
//		testAuth();
		testsearch();
		
	}

	private static void testsearch() {
		
		
	}

	private static void testAuth() throws Exception {
		UserModel model = new UserModel();
		UserBean bean = model.authenticate("rishendra@gmail.com", "123");
		if(bean !=null) {
		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getLoginId());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());
		System.out.println(bean.getAddress());
		}
		else {
			System.out.println("LoginId and password is invalid");
		}
		
		
	}

	private static void testfindByPk()throws Exception {
		
		
		UserModel model = new UserModel();
		UserBean bean = model.findByPk(1);
		
		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getLoginId());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());
		System.out.println(bean.getAddress());
		
		
	}

	private static void testdelete()throws Exception {
		UserBean bean = new UserBean();
		bean.setId(5);
		UserModel model = new UserModel();
		System.out.println("data delete started");
				model.delete(bean.getId());
		
		
	}

	private static void testupdate()throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		UserBean bean = new UserBean();
		
	
		bean.setFirstName("rishe");
		bean.setLastName("dwivedi");
		bean.setLoginId("rish@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("01/01/2020"));
		bean.setAddress("indore");
		bean.setId(1);
		
		UserModel model= new UserModel();
		System.out.println("data added started");
		model.update(bean);
	}

	private static void testadd() throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		UserBean bean = new UserBean();
		
		bean.setId(1);
		bean.setFirstName("rishe");
		bean.setLastName("dwivedi");
		bean.setLoginId("rish@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("01/01/2020"));
		bean.setAddress("indore");
		
		UserModel model= new UserModel();
		System.out.println("data added started");
		model.add(bean);
				
		
	}

}
