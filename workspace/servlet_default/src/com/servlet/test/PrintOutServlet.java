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
		
		String bg=request.getParameter("bg");
		String color=request.getParameter("color");
		String message = request.getParameter("message");
		
		
		// service.getMember
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>연습</title>");
		out.println("<style>");
		out.println("body {background:"+bg+"}");
		out.println("body {color:"+color+"}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.printf("<h1>%s</h1>",message);
		out.println("</body>");
		out.println("</html>");
	}

}
