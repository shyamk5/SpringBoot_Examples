package in.shyam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.shyam.entity.UsersData;
import in.shyam.repository.UserRepo;
import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	private UserRepo repo;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		UsersData userObj = new UsersData();
		model.addAttribute("users", userObj);
		return "index";
	}
	
	@PostMapping("/register")
	public String registerUser(@Valid UsersData user, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "index";
		}
		
		//logic to save Users data to the database
		//repo.save(user);
		System.out.println(user);
		
		model.addAttribute("msg", "Registered Successfully...");
		return "success";
	}
	
}
