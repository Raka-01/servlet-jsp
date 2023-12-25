package com.raka.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo3
 */
public class ServletDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Processing User Request");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<p>This Servlet is implemented by extending the HttpServlet class "
				+ "that extends GenericServlet class<br>"
				+ "HttpServlet class provides protocol specific methods to handle different types of request</p>");
		out.println("This request is processing using the doGet() method.");
		out.println();
		out.println("<h3>" + new Date().toString() + "</h3>");
		out.println();
		out.println("Servlet Name - " + getServletName());
	}

}
