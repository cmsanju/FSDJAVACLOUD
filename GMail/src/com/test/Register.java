package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("fname");
		String user = request.getParameter("user");
		String pass = request.getParameter("pwd");
		
		if(pass.equals("admin"))
		{
			out.println("Registraion success....");
			
			out.println("Name : "+name+" User : "+user+" Password : "+pass);
			
			//RequestDispatcher rd = request.getRequestDispatcher("login.html");
			
			//rd.forward(request, response);
			
			response.sendRedirect("login.html");
		
		}
		else
		{
			out.println("<font color = 'red'>Registration failed.</font>");
			
			RequestDispatcher rd = request.getRequestDispatcher("register.html");
			rd.include(request, response);
		}
	}

}
