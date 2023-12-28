package in.shyam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentEntries {
	
	@Id
	@GeneratedValue
	private Integer stid;
	
	private String sName;
	private String sEmail;
	private String sGender;
	private String courseName;
	private String[] timings;
}
