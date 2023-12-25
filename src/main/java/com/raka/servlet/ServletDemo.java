package com.raka.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ServletDemo implements Servlet {
	ServletConfig conf;
	
	// life-cycle methods
	public void init(ServletConfig conf) {
		this.conf = conf;
		
		System.out.println("Initilaizing Servlet");
		
	}
	
	public void service(ServletRequest request, ServletResponse response) throws IOException {
		
		System.out.println("Processing User Request");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Welcome to Servlet Demo</h1>");
		out.println("<p>This servlet is implemented using Servlet interface. "
				+ "While implementing the Servlet interface, "
				+ "it was necessary to implement all the methods present in the Servlet interface</p>");
		out.println("<p>The methods of the Servlet interface are <br>"
				+ "a. void init(ServletConfig conf)<br>"
				+ "b. void service(ServletRequest request, ServletResponse response)<br>"
				+ "c. void destroy()<br>"
				+ "d. ServletConfig getServletConfig()<br>"
				+ "e. String getServletInfo()</p>");
		out.println();
		out.println("<h3>" + new Date().toString() + "</h3>");
	}
	
	public void destroy() {
		
		System.out.println("Destroying Servlet Object");
	}
	
	// non-lifecycle methods
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		
		return "Servlet Demo";
	}

}
