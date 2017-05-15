package com.helios.models;

public class Adresse {

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
