package com.scr.market.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.scr.market.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
   // @Modifying
  // @Query("select * from contact i where i.emailaddress = :emailaddress and i.password = :password")
	public Contact findFirstEmailAddressAndPasswordBy(@Param("emailaddress") String emailaddress,@Param("password") String password);

}
