package com.scr.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.Authentication;
import java.security.Principal;
import com.scr.market.model.*;
import com.scr.market.repository.*;
import java.util.logging.Logger;



@Controller    // This means that this class is a Controller
public class AgentController  {
@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
private AgentRepository agentRepository;
@Autowired
private ContactRepository contactRepository;
@Autowired
private Contact contact;
private static final Logger mLog = Logger.getLogger(AgentController.class.getName());

//@Autowired
 //   private IAuthenticationFacade authenticationFacade;
	
	
       @GetMapping(path = "/add") // Map ONLY GET Requests
	public String add(@RequestParam String email, @RequestParam String password) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Agent agent = new Agent();
		agent.setAddress(email-input);
		agent.SetPassword(password-input);
		agent.setContactId(contact.getContactId());

		agentRepository.save(agent);

		return "agents";
	}
	
	@GetMapping(path = "/agents")
	public String getAll(Model model, Principal principal) {
	     mLog.info("starting getAll");
	     String principalName = "unKnown";
	     if (principal != null) {
	         principalName = principal.getName();
	         //get logon user id
	          contact = contactRepository.findByEmailaddress(principalName);
	           mLog.info("starting getAll");
           }

	     
	       mLog.info("principalName [" + principalName + "]");
	//	Authentication authentication = authenticationFacade.getAuthentication();
		//sort by nameAuthentication authentication = authenticationFacade.getAuthentication();
		Sort sort = new Sort(Direction.ASC, "address");
		
		Iterable<Agent> agents = agentRepository.findAll(sort);
		boolean hasRows = false;
		if (agents != null ) {
		     long size = agents.spliterator().getExactSizeIfKnown();
		     if (size > 0 ) {
			     hasRows =true;
		     }
		}
	
		//add to model
		model.addAttribute("agents", agents);
			//add to model
		model.addAttribute("hasRows", hasRows);
		

		return "agents";

	}

}
