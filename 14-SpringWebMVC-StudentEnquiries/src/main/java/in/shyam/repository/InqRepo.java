package in.shyam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shyam.entity.StudentEntries;

public interface InqRepo extends JpaRepository<StudentEntries, Integer> {

}
