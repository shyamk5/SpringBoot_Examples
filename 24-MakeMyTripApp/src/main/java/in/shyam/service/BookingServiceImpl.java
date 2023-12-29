package in.shyam.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.shyam.request.Passenger;
import in.shyam.response.Ticket;

@Service
public class BookingServiceImpl implements BookingServices {

	private String BOOK_TICKET_URL = "http://localhost:5050/sb-irctc-api/bookTicket";
	private String GET_TICKET_URL = "http://localhost:5050/sb-irctc-api/ticket/{pnr}";
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> respTicket = rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class);
		Ticket t = respTicket.getBody();
		return t;
	}

	@Override
	public Ticket getTicket(Integer pnrNum) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> respTicket = rt.getForEntity(GET_TICKET_URL, Ticket.class, pnrNum);
		Ticket t = respTicket.getBody();
		return t;
	}
	
}
