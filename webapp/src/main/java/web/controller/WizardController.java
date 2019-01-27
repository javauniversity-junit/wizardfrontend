package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import web.data.MyUserDetailsService;
import web.data.MyUserPrincipal;
import web.model.Agent;
import web.model.Contact;
import web.model.Wizard;
import web.repository.WizardRepository;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.Authentication;
import java.security.Principal;
import java.sql.SQLException;



import java.util.Optional;
import java.util.logging.Logger;

@Controller    // This means that this class is a Controller
public class WizardController {
	private static final Logger mLog = Logger.getLogger(WizardController.class.getName());
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardRepository wizardRepository;

	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@RequestParam String name, Authentication authentication) throws SQLException {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		mLog.info("starting add");
		mLog.info("name " + name);
		MyUserPrincipal userDetails = (MyUserPrincipal) authentication.getPrincipal();
		
		Wizard wizard = new Wizard();
		wizard.setName(name);
		wizard.setAgentid(userDetails.getAgent().getAgentid());
		

        try {
        	wizard= wizardRepository.save(wizard);
        } catch (Exception ex) {
        	throw new DataIntegrityViolationException("Duplicate name");
        }
        String nextPage = "/PresentedToPage?ID=" + wizard.getWizardid();
////PresentedToPage?ID=
		return nextPage;

	}
	
	@GetMapping(path = "/wizards")
	public String getAll(Model model, Authentication authentication) {
		mLog.info("starting getAll wizards");
		
		MyUserPrincipal userDetails = (MyUserPrincipal) authentication.getPrincipal();
		// Authentication authentication = authenticationFacade.getAuthentication();
		// sort by nameAuthentication authentication =
		// authenticationFacade.getAuthentication();
		Sort sort = new Sort(Direction.ASC, "name");

		Iterable<Wizard> wizards = wizardRepository.findByAgentid(userDetails.getAgent().getAgentid(), sort);
		boolean hasRows = false;
		if (wizards != null) {
			long size = wizards.spliterator().getExactSizeIfKnown();
			if (size > 0) {
				hasRows = true;
			}
		}

		mLog.info("has rows [" + hasRows + "]");
		// add to model
		model.addAttribute("wizards", wizards);
		// add to model
		model.addAttribute("hasRows", hasRows);

		return "wizards";

	}
	
	
}
