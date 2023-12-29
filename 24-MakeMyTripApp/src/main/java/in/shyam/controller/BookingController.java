package in.shyam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.shyam.request.Passenger;
import in.shyam.response.Ticket;
import in.shyam.service.BookingServices;
 
@Controller
public class BookingController {
	
	@Autowired
	private BookingServices service;
	
	@GetMapping("/")
	public String loadIndexForm(Model model) {
		model.addAttribute("passenger",new Passenger());
		return "index";
	}
	
	@PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute("passenger") Passenger passenger, Model model) {
		
		Ticket ticket = service.bookTicket(passenger);
		model.addAttribute("msg","Your Ticket is Booked Successfully with PNR Number: "+ticket.getPnrNumber());
		
		return "index";
	}
	
	@GetMapping("/pnr-enquiry")
	public String loadTicketForm(Model model) {
		model.addAttribute("ticket",new Ticket());
		return "ticket";
	}
	
	@GetMapping("/get-ticket")
	public String getTicket(@RequestParam Integer pnrNum, Model model) {
		Ticket ticketByPnr = service.getTicket(pnrNum);
		model.addAttribute("ticket",ticketByPnr);
		return "ticket";
	}
	
}
