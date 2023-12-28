package in.shyam.service;

import org.springframework.stereotype.Service;

import in.shyam.request.Passenger;
import in.shyam.response.Ticket;

public interface BookingService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer pnrNumber);
	
}
