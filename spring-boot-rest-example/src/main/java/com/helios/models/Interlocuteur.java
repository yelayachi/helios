package com.helios.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Interlocuteur {
 
	@Id
	private String idInterlocuteur;
	private String civilite;
	private String nom;
	private String prenom;
	private String telephone;
	private String telephoneMobile;
	private String email;
	private String fonction;
	private String espaceMembre;
	private String role;
	private String prefCanalContact;
	private String commentaire;
	private String accesInternetActif;
	private String statutEspaceClient;
	@ManyToMany
	private List<EntiteJuridique> entitesJuridiques;

	public Interlocuteur(String idInterlocuteur, String civilite, String nom, String prenom, String telephone,
			String telephoneMobile, String fonction, String espaceMembre, String role,
			String prefCanalContact, String commentaire, String accesInternetActif, String statutEspaceClient,String email,
			List<EntiteJuridique> entitesJuridiques) {
		super();
		this.idInterlocuteur = idInterlocuteur;
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.telephoneMobile = telephoneMobile;
		this.email = email;
		this.fonction = fonction;
		this.espaceMembre = espaceMembre;
		this.role = role;
		this.prefCanalContact = prefCanalContact;
		this.commentaire = commentaire;
		this.accesInternetActif = accesInternetActif;
		this.statutEspaceClient = statutEspaceClient;
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
	
	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getFonction() {
		return fonction;
	}


	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getPrefCanalContact() {
		return prefCanalContact;
	}


	public void setPrefCanalContact(String prefCanalContact) {
		this.prefCanalContact = prefCanalContact;
	}


	public String getCommentaire() {
		return commentaire;
	}


	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}


	public String getAccesInternetActif() {
		return accesInternetActif;
	}


	public void setAccesInternetActif(String accesInternetActif) {
		this.accesInternetActif = accesInternetActif;
	}


	public String getStatutEspaceClient() {
		return statutEspaceClient;
	}


	public void setStatutEspaceClient(String statutEspaceClient) {
		this.statutEspaceClient = statutEspaceClient;
	}


	public List<EntiteJuridique> getEntitesJuridiques() {
		return entitesJuridiques;
	}

	public void setEntitesJuridiques(List<EntiteJuridique> entitesJuridiques) {
		this.entitesJuridiques = entitesJuridiques;
	}

	
}
