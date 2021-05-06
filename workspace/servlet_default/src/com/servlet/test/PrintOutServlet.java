package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/print.html")
public class PrintOutServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//System.out.println("Hello!!");
		
		//Scanner scan = new Scanner(System.in);
		
		String message = request.getParameter("message");
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<style>");
		out.println("body {background:"++"}")
		out.println("</style>");
		out.printf("<h1>%s</h1>",message);
	}

}
