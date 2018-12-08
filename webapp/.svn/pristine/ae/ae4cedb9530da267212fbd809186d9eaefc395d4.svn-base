package web.client.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="role")
public class Role {
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name="role_id")
	    private Integer id;
	    @Column(name="role")
	    private String role;
	    @ManyToMany(cascade=CascadeType.ALL)
	    @JoinTable(name="user_role", joinColumns=@JoinColumn(name="user_id"), inverseJoinColumns=@JoinColumn(name="role_id"))
	    private Set<Role> roles;
	    
}
