

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reportgenerator")
public class reportgenerator extends HttpServlet {

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 PrintWriter out=response.getWriter();
	
		 File file=new File("D:\\filehandling\\sac.csv");
		 Scanner sc=new Scanner(file);
		 
		 List<String> reportdata=new ArrayList();
		 
		 while(sc.hasNext())
		 {
			 	reportdata.add(sc.nextLine());
		 }
		
		 sc.close();
		
		 
		 request.setAttribute("rdata",reportdata);
		 
		 RequestDispatcher rd=request.getRequestDispatcher("reportdisplay.jsp");
		 rd.forward(request, response);
		 
		}


}