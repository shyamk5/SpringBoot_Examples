package in.shyam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymContro {
	
	@GetMapping("/")
	public String getWelcomeMsg(Model model) {
		
		model.addAttribute("msg", "Welcome to Java Spring Web MVC");
		
		return "index";
	}
	
}
