package com.scr.market.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.scr.market.model.Agent;
import com.scr.market.model.Contact;;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
	public Contact findByEmailaddress(String emailaddress);

}
