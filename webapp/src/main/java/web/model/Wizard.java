package web.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;



import javax.persistence.Table;

import org.springframework.web.context.annotation.SessionScope;
@Entity // This tells Hibernate to make a table out of this class
@Table(name="wizard")
@SessionScope
public class Wizard {
	@Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer wizardid;
	public Integer getWizardid() {
		return wizardid;
	}


	public void setWizardid(Integer wizardid) {
		this.wizardid = wizardid;
	}


	public Integer getAgentid() {
		return agentid;
	}


	public void setAgentid(Integer agentid) {
		this.agentid = agentid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	private Integer agentid;
	
	
	private String name;

	
	

}