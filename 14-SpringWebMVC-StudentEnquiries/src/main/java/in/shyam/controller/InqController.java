package in.shyam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.shyam.entity.StudentEntries;
import in.shyam.repository.InqRepo;
import in.shyam.service.StudentService;

@Controller
public class InqController {
	
	@Autowired
	private InqRepo repo;
	
	@Autowired
	private StudentService stuService;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		initModel(model);
		return "index";
	}


	private void initModel(Model model) {
		model.addAttribute("student",new StudentEntries());
		model.addAttribute("courses", stuService.getCourses());
		model.addAttribute("timings", stuService.getTimings());
	}
	
	
	@PostMapping("save-inquiry")
	public String handleSubmitButton(StudentEntries s, Model model) {
		System.out.println(s);
		model.addAttribute("msg", "Data Saved...");
		initModel(model);
		repo.save(s);
		return "index";
	}
	
	
	
	
	
	
	
	
	
}
