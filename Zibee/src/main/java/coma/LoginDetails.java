package coma;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@ WebServlet("/Logins")
public class LoginDetails extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String p=req.getParameter("email");
		System.out.println(p);
		RequestDispatcher dispatcher=req.getRequestDispatcher("index.html");
		dispatcher.include(req, res);
	}

}
