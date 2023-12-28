package in.shyam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.shyam.binding.UserReg;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String getForm(Model model) {
		
		model.addAttribute("users", new UserReg());
		
		return "index";
	}
	
	
	@PostMapping("/register")
	public String handleSubmit(UserReg user, Model model, BindingResult result) {
		if(result.hasErrors()) {
			return "index";
		}
		model.addAttribute("msg", "User Registered Successfully...");
		System.out.println(user);
		return "success";
	}
	
}
