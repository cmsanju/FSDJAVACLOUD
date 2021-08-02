package com.test;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/LifeCycle")
public class LifeCycle extends GenericServlet {
	private static final long serialVersionUID = 1L;

    
    public LifeCycle() {
       System.out.println("constructor");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
	}

	
	public void destroy() {
		System.out.println("destroy()");
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("proccessing the rquest and response");
	}

}
