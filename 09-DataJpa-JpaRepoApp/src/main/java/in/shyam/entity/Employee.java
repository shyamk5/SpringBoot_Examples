package in.shyam.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "emp_tab")
public class Employee {
	
	@Id
	@GeneratedValue
	private Integer empId;
	private String empName;
	private String empProfile;
	private Double empSal;
	private String empDept;
	
	@CreationTimestamp
	@Column(name = "creation_date")
	private LocalDate dateCreated;
	
	@UpdateTimestamp
	@Column(name = "last_updated")
	private LocalDate dateUpdated;
	
	
}
