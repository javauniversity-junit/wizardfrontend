package com.scr.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.Authentication;
public interface IAuthenticationFacade {
    Authentication getAuthentication();
}
import com.scr.market.model.Agent;
import com.scr.market.repository.AgentRepository;



