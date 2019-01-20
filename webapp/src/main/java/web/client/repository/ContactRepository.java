package web.client.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import web.client.model.Contact;




public interface ContactRepository extends CrudRepository<Contact, Integer> {
   // @Modifying
   //@Query("select i.password from contact i where i.emailaddress = :emailaddress and i.password = :password")
	public Contact findByEmailaddressAndPassword(@Param("emailaddress") String emailaddress,@Param("password") String password);
	public Contact findByEmailaddress(@Param("emailaddress") String emailaddresss);

}
