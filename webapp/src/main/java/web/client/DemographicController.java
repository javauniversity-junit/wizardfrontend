package web.client;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import web.page.Pages;

@Controller    // This means that this class is a Controller

public class DemographicController {
	Logger mlogger = Logger.getLogger(this.getClass().getName());
	
	//@RequestMapping(path = "/wizard/demographic", method = RequestMethod.GET, produces = "text/html")
	@RequestMapping(path = Pages.WebURLConstants.WEBURL_DEMOGRAPHIC_VALUE, method = RequestMethod.POST, produces = "text/html")
	public String populatePage(@RequestParam(name ="guuid", required=false) String guuid) 
	{ 
		 mlogger.info(new Object(){}.getClass().getEnclosingMethod().getName() + " beginning " + Pages.DEMOGRAPHIC.getDatabaseType());
		return Pages.InternalURLConstants.INTERNAL_DEMOGRAPHIC_VALUE; // specifies page to return
	}
}
