package com.helios.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Interlocuteur {
 
	@Id
	private String idInterlocuteur;
	private String civilite;
	private String nom;
	private String prenom;
	private String telephoneMobile;
	private String email;
	private String espaceMembre;
	private String fonctions;
	@OneToMany
	private List<EntiteJuridique> entitesJuridiques;

	

	public Interlocuteur(String idInterlocuteur, String civilite, String nom, String prenom, String telephoneMobile,
			String email, String espaceMembre, String fonctions, List<EntiteJuridique> entitesJuridiques) {
		
		this.idInterlocuteur = idInterlocuteur;
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.telephoneMobile = telephoneMobile;
		this.email = email;
		this.espaceMembre = espaceMembre;
		this.fonctions = fonctions;
		this.entitesJuridiques = entitesJuridiques;
	}

	public Interlocuteur() {
	}

	public String getIdInterlocuteur() {
		return idInterlocuteur;
	}

	public void setIdInterlocuteur(String idInterlocuteur) {
		this.idInterlocuteur = idInterlocuteur;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephoneMobile() {
		return telephoneMobile;
	}

	public void setTelephoneMobile(String telephoneMobile) {
		this.telephoneMobile = telephoneMobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEspaceMembre() {
		return espaceMembre;
	}

	public void setEspaceMembre(String espaceMembre) {
		this.espaceMembre = espaceMembre;
	}

	public String getFonctions() {
		return fonctions;
	}

	public void setFonctions(String fonctions) {
		this.fonctions = fonctions;
	}

	public List<EntiteJuridique> getEntitesJuridiques() {
		return entitesJuridiques;
	}

	public void setEntitesJuridiques(List<EntiteJuridique> entitesJuridiques) {
		this.entitesJuridiques = entitesJuridiques;
	}

}
