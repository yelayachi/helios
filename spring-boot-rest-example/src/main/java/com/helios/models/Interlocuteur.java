package com.helios.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Interlocuteur {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public Adresse adresse;
	public Contact contact;
	public Identite identite;
	public boolean supprime;
	public String espaceMembre;
	public String idUtilisateur;
	public boolean accesInternet;
	
	public Interlocuteur(Long id, Adresse adresse, Contact contact, Identite identite, boolean supprime,
			String espaceMembre, String idUtilisateur, boolean accesInternet) {
		
		this.id = id;
		this.adresse = adresse;
		this.contact = contact;
		this.identite = identite;
		this.supprime = supprime;
		this.espaceMembre = espaceMembre;
		this.idUtilisateur = idUtilisateur;
		this.accesInternet = accesInternet;
	}

	
	
	public Long getId() {
		return id;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public Contact getContact() {
		return contact;
	}

	public Identite getIdentite() {
		return identite;
	}

	public boolean isSupprime() {
		return supprime;
	}

	public String getEspaceMembre() {
		return espaceMembre;
	}

	public String getIdUtilisateur() {
		return idUtilisateur;
	}

	public boolean isAccesInternet() {
		return accesInternet;
	}
	
}
