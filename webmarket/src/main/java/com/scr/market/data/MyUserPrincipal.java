package com.scr.market.data;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.scr.market.model.Agent;

public class MyUserPrincipal implements UserDetails {
	 private Agent agent;
	 
	    public MyUserPrincipal(Agent agent) {
	        this.agent = agent;
	    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		String password = agent.getPassword();
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return agent.getAddress();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
