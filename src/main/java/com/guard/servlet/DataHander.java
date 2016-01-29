package com.guard.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataHander
 */
public class DataHander extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DataHander() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String data = request.getParameter("id");
		System.out.println(data);
		PrintWriter out = response.getWriter();
		out.print("hello angularJs  Get");
		out.flush();
		out.close();		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String postData = request.getParameter("id");
		
	    System.out.println(postData);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("hello angularJs  Post");
		out.flush();
		out.close();
	}

}
