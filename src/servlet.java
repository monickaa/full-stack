package github;
import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet{
	
	
	
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		jdbc db=new jdbc();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		int result=0;
		try {
			result = db.add(name,email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		if(result==1) {
			response.sendRedirect("submit.html");
		}
		else {
			response.sendRedirect("failure.html");
		}
		

	}
	}


