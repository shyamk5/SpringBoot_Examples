package in.shyam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.shyam.entity.UsersData;

@Repository
public interface UserRepo extends JpaRepository<UsersData, Integer> {

}
