package in.shyam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shyam.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
