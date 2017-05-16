package com.helios.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Adresse {
 
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String voie;
	private String complementAdr;
	private String codePostal;
	private String ville;
	private String pays;
	
	public Adresse(String voie, String complementAdr, String codePostal, String ville, String pays) {
		this.voie = voie;
		this.complementAdr = complementAdr;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	public String getVoie() {
		return voie;
	}

	public String getComplementAdr() {
		return complementAdr;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public String getVille() {
		return ville;
	}

	public String getPays() {
		return pays;
	}
	
}
