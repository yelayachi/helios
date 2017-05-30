package com.helios.models;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EntiteJuridique {
	 
	@Id
	private String idEntiteJuridique;
	private String reference;
	private String raisonSociale;
	private String siren;
	private String risqueLiquidationJudiciaire;
	private String segmentCommercial;
	@OneToMany
	private List<Interlocuteur> listInter;
	
	
	
	public EntiteJuridique(String idEntiteJuridique, String reference, String raisonSociale, String siren,
			String risqueLiquidationJudiciaire, String segmentCommercial) {

		this.idEntiteJuridique = idEntiteJuridique;
		this.reference = reference;
		this.raisonSociale = raisonSociale;
		this.siren = siren;
		this.risqueLiquidationJudiciaire = risqueLiquidationJudiciaire;
		this.segmentCommercial = segmentCommercial;
	}
	
	public EntiteJuridique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EntiteJuridique(String idEntiteJuridique, String reference, String raisonSociale, String siren,
			String risqueLiquidationJudiciaire, String segmentCommercial, List<Interlocuteur>  list) {

		this.idEntiteJuridique = idEntiteJuridique;
		this.reference = reference;
		this.raisonSociale = raisonSociale;
		this.siren = siren;
		this.risqueLiquidationJudiciaire = risqueLiquidationJudiciaire;
		this.segmentCommercial = segmentCommercial;
		this.listInter = list;
	}


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

	public List<Interlocuteur> getListInter() {
		return listInter;
	}

	public void setListInter(List<Interlocuteur> listInter) {
		this.listInter = listInter;
	}
	
	}
