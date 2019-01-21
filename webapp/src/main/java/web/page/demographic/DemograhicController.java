package web.page.demographic;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller    // This means that this class is a Controller
public class DemograhicController {
	private static final Logger mLog = Logger.getLogger(DemograhicController.class.getName());
	@RequestMapping(value = "/wizardDemographic", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		
		//model.addAttribute("agent", agent);
		return "pages/Demographic";
	}
}
