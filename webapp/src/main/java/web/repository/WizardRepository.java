package web.repository;


import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import web.model.Agent;
import web.model.Contact;
import web.model.Wizard;

import java.util.logging.Logger;

public interface WizardRepository extends CrudRepository<Wizard, Integer> {
	Iterable<Wizard> findAll(Sort sort);
	Iterable<Wizard> findByAgentid(Integer agentid,Sort sort);
	
}
