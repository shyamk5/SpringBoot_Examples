package in.shyam.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.shyam.request.Passenger;
import in.shyam.response.Ticket;
import in.shyam.service.BookingService;

@RestController
public class BookingRestController {
	
	@Autowired
	private BookingService service;
	
	@PostMapping(
			value="/bookTicket",
			consumes = {"application/json"},
			produces = {"application/json"}
	)
	public ResponseEntity<Ticket> ticketBooking(@RequestBody Passenger passenger) {
		Ticket ticket = service.bookTicket(passenger);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
	@GetMapping(
			value = "/ticket/{pnr}",
			produces = {"application/json"}
	)
	public Ticket getTicket(@PathVariable("pnr") Integer pnrNumber) {
		return service.getTicket(pnrNumber);
	}
	
}
