package web.page;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import web.page.presentedtopage.PresentedToPageController;

@Controller    // This means that this class is a Controller
public class PublishController {
	private static final Logger mLog = Logger.getLogger(PresentedToPageController.class.getName());
	@RequestMapping(value = "/Publish", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID) {
		return "publish";
	}

}
