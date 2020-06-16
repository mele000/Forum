package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		String ime = request.getParameter("ime");
		String prezime = request.getParameter("prezime");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		
		request.setAttribute("ime", ime);
		request.setAttribute("prezime", prezime);
		request.setAttribute("dob", dob);
		request.setAttribute("email", email);
		
		request.getRequestDispatcher("/hi.jsp").forward(request, response);
		
	}
}