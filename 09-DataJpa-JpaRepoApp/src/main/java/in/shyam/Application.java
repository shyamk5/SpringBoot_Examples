package in.shyam;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.shyam.entity.Employee;
import in.shyam.repository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		EmpRepository repo = ctx.getBean(EmpRepository.class);
		
		/*
		Employee e2 = new Employee(1002, "Shyam", "Software Developer", 45000, "Development");
		Employee e3 = new Employee(1003, "Pradeep", "Java Developer", 50000, "Development");
		Employee e4 = new Employee(1004, "Ashish", "Manager", 75000, "Admin");
		Employee e5 = new Employee(1005, "Aman", "Marketing Manager", 55000, "Marketing");
		Employee e6 = new Employee(1006, "Smith", "HR Head", 80000, "HR");
		Employee e7 = new Employee(1007, "Martin", "SEO Executive", 25000, "Marketing");
		
		repo.saveAll(Arrays.asList(e2,e3,e4,e5,e6,e7));
		*/
		
		/*
		List<Employee> empList = repo.getAllSortedEmp();
		empList.forEach(System.out::println);
		*/
		
		/*
		//Pagination
		Sort sort = Sort.by("empName","empSal").descending();
		int pageNo = 2;
		PageRequest page = PageRequest.of(pageNo-1, 3);
		Page<Employee> findAll = repo.findAll(page);
		List<Employee> empList = findAll.getContent();
		empList.forEach(System.out::println);
		*/
		
		/*
		//QueryByExample 
		Employee e11 = new Employee();
		e11.setEmpDept("Marketing");
		e11.setEmpSal(25000);
		Example<Employee> ex = Example.of(e11);
		List<Employee> exps = repo.findAll(ex);
		exps.forEach(System.out::println);
		*/
		
		/*
		int statusCode = repo.updateEmpSal(1003);
		System.out.println(statusCode+" row(s) affected");
		*/
		
		/*
		int statusCode = repo.insertNewRecord(1009, "Mahesh", "Sr. Engineer", 95000, "Mechanical");
		System.out.println(statusCode+" row(s) affected");
		*/
		
		/*
		int statusCode = repo.deleteEmpRowById(1009);
		System.out.println(statusCode+" row(s) deleted");
		*/
		
		Employee emp = new Employee();
		emp.setEmpName("Pradeep");
		emp.setEmpProfile("Team Lead");
		emp.setEmpSal(65000.00);
		emp.setEmpDept("Development");
		
		repo.save(emp);
		
		
		
		
		
		
	}

}
