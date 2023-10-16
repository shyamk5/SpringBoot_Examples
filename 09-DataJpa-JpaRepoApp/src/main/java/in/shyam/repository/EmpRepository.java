package in.shyam.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.shyam.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

	//Get the sorted Employee details by Alphanumeric on Employee Names
	@Query(value = "from Employee order by empName")
	public List<Employee> getAllSortedEmp();
	
	//Update the salary of Marketing Manager by 5000 using Custom Query
	@Transactional
	@Modifying
	@Query(value = "update emp_tab set emp_sal=emp_sal+5000 where emp_id=?", nativeQuery = true)
	public int updateEmpSal(int empId);
	
	//Insert the new record using custom Query
	@Transactional
	@Modifying
	@Query(value = "insert into emp_tab(emp_id,emp_name,emp_profile,emp_sal,emp_dept)values(?1,?2,?3,?4,?5)", nativeQuery = true)
	public int insertNewRecord(int empId, String empName, String empJob, double empSal, String empDept);
	
	
	//Delete the whole row from emp table based on the employee id coming from the argument
	@Transactional
	@Modifying
	@Query(value = "delete from emp_tab where emp_id=?1", nativeQuery = true)
	public int deleteEmpRowById(int empId);
	
}
