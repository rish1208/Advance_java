package in.co.rays.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("SecondServlet doGet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("SecondServlet doPost");

		System.out.println("SecondServlet firstName = " + req.getParameter("firstName"));

        System.out.println("SecondServlet lastName = " + req.getAttribute("lastName"));
        System.out.println("SecondServlet loginID=" + req.getAttribute("loginID"));

	}

}
