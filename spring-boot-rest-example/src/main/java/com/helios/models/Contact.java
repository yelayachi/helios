package com.helios.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
 
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String email;
	private String fixe;
	private String mobile;
	
	public Contact(String email, String fixe, String mobile) {

		this.email = email;
		this.fixe = fixe;
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public String getFixe() {
		return fixe;
	}

	public String getMobile() {
		return mobile;
	}
	
}
