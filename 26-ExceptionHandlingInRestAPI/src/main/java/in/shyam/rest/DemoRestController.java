package in.shyam.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.shyam.exception.UserNotFoundException;


@RestController
public class DemoRestController {
	
	@GetMapping("/welcome")
	public String raiseError() {
		String msg = "Welcome to RestAPI...";
		int x = 10/0;
		
		return msg;
	}
	
	@GetMapping("/user/{userId}")
	public String getUserName(@PathVariable("userId") Integer userId) throws Exception {
		if(userId == 100) {
			return "Shyam";
		}
		else if(userId == 200) {
			return "Urvil";
		}
		else {
			throw new UserNotFoundException("User Not Found");
		}
	}
	
	
}
