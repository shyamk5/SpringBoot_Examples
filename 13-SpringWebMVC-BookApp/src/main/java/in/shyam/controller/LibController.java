package in.shyam.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.shyam.entity.Book;
import in.shyam.repository.BookRepo;

@Controller
public class LibController {
	
	@Autowired
	private BookRepo repo;
	
	@PostMapping("/book-retrieve")
	public ModelAndView getBookById(@RequestParam("bookId")  Integer bookId) {
		
		ModelAndView mav = new ModelAndView();
		Optional<Book> findById = repo.findById(bookId);
		
		if(findById.isPresent()) {
			Book bookObj = findById.get();
			mav.addObject("book", bookObj);
		}
		
		mav.setViewName("index");
		
		return mav;
	}
	
	@PostMapping("/book-insert")
	public ModelAndView saveBook(Integer bookId, String bookName, Double bookPrice) {
		
		ModelAndView mav = new ModelAndView();
		
		Book b1 = new Book();
		b1.setBookId(bookId);
		b1.setBookName(bookName);
		b1.setBookPrice(bookPrice);
		
		Book save = repo.save(b1);
		
		mav.addObject("msg", "Book Saved Successfully");

		mav.setViewName("index");
		
		return mav;
	}
	
	
	
}
