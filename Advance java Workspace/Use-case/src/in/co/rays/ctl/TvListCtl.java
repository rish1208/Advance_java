package in.co.rays.ctl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import in.co.rays.bean.TvBean;
import in.co.rays.bean.UserBean;
import in.co.rays.model.TvModel;
@WebServlet("/TvListCtl")
public class TvListCtl  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	int pageNo = 1;
	int PageSize = 5;
	TvModel model = new TvModel();
	try {
		List list = model.search(null, 1, 5);
		req.setAttribute("list", list);
		RequestDispatcher rd = req.getRequestDispatcher("TvListView.jsp");
		rd.forward(req, resp);
	} catch (Exception e) {
		
		e.printStackTrace();
	}

}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		TvBean bean = null;
		TvModel model = new TvModel();
		String cname = req.getParameter("channelName");
		 String op = req.getParameter("operation");
		 
		 if(op.equals("search")) {
			 bean = new TvBean();
			 bean.setChannelName(cname);
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
				RequestDispatcher rd = req.getRequestDispatcher("TvListView.jsp");
				rd.forward(req, resp);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	}
	}
