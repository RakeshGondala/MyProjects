

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import Entity.Source;
import util.HibernateUtil;

/**
 * Servlet implementation class FlightServlet
 */
@WebServlet("/FlightServlet")
public class FlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
		    String FlightName=request.getParameter("FlightName");
		    String SourceName=request.getParameter("SourceName");
		    String DesinationName=request.getParameter("DesinationName");
		    String TicketPrice=request.getParameter("TicketPrice");
		    String DateOfDeparture=request.getParameter("DateOfDeparture");
			if(FlightName=="" && SourceName=="" && DesinationName=="" && TicketPrice=="" &&DateOfDeparture=="") {
		    out.println("<html><body>");
		    out.println("<center> <span style='color:red'>Please fill all Details</span></center></br></br>");
			out.println("<center><a href=\"Flight.html\">Try Again</a></center></br></br>");
			out.println("</html></body>");
			}
			else {		
			Source s=new Source();
			s.setFlightName(FlightName);
			s.setFlightSource(SourceName);
			s.setFlightDestination(DesinationName);
			s.setTicketPrice(Long.parseLong(TicketPrice));
			s.setDate(DateOfDeparture);
			org.hibernate.SessionFactory sf = HibernateUtil.buildSessionFactory();
			Session session = sf.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			session.save(s);
	        tx.commit();
	        out.println("<html><body>");
			out.println("<center> <span style='color:green'><h2>Details Saved Sucessfully</h2></span></center><br>");
			out.println("<center><a href=\"Flight.html\">Add new details of Flights</a></center><br>");
			out.println("<center><a href=\"View.jsp\">View details of Flights</a></center><br>");
			out.println("</html></body>");
			session.close();	
			}
		}
			
			catch(Exception e) {
				e.printStackTrace();
			}
	}
}
