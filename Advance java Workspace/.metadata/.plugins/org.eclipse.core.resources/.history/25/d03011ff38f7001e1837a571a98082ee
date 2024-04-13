package in.co.rays.ctl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.DevloperBean;
import in.co.rays.bean.TvBean;
import in.co.rays.model.DevloperModel;




@WebServlet("/DevListCtl")
public class DevListCtl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int pageNo = 1;
		int PageSize = 5;
		DevloperModel model = new DevloperModel();
		try {
			List list = model.search(null, 1, 10);
			req.setAttribute("list", list);
			RequestDispatcher rd = req.getRequestDispatcher("DevloperListView.jsp");
			rd.forward(req, resp);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	DevloperBean bean = null;
	DevloperModel model = new DevloperModel();
	String dname = req.getParameter("devloperName");
	 String op = req.getParameter("operation");
	 
	 if(op.equals("search")) {
		 bean = new DevloperBean();
		 bean.setDevloperName(dname);
	 }
	 if (op.equals("delete")){
		 String[] ids = req.getParameterValues("ids");
		 if(ids !=null && ids.length>0) {
			 for(String id : ids)
				try {
					model.delete(Integer.parseInt(id));
				} catch (Exception e) {
					e.printStackTrace();
				}
				 
		 }
	 } 
	 try {
			List list = model.search(bean,1, 0);
			req.setAttribute("list", list);
			RequestDispatcher rd = req.getRequestDispatcher("DevloperListView.jsp");
			rd.forward(req, resp);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

}
}
