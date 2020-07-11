package propertyHunt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/emplogin")
public class loginDetails extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out=res.getWriter();
		
		String username=req.getParameter("uid");
		String password=req.getParameter("pwd");
		
		loginDAO loginCheck=new loginDAO();
		
		try {
			if(loginCheck.checkEmpLogin(username,password))
			{
				
				HttpSession ses=req.getSession();
				ses.setAttribute("username", username);
				
				
				res.sendRedirect("empPage.jsp");
			}
			else
				res.sendRedirect("index.jsp");
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
