package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String Flightname=request.getParameter("Flightname");
		String Sourcename=request.getParameter("Sourcename");
		String Destinationname=request.getParameter("Destinationname");
		String Passenger=request.getParameter("Passenger");
		String price=request.getParameter("price");
		String card=request.getParameter("card");
		String cvv=request.getParameter("cvv");
		out.println("<html><body>");
		out.println("<h2><center> <span style='color:rgb(0, 128, 128)'>Booked Sucessfully</span></center></h2>");
		 out.print("<h1> Booking Details :- </h1>");
			out.print("<style> table,td,th {" + "border:2px solid black;" + "padding: 10px; " + "}</style>");
			out.print("<table >");
			out.print("<tr>");
			out.print("<th> Booked By</th>");
			out.print("<th> Flight Name</th>");
			out.print("<th> Source Name</th>");
			out.print("<th> Destination Name</th>");
			out.print("<th> Number of Passengers</th>");
			out.print("<th> Ticket Price</th>");
			out.print("<th> Date of Booking</th>");
			out.print("</tr>");
			out.print("<tr>");
			out.print("<td>" + name + "</td>");
			out.print("<td>" + Flightname + "</td>");
			out.print("<td>" + Sourcename + "</td>");
			out.print("<td>" + Destinationname + "</td>");
			out.print("<td>" + Passenger + "</td>");
			out.print("<td>" +  price+ "</td>");
			out.print("<td>" + new Date() + "</td>");
			out.print("</tr>");
			out.println("</body></html>");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
