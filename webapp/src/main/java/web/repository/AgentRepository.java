package web.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import web.model.Agent;
import web.model.Contact;

import java.util.logging.Logger;

public interface AgentRepository extends CrudRepository<Agent, Integer> {
	Iterable<Agent> findAll(Sort sort);

	Iterable<Agent> findByContactId(Integer contactId, Sort sort);

	Agent findByAddress(String address);

	public Agent findByAddressAndPassword(@Param("address") String address, @Param("password") String password);

}
