import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class MyTaxer extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
		
	}

	protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("html/text;charset=UTF-8");
		try(PrintWriter out = resp.getWriter()) {
			 out.print("<!DOCTYPE HTML>");
			 out.print("<html>");
			 out.print("<body>");
			 
			 String name = req.getParameter("name");
			 Double income = Double.parseDouble(req.getParameter("income"));
			 
			 out.print("<br> Name : " + name);
			 out.print("<br> Income : " + income);
			 
			 Double tax;
			  if(income <= 200000)
			  {
				  tax= 0.00;
			  }
			  else if(income >200000)
			  {
				  tax = income*0.10; 
			  }
			  else{
				  tax = income*0.20;
			  }
		 	  out.print("TAX : " + tax);
		 	  out.print("Total :" + (income + tax));
		 	  
		 	  HttpSession session = req.getSession();
		 	  session.setAttribute("name", name);
		 	  
		 	  RequestDispatcher rd = req.getRequestDispatcher("Second");
		 	  rd.forward(req, resp);
		 	  
			  out.print("</body>");
			  out.print("</html>");
	
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}
	
	

}

