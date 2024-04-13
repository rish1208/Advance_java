package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;
@WebServlet("/LoginCtl")
public class LoginCtl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("LoginView.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("loginId");
		String pass = req.getParameter("password");
		UserModel model = new UserModel();
		try {
			UserBean bean = model.Authentication(login, pass);
			if(bean !=null) {
			resp.sendRedirect("Welcome.jsp");
			}
			else {
				System.out.println("invalid");
				RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
				rd.forward(req, resp);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	

}
