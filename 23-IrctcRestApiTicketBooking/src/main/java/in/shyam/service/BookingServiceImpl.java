package in.shyam.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.shyam.request.Passenger;
import in.shyam.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService {

	private Map<Integer,Ticket> ticketsMap = new HashMap();
	private Integer pnr = 674589;
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		//logic
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		pnr++;
		t.setTicketCost(550.00);
		t.setPnrNumber(pnr);
		t.setStatus("CONFIRMED");
		
		ticketsMap.put(pnr, t);
		pnr++;
		return t;
	}
	
	

	@Override
	public Ticket getTicket(Integer pnrNumber) {
		//logic
		if(ticketsMap.containsKey(pnrNumber)) {
			return ticketsMap.get(pnrNumber);
		}
		
		return null;
	}

}
