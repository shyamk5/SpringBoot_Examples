package in.shyam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class UsersData {
	
	@Id
	@GeneratedValue
	private Integer uid;
	
	private String name;
	
	private String email;
	
	
	private String userName;
	
	private String password;
	
}
