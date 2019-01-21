package web.repository;



import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import web.model.WebClient;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface WebClientRepository extends CrudRepository<WebClient, Integer> {
	
	 Iterable<WebClient> findAll(Sort sort);
   

}
