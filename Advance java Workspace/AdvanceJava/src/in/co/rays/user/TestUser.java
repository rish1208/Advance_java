package in.co.rays.user;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUser {

	public static void main(String[] args) throws Exception {

         // testAdd();
          //  testUpdate();
    	// testDelete();
		// testFindByPk();
		 //testSearch();
             testAuth();

	}
	private static void testFindByPk() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.findByPk(2);

		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getLoginId());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());
		System.out.println(bean.getAddress());
	}
	
	private static void testAuth() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.authenticate("abc@gmail.com", "1234");

		if (bean != null) {

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getAddress());

		} else {
			System.out.println("login id & password is invalid...!!");
		}

	}

	private static void testDelete() throws Exception {

		UserModel model = new UserModel();

		UserBean existBean = model.findByPk(3);

		if (existBean != null) {
			model.delete(existBean.getId());
		} else {
			System.out.println("Id not found...!!!");
		}

	}

	private static void testUpdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		UserModel model = new UserModel();

		UserBean bean = model.findByPk(1);

		bean.setFirstName("rohit");
//		bean.setLoginId("");
//		bean.setDob(new Date());

		model.update(bean);

	}

	private static void testSearch() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		UserBean bean = new UserBean();
		// bean.setFirstName("a");
		// bean.setDob(sdf.parse("12/01/2024"));

		UserModel model = new UserModel();

		List list = model.search(bean, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (UserBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getAddress());
		}
	}

	private static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		UserBean bean = new UserBean();
		bean.setFirstName("raj");
		bean.setLastName("Dwivedi");
		bean.setLoginId("raj@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("01/11/2024"));
		bean.setAddress("indore");
		
		UserBean bean1 = new UserBean();
		bean1.setFirstName("Jitu");
		bean1.setLastName("sharma");
		bean1.setLoginId("jitu@gmail.com");
		bean1.setPassword("1234");
		bean1.setDob(sdf.parse("11/10/2023"));
		bean1.setAddress("indore");
		
		UserBean bean2 = new UserBean();
		bean2.setFirstName("Dev");
		bean2.setLastName("sharma");
		bean2.setLoginId("dev@gmail.com");
		bean2.setPassword("12345");
		bean2.setDob(sdf.parse("10/10/2022"));
		bean2.setAddress("indore");

 List<UserBean> list= new ArrayList<UserBean>();
 list.add(bean);
 list.add(bean1);
 list.add(bean2);
for (int i = 0; i < list.size(); i++) {
	UserModel model = new UserModel();

	UserBean existBean = model.findByLogin((list.get(i)).getLoginId());

	if (existBean != null) {
		System.out.println("Login ID already exist...!!!");
	} else {
		model.add( list.get(i));
	}
}
		

	}

}
