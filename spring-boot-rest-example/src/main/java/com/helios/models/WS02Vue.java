package com.helios.models;

import java.util.List;

public class WS02Vue {
	
	private String idEntiteJuridique;
	private String reference;
	private String raisonSociale;
	private String siren;
	private String risqueLiquidationJudiciaire;
	private String segmentCommercial;
	private String source;
	private String enseigne;
	private String statut;
	private String approche;
	private String nbInterlocuteurs;

	private List<InterlocuteurWS02Vue> interlocuteurs;

	public String getIdEntiteJuridique() {
		return idEntiteJuridique;
	}

	public void setIdEntiteJuridique(String idEntiteJuridique) {
		this.idEntiteJuridique = idEntiteJuridique;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}

	public String getRisqueLiquidationJudiciaire() {
		return risqueLiquidationJudiciaire;
	}

	public void setRisqueLiquidationJudiciaire(String risqueLiquidationJudiciaire) {
		this.risqueLiquidationJudiciaire = risqueLiquidationJudiciaire;
	}

	public String getSegmentCommercial() {
		return segmentCommercial;
	}

	public void setSegmentCommercial(String segmentCommercial) {
		this.segmentCommercial = segmentCommercial;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getEnseigne() {
		return enseigne;
	}

	public void setEnseigne(String enseigne) {
		this.enseigne = enseigne;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getApproche() {
		return approche;
	}

	public void setApproche(String approche) {
		this.approche = approche;
	}

	public String getNbInterlocuteurs() {
		return nbInterlocuteurs;
	}

	public void setNbInterlocuteurs(String nbInterlocuteurs) {
		this.nbInterlocuteurs = nbInterlocuteurs;
	}

	public List<InterlocuteurWS02Vue> getInterlocuteurs() {
		return interlocuteurs;
	}

	public void setInterlocuteurs(List<InterlocuteurWS02Vue> interlocuteurs) {
		this.interlocuteurs = interlocuteurs;
	}
	
	

}
