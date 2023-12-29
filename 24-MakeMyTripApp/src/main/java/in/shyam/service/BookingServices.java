package in.shyam.service;

import in.shyam.request.Passenger;
import in.shyam.response.Ticket;

public interface BookingServices {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer pnrNum);
	
}
