package com.helios.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Etablissement {
	
	@Id
	private String idEtablissement;
	private String raisonSociale;
	private String enseigne;
	private String siren;
	private String formeJuridique; 
	private String activitePrincipal;
	private String dateCreation;
	private String codeApe;
	private String libelleApe;
	private String adresse1;
	private String adresse2;
	private String adresse3;
	private String adresse4;
	private String adresse5;
	private String adresse6;
	private String numeroRcs;
	private String secteurActivite;
	private String dateInscriptionRcs;
	
	public Etablissement(String idEtablissement, String raisonSociale, String enseigne, String siren, String formeJuridique,
			String activitePrincipal, String dateCreation, String codeApe, String libelleApe, String adresse1,
			String adresse2, String adresse3, String adresse4, String adresse5, String adresse6, String numeroRcs,
			String secteurActivite, String dateInscriptionRcs) {
		this.idEtablissement = idEtablissement;
		this.raisonSociale = raisonSociale;
		this.enseigne = enseigne;
		this.siren = siren;
		this.formeJuridique = formeJuridique;
		this.activitePrincipal = activitePrincipal;
		this.dateCreation = dateCreation;
		this.codeApe = codeApe;
		this.libelleApe = libelleApe;
		this.adresse1 = adresse1;
		this.adresse2 = adresse2;
		this.adresse3 = adresse3;
		this.adresse4 = adresse4;
		this.adresse5 = adresse5;
		this.adresse6 = adresse6;
		this.numeroRcs = numeroRcs;
		this.secteurActivite = secteurActivite;
		this.dateInscriptionRcs = dateInscriptionRcs;
	}
	
	public Etablissement(){
		
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getEnseigne() {
		return enseigne;
	}

	public void setEnseigne(String enseigne) {
		this.enseigne = enseigne;
	}

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}

	public String getFormeJuridique() {
		return formeJuridique;
	}

	public void setFormeJuridique(String formeJuridique) {
		this.formeJuridique = formeJuridique;
	}

	public String getActivitePrincipal() {
		return activitePrincipal;
	}

	public void setActivitePrincipal(String activitePrincipal) {
		this.activitePrincipal = activitePrincipal;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getCodeApe() {
		return codeApe;
	}

	public void setCodeApe(String codeApe) {
		this.codeApe = codeApe;
	}

	public String getLibelleApe() {
		return libelleApe;
	}

	public void setLibelleApe(String libelleApe) {
		this.libelleApe = libelleApe;
	}

	public String getAdresse1() {
		return adresse1;
	}

	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}

	public String getAdresse2() {
		return adresse2;
	}

	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}

	public String getAdresse3() {
		return adresse3;
	}

	public void setAdresse3(String adresse3) {
		this.adresse3 = adresse3;
	}

	public String getAdresse4() {
		return adresse4;
	}

	public void setAdresse4(String adresse4) {
		this.adresse4 = adresse4;
	}

	public String getAdresse5() {
		return adresse5;
	}

	public void setAdresse5(String adresse5) {
		this.adresse5 = adresse5;
	}

	public String getAdresse6() {
		return adresse6;
	}

	public void setAdresse6(String adresse6) {
		this.adresse6 = adresse6;
	}

	public String getNumeroRcs() {
		return numeroRcs;
	}

	public void setNumeroRcs(String numeroRcs) {
		this.numeroRcs = numeroRcs;
	}

	public String getSecteurActivite() {
		return secteurActivite;
	}

	public void setSecteurActivite(String secteurActivite) {
		this.secteurActivite = secteurActivite;
	}

	public String getDateInscriptionRcs() {
		return dateInscriptionRcs;
	}

	public void setDateInscriptionRcs(String dateInscriptionRcs) {
		this.dateInscriptionRcs = dateInscriptionRcs;
	}

	public String getIdEtablissement() {
		return idEtablissement;
	}

	public void setIdEtablissement(String idEtablissement) {
		this.idEtablissement = idEtablissement;
	}

	
}
