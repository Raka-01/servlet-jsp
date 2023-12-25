package com.raka.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ServletDemo2 extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Processing User Request");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Welcome to Servlet Learning</h1>");
		out.println("<p>This servlet is implemented by extending the GenericServlet class.<br>"
				+ "And it only needs to implement the service() method as that is the only "
				+ "method that is abstract in GenericServlet class.</p>");
		out.println();
		out.println("<h3>" + new Date().toString() + "</h3>");
		out.println();
		out.println("Servlet Name - " + getServletName());
		
	}
	
	

}
