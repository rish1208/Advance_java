package in.co.rays.ctl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.VehicleBean;
import in.co.rays.model.VehicleModel;

@WebServlet("/VehicleCtl")
public class VehicleCtl extends HttpServlet {
	
	@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		VehicleBean bean = null;
		
		String id = req.getParameter("id");
		if(id!=null) {
			VehicleModel model = new VehicleModel();
			try {
				bean = model.findBypk(Integer.parseInt(id));
				
				
			} catch (Exception e) {
			}	
		}
		
		req.setAttribute("bean", bean);
		RequestDispatcher rd = req.getRequestDispatcher("VehicleView.jsp");
		rd.forward(req, resp);
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		VehicleBean bean = new VehicleBean();
		VehicleModel model = new VehicleModel();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String purchase = req.getParameter("purchaseBy");
		String date = req.getParameter("purchaseDate");
		String company = req.getParameter("company");
		String manufactured = req.getParameter("manufacturedBy");
		String op = req.getParameter("operation");
		
		if(id!=null && !(id.equals(""))) {
			bean.setId(Integer.parseInt(id));
		}
		
		bean.setName(name);
		bean.setPurchaseBy(purchase);
		try {
			bean.setPurchaseDate(sdf.parse(date));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		bean.setCompany(company);
		bean.setManufacturedBy(manufactured);

if (op.equals("save")) {
	try {
		model.add(bean);
		req.setAttribute("msg", "data added successfully....");
		System.out.println("in save");
	} catch (Exception e) {
		e.printStackTrace();
	}
}

if (op.equals("update")) {

	try {
		model.update(bean);
		bean = model.findBypk(bean.getId());
		req.setAttribute("bean", bean);
		req.setAttribute("msg","data updated successfully..!!!");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
RequestDispatcher rd = req.getRequestDispatcher("VehicleView.jsp");
rd.forward(req, resp);

}
}

