package in.shyam.response;

import lombok.Data;

@Data
public class Ticket {
	
	private String trainName;
	private Integer trainNumber;
	private String ticketFrom;
	private String ticketTo;
	private String doj;
	private String phoneNo;
	private String name;
	private String address;
	private Integer pnrNumber;
	private String status;
	private Double ticketCost;
	
}
