package in.co.rays.ctl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.VehicleBean;
import in.co.rays.model.VehicleModel;

@WebServlet("/VehicleListCtl")
public class VehicleListCtl extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		VehicleBean bean = null;
		VehicleModel model =new VehicleModel();
		try {
			List list = model.search(bean);
			req.setAttribute("list", list);
			RequestDispatcher rd = req.getRequestDispatcher("VehicleListView.jsp");
			rd.forward(req, resp);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		VehicleBean bean = null;
		String op = req.getParameter("operation");
		VehicleModel model = new VehicleModel();
		
		
		if(op.equals("delete")) {
			String [] ids = req.getParameterValues("ids");
			if(ids!=null && ids.length>0) {
				for (String id : ids) {
					try {
						model.delete(Integer.parseInt(id));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		if(op.equals("search")) {
			bean = new VehicleBean();
			String date = req.getParameter("purchaseDate");
			try {
				bean.setPurchaseDate(sdf.parse(date));
			} catch (ParseException e) {
				e.printStackTrace();
			}
	
}
		
		
		
		try {
			List list = model.search(bean);
			req.setAttribute("list", list);
			RequestDispatcher rd = req.getRequestDispatcher("VehicleListView.jsp");
			rd.forward(req, resp);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
