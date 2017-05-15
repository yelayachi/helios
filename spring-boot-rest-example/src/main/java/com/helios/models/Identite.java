package com.helios.models;

public class Identite {

	private String civilite;
	private String nom;
	private String prenom;
	
	public Identite(String civilite, String nom, String prenom) {
		super();
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
