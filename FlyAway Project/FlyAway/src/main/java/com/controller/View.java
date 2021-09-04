package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import Entity.Source;
import util.HibernateUtil;

/**
 * Servlet implementation class View
 */
@WebServlet("/View")
public class View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public View() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		org.hibernate.SessionFactory sf = HibernateUtil.buildSessionFactory();
		Session session = sf.openSession();
		List<Source> sources = session.createQuery("from Source").list();
        out.print("<h1> Flight Details :- </h1>");
		out.print("<style> table,td,th {" + "border:2px solid black;" + "padding: 10px; " + "}</style>");
		out.print("<table >");
		out.print("<tr>");
		out.print("<th> Flight Id</th>");
		out.print("<th> Flight Name</th>");
		out.print("<th> Flight Source</th>");
		out.print("<th> Flight Destination</th>");
		out.print("<th> Ticket Price</th>");
		out.print("<th> Date of Departure</th>");
		out.print("</tr>");

		for (Source source : sources) {
			out.print("<tr>");
			out.print("<td>" + source.getFlightId() + "</td>");
			out.print("<td>" + source.getFlightName() + "</td>");
			out.print("<td>" + source.getFlightSource() + "</td>");
			out.print("<td>" + source.getFlightDestination() + "</td>");
			out.print("<td>" + source.getTicketPrice() + "</td>");
			out.print("<td>" + source.getDate() + "</td>");
			out.print("</tr>");
		}

		out.println("</table>");
		out.println("</br></br>");
		out.println("<center><a href=\"BookFlight.jsp\">Book Flight</a><br><br></center>");
		out.println("</body> </html>");
		session.close();	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
