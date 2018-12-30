package com.scr.market.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.scr.market.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
	public List<Contact> findByEmailaddress(@Param("emailaddress") String emailaddress,@Param("password") String password);

}
