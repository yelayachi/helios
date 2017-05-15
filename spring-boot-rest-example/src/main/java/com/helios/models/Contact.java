package com.helios.models;

public class Contact {
 
	private String email;
	private String fixe;
	private String mobile;
	
	public Contact(String email, String fixe, String mobile) {
		super();
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
