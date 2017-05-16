package com.helios.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EntiteJuridique {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long idEntiteJuridique;
	private String reference;
	private String raisonSociale;
	private String siren;
	private String risqueLiquidationJudiciaire;
	private String segmentCommercial;
	
	public EntiteJuridique() {		
	}
	
	public EntiteJuridique(Long idEntiteJuridique, String reference, String raisonSociale, String siren,
			String risqueLiquidationJudiciaire, String segmentCommercial) {

		this.idEntiteJuridique = idEntiteJuridique;
		this.reference = reference;
		this.raisonSociale = raisonSociale;
		this.siren = siren;
		this.risqueLiquidationJudiciaire = risqueLiquidationJudiciaire;
		this.segmentCommercial = segmentCommercial;
	}

	public Long getIdEntiteJuridique() {
		return idEntiteJuridique;
	}

	public void setIdEntiteJuridique(Long idEntiteJuridique) {
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

	
	}
