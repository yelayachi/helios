package com.helios.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Identite {
 
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String civilite;
	private String nom;
	private String prenom;
	
	public Identite(String civilite, String nom, String prenom) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getCivilite() {
		return civilite;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
	
}
