package com.scr.market.controller;

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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.Authentication;
import  com.scr.market.data.MyUserPrincipal;
import java.security.Principal;
import java.sql.SQLException;

import com.scr.market.model.*;
import com.scr.market.repository.*;



import java.util.Optional;
import java.util.logging.Logger;

@Controller // This means that this class is a Controller
public class AgentController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private AgentRepository agentRepository;
	@Autowired
	private ContactRepository contactRepository;
	@Autowired
	private Contact contact;
	private static final Logger mLog = Logger.getLogger(AgentController.class.getName());

//@Autowired
	// private IAuthenticationFacade authenticationFacade;

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		Integer agentId = Integer.parseInt(ID);
		Agent agent  = null;
		Optional<Agent> agentOptional = agentRepository.findById(agentId);
		if (agentOptional.isPresent()) {
			agent = agentOptional.get();
		}
		model.addAttribute("agent", agent);
		return "detail";
	}
	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@RequestParam String ID, @RequestParam String email, @RequestParam String password) throws SQLException
	{
		mLog.info("starting update");
		Integer agentId = Integer.parseInt(ID);
		Agent agent  = new Agent();
		agent.setAgentid(agentId);
		agent.setAddress(email);
		agent.setPassword(password);
		agent.setContactId(contact.getContactId());
        try {
		agentRepository.save(agent);
        } catch (Exception ex) {
        	throw new DataIntegrityViolationException("Duplicate email address");
        }

		return "redirect:/agents";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@RequestParam String email, @RequestParam String password, Authentication authentication) throws SQLException {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		mLog.info("starting add");
		mLog.info("email " + email);
		mLog.info("password " + password);
		MyUserPrincipal userDetails = (MyUserPrincipal) authentication.getPrincipal();
		
		mLog.info("contact.getContactId() " + userDetails.getContact().getContactId());
		Agent agent = new Agent();
		agent.setAddress(email);
		agent.setPassword(password);
		agent.setContactId(userDetails.getContact().getContactId());

        try {
		agentRepository.save(agent);
		mLog.info("agent " + agent.getAgentid());
        } catch (Exception ex) {
        	mLog.severe("SQl Error " + ex.getMessage());
        	throw new DataIntegrityViolationException(ex.getMessage());
        }

		return "redirect:/agents";

	}

	@GetMapping(path = "/agents")
	public String getAll(Model model, Principal principal, Authentication authentication) {
		mLog.info("starting getAll");
		String principalName = "unKnown";
		MyUserPrincipal userDetails = (MyUserPrincipal) authentication.getPrincipal();
		contact = userDetails.getContact();
		

		mLog.info("principalName [" + principalName + "]");
		// Authentication authentication = authenticationFacade.getAuthentication();
		// sort by nameAuthentication authentication =
		// authenticationFacade.getAuthentication();
		Sort sort = new Sort(Direction.ASC, "address");

		Iterable<Agent> agents = agentRepository.findByContactId(contact.getContactId(), sort);
		boolean hasRows = false;
		if (agents != null) {
			long size = agents.spliterator().getExactSizeIfKnown();
			if (size > 0) {
				hasRows = true;
			}
		}

		mLog.info("has rows [" + hasRows + "]");
		// add to model
		model.addAttribute("agents", agents);
		// add to model
		model.addAttribute("hasRows", hasRows);

		return "agents";

	}

}
