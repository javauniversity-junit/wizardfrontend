package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller    // This means that this class is a Controller
public class WizardController {
	@GetMapping(path = "/wizard") 
	public String wizard() {
		
		return "wizard";
	}
}
