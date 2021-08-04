package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		ServletContext ctx = getServletContext();
		
		String city = ctx.getInitParameter("city");
		String state = ctx.getInitParameter("state");
		
		out.println(city+" "+state);
		
		String details = city+" "+state;
		
		ctx.setAttribute("info", details);
		
		out.println("<a href = 'Servlet2'>go to next page</a>");
		
		ServletConfig cfg = getServletConfig();
		
		String user = cfg.getInitParameter("user");
		String pass = cfg.getInitParameter("pwd");
		
		out.println(user+" "+pass);
		
		
		
	}

}
