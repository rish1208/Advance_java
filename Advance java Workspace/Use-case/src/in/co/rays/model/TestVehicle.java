package in.co.rays.model;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.VehicleBean;

public class TestVehicle {
	public static void main(String[] args) throws Exception {
//         testadd();
//		testupdate();
//		testdelete();
//		testfindbypk();
		testsearch();

		
		
		
	}

	private static void testsearch()throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		VehicleBean bean = new VehicleBean();
		bean.setPurchaseDate(sdf.parse("2024-01-01"));
		
		VehicleModel model = new VehicleModel();
		List list = model.search(bean);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			bean = (VehicleBean)it.next();
			if (bean !=null) {
				System.out.println(bean.getCompany());
						System.out.println(bean.getName());
						System.out.println(bean.getPurchaseDate());
		}
		
		}
	}

	private static void testfindbypk() throws Exception{
		VehicleModel model = new VehicleModel();
		VehicleBean bean = model.findByPk(1);
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getPurchaseBy());
		System.out.println(bean.getPurchaseDate());
		System.out.println(bean.getCompany());
		System.out.println(bean.getManufacturedBy());
		
	}

	private static void testdelete() throws Exception{
		VehicleBean bean = new VehicleBean();
		bean.setId(4);
		VehicleModel model = new VehicleModel();
		model.delete(bean.getId());
		System.out.println("data deleted");
		
	}

	private static void testupdate() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		VehicleBean bean = new VehicleBean();
		
		bean.setName("richa");
		bean.setPurchaseBy("rish");
		bean.setPurchaseDate(sdf.parse("01/01/2024"));
		bean.setCompany("xyz");
		bean.setManufacturedBy("abc");
		bean.setId(3);
		VehicleModel model = new VehicleModel();
		model.update(bean);
		System.out.println("data added");
		
		
	}

	private static void testadd() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		VehicleBean bean = new VehicleBean();
		bean.setId(1);
		bean.setName("rish");
		bean.setPurchaseBy("richa");
		bean.setPurchaseDate(sdf.parse("01/01/2024"));
		bean.setCompany("abc");
		bean.setManufacturedBy("xyz");
		
		VehicleModel model = new VehicleModel();
		model.add(bean);
		System.out.println("data added");
		
		
	}

}
