package in.shyam.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class DaysHotelCPK implements Serializable {
	
	private Integer itemId;
	private String itemName;
	
}
