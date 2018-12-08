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
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    @Column(name= "enabled")
    private boolean enabled;

    public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name= "password")
    private String password;
    @Column(name= "username")
    private String name;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    @ManyToMany(cascade=CascadeType.ALL )
    @JoinTable(name="user_role", joinColumns=@JoinColumn(name="user_id"), inverseJoinColumns=@JoinColumn(name="role_id"))
    private Set<Role> roles;



	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
    
}

