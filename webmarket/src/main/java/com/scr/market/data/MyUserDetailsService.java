package com.scr.market.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.scr.market.model.Agent;
import com.scr.market.repository.AgentRepository;

public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private AgentRepository mAgentRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Agent agent = mAgentRepository.findByAddress(username);
		if (agent == null) {
            throw new UsernameNotFoundException(username);
        }
        return new MyUserPrincipal(agent);
		
	}
	

}
