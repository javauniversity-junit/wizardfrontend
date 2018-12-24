package com.scr.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.scr.market.model.Agent;
import com.scr.market.repository.AgentRepository;




@Controller    // This means that this class is a Controller
public class AgentController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
private AgentRepository agentRepository;
	
	@GetMapping(path = "/index")
	public String getAll(Model model) {
		
		//sort by name
		Sort sort = new Sort(Direction.ASC, "name");
		
		Iterable<Agent> agents = agentRepository.findAll(sort);
	
		//add to model
		model.addAttribute("agents", agents);

		return "index";

	}

}
