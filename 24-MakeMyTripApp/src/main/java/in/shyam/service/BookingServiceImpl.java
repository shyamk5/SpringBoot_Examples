package in.shyam.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import in.shyam.request.Passenger;
import in.shyam.response.Ticket;

@Service
public class BookingServiceImpl implements BookingServices {

	private String BOOK_TICKET_URL = "http://localhost:5050/sb-irctc-api/bookTicket";
	private String GET_TICKET_URL = "http://localhost:5050/sb-irctc-api/ticket/{pnr}";
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		//Method 1: Rest Template
		/*
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> respTicket = rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class);
		Ticket t = respTicket.getBody();
		return t;
		*/
		
		
		//Method 2: Web Starter Flux
		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.post()
								 .uri(BOOK_TICKET_URL)
								 .bodyValue(passenger)
								 .retrieve()
								 .bodyToMono(Ticket.class) 
								 .block(); //sync call
		
		return ticket;
		
	}

	@Override
	public Ticket getTicket(Integer pnrNum) {
		
		//Method 1: Rest Template
		/*
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> respTicket = rt.getForEntity(GET_TICKET_URL, Ticket.class, pnrNum);
		Ticket t = respTicket.getBody();
		return t;
		*/
		
		
		//Method 2: Web Starter Flux
		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.get()
								 .uri(GET_TICKET_URL, pnrNum)
								 .retrieve()
								 .bodyToMono(Ticket.class)
								 .block(); //sync
		
		return ticket;
	}
	
}
