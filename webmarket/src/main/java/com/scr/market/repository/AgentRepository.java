package com.scr.market.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.logging.Logger;
import com.scr.market.model.Agent;



public interface AgentRepository extends CrudRepository<Agent, Integer> {
	Iterable<Agent> findAll(Sort sort);
	Iterable<Agent> findByContactId(Integer contactId);
	Agent findByAddress(String address);

}
