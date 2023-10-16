package in.shyam.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class DaysHotel {
	
	@Column(name = "item_price")
	private Double itemPrice;
	
	@Column(name = "item_quantity")
	private Integer itemQuantity;
	
	@Column(name = "total_price")
	private Double totalPrice;
	
	@EmbeddedId
	private DaysHotelCPK daysHotelCpk;
	
}
