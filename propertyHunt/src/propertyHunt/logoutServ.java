package propertyHunt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logoutpage")
public class logoutServ extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		out.println("logged out");
		
		HttpSession session=req.getSession();
		if(session.getAttribute("username")==null)
			res.sendRedirect("index.jsp");
		else
		{
			session.removeAttribute("username");
			session.invalidate();
			res.sendRedirect("index.jsp");
		}

	}
}
