package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "source")
public class Source {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int FlightId;
	
	private String FlightName;
	
	private String FlightSource;
	
	private String FlightDestination;
	
	private long TicketPrice;

	private String Date;

	public int getFlightId() {
		return FlightId;
	}

	public String getFlightName() {
		return FlightName;
	}

	public void setFlightName(String flightName) {
		FlightName = flightName;
	}

	public String getFlightSource() {
		return FlightSource;
	}

	public void setFlightSource(String flightSource) {
		FlightSource = flightSource;
	}

	public String getFlightDestination() {
		return FlightDestination;
	}

	public void setFlightDestination(String flightDestination) {
		FlightDestination = flightDestination;
	}

	public long getTicketPrice() {
		return TicketPrice;
	}

	public void setTicketPrice(long ticketPrice) {
		TicketPrice = ticketPrice;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public Source() {

	}

	public Source(String flightName, String flightSource, String flightDestination, long ticketPrice, String date) {
		super();
		FlightName = flightName;
		FlightSource = flightSource;
		FlightDestination = flightDestination;
		TicketPrice = ticketPrice;
		Date = date;
	}

	@Override
	public String toString() {
		return "Source [FlightId=" + FlightId + ", FlightName=" + FlightName + ", FlightSource=" + FlightSource
				+ ", FlightDestination=" + FlightDestination + ", TicketPrice=" + TicketPrice + ", Date=" + Date + "]";
	}

}
