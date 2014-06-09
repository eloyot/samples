package com.starwoodhotels.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter responseWriter = response.getWriter();

        responseWriter.println("<html>");
        
        responseWriter.println("<head>");
        responseWriter.println("<title>Hello World</title>");
        responseWriter.println("</head>");
        
        responseWriter.println("<body>");
        responseWriter.println("<h1>Hello World!!</h1>");
        responseWriter.println("</body>");
        
        responseWriter.println("</html>");
	}
}
