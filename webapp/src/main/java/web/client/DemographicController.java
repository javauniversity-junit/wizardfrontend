package web.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import web.page.Pages;

@Controller    // This means that this class is a Controller

public class DemographicController {
	
	//@RequestMapping(path = "/wizard/demographic", method = RequestMethod.GET, produces = "text/html")
	@RequestMapping(path = Pages.WebURLConstants.WEBURL_DEMOGRAPHIC_VALUE, method = RequestMethod.GET, produces = "text/html")
	public String populate() 
	{ 
		return Pages.InternalURLConstants.INTERNAL_DEMOGRAPHIC_VALUE; // specifies page to return
	}
}
