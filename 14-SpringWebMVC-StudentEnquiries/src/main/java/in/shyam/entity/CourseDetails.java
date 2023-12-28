package in.shyam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CourseDetails {
	
	@Id
	@GeneratedValue
	private Integer cId;
	
	private String courseName;
	
}
