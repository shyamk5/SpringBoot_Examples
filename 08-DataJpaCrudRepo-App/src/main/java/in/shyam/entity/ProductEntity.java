package in.shyam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ProductEntity {
	
	@Id
	private Integer productId;
	private String productName;
	private double productPrice;
	
}
