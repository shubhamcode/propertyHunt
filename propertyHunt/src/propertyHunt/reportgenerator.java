package propertyHunt;

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

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/reportgenerator")
public class reportgenerator extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		/*
		 * out.println("got here now let seee.......11111");
		 * 
		 * ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
		 * 
		 * try { List<FileItem> sfi=sf.parseRequest(request);
		 * 
		 * for(FileItem item:sfi) {
		 * 
		 * System.out.println("reached here ...lets seessss.....2222"); try {
		 * item.write(new File("D:\\filehandling"+item.getName())); } catch (Exception
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * System.out.println("DDDDOOONNNEEEE");
		 * 
		 * }
		 * 
		 * 
		 * } catch (FileUploadException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * 
		 */

		ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
		
		try
		{
			
			List<FileItem> sfi=sf.parseRequest(request);
			
			for(FileItem itm:sfi)
			{

				
				  if(itm.getContentType().contains("spreadsheetml.sheet") || itm.getContentType().contains("ms-excel"))
				  
				   { 
					  itm.write(new File("D:\\filehandling\\"+itm.getName()));
					  request.setAttribute("filename",itm.getName());
				 
					  RequestDispatcher rd=request.getRequestDispatcher("reportDisplay");
					  rd.forward(request, response);
					  
				   }
				  
				  else
				  out.println("Please upload an excel sheet file ie with .csv extension only.Current is--"+itm.getContentType());
				
				
							}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		/*
		 * File file=new File("D:\\filehandling\\sac.csv"); Scanner sc=new
		 * Scanner(file);
		 * 
		 * List<String> reportdata=new ArrayList();
		 * 
		 * while(sc.hasNext()) { reportdata.add(sc.nextLine()); }
		 * 
		 * sc.close();
		 * 
		 * 
		 * request.setAttribute("rdata",reportdata);
		 * 
		 * RequestDispatcher rd=request.getRequestDispatcher("reportdisplay.jsp");
		 * rd.forward(request, response);
		 */ 
		 }

}
