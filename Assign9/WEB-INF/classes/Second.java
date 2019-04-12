import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RespectBinding;


public class Second extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(req,resp);
	
	}


	protected void process(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
   
		  res.setContentType("text/html;charset=UTF-8");
		  try(PrintWriter out = res.getWriter())
		  {
			  out.print("<html>");
			  out.print("<head>");
			  out.print("</head>");
			  out.print("<body>");
			  String name = req.getParameter("name");
			  out.print("Second Name : ->" + name);
			  out.print("</body>");
			  out.print("</html>");

		  }
	   
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(req, resp);
	}

	  
}

