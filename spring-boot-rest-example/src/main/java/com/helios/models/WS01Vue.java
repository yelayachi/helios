package com.helios.models;

import java.util.List;

public class WS01Vue {
	
	private String idInterlocuteur;
	private String civilite;
	private String nom;
	private String prenom;
	private String telephone;
	private String telephoneMobile;
	private String email;
	private String fonction;
	private String espaceMembre;
	private String nbEntitesJuridiques;

	private List<EntiteJuridiqueVue> entitesJuridiques;
	
	
	
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getEspaceMembre() {
		return espaceMembre;
	}
	public void setEspaceMembre(String espaceMembre) {
		this.espaceMembre = espaceMembre;
	}
	public String getNbEntitesJuridiques() {
		return nbEntitesJuridiques;
	}
	public void setNbEntitesJuridiques(String nbEntitesJuridiques) {
		this.nbEntitesJuridiques = nbEntitesJuridiques;
	}
	public List<EntiteJuridiqueVue> getEntitesJuridiques() {
		return entitesJuridiques;
	}
	public void setEntitesJuridiques(List<EntiteJuridiqueVue> entitesJuridiques) {
		this.entitesJuridiques = entitesJuridiques;
	}
	
	
	
	

}
