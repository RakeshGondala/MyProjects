package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.dao.UserDaoImpl;

import Entity.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String Name=request.getParameter("name");
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		
		User user1=new User(Name,Username, Password);
		UserDao userdao=new UserDaoImpl();
		userdao.addUser(user1);
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h2><center> <span style='color:rgb(0, 128, 128)'>Details Saved Sucessfully</span></center></h2>");
		out.println("<center><a href=\"View.jsp\">View Avaliable Flights</a></center></br></br>");
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
