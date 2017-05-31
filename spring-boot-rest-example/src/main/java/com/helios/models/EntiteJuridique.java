package com.helios.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class EntiteJuridique {
	
	@Id
	private String idEntiteJuridique;
	private String reference;
	private String raisonSociale;
	private String SegmenCommercial;
	private String segmentMarqueting;
	private String siren;
	private String siret;
	private String ValeurClient;
	private String risqueLiquidationJudiciaire;
	private String marche;
	private String marque;
	private boolean sensibiliteCoupure;
	private String adresse;
	private String commune;
	private String segmentCommercial;
	private String enseigne;
	private String statut;
	private String approche;
	private String source;
	private String typeEntite;
	private String formeJuridique;
	private String activitePrincipale;
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
	private String villeRcs;
	private String dateInscriptionRcs;
	@OneToOne 
	private Etablissement etablissement;
	@OneToOne
	private SourceSiret siretExistant;
	@ManyToMany
	private List<Interlocuteur> listInter;

	public EntiteJuridique(String idEntiteJuridique, String reference, String raisonSociale, String segmenCommercial,
			String segmentMarqueting, String siren, String siret, String valeurClient,
			String risqueLiquidationJudiciaire, String marche, String marque, boolean sensibiliteCoupure, String adresse,
			String commune, String segmentCommercial, String enseigne, String statut, String approche, String source,
			String typeEntite, String formeJuridique, String activitePrincipale, String dateCreation, String codeApe,
			String libelleApe, String adresse1, String adresse2, String adresse3, String adresse4, String adresse5,
			String adresse6, String numeroRcs, String villeRcs, String dateInscriptionRcs, Etablissement etablissement,
			SourceSiret siretExistant, List<Interlocuteur> listInter) {
		this.idEntiteJuridique = idEntiteJuridique;
		this.reference = reference;
		this.raisonSociale = raisonSociale;
		SegmenCommercial = segmenCommercial;
		this.segmentMarqueting = segmentMarqueting;
		this.siren = siren;
		this.siret = siret;
		ValeurClient = valeurClient;
		this.risqueLiquidationJudiciaire = risqueLiquidationJudiciaire;
		this.marche = marche;
		this.marque = marque;
		this.sensibiliteCoupure = sensibiliteCoupure;
		this.adresse = adresse;
		this.commune = commune;
		this.segmentCommercial = segmentCommercial;
		this.enseigne = enseigne;
		this.statut = statut;
		this.approche = approche;
		this.source = source;
		this.typeEntite = typeEntite;
		this.formeJuridique = formeJuridique;
		this.activitePrincipale = activitePrincipale;
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
		this.villeRcs = villeRcs;
		this.dateInscriptionRcs = dateInscriptionRcs;
		this.etablissement = etablissement;
		this.siretExistant = siretExistant;
		this.listInter = listInter;
	}

	public EntiteJuridique(String idEntiteJuridique, String reference, String raisonSociale, String segmenCommercial,
			String segmentMarqueting, String siren, String siret, String valeurClient,
			String risqueLiquidationJudiciaire, String marche, String marque, boolean sensibiliteCoupure, String adresse,
			String commune, String segmentCommercial, String enseigne, String statut, String approche, String source,
			String typeEntite, String formeJuridique, String activitePrincipale, String dateCreation, String codeApe,
			String libelleApe, String adresse1, String adresse2, String adresse3, String adresse4, String adresse5,
			String adresse6, String numeroRcs, String villeRcs, String dateInscriptionRcs, Etablissement etablissement,
			SourceSiret siretExistant) {
		this.idEntiteJuridique = idEntiteJuridique;
		this.reference = reference;
		this.raisonSociale = raisonSociale;
		SegmenCommercial = segmenCommercial;
		this.segmentMarqueting = segmentMarqueting;
		this.siren = siren;
		this.siret = siret;
		ValeurClient = valeurClient;
		this.risqueLiquidationJudiciaire = risqueLiquidationJudiciaire;
		this.marche = marche;
		this.marque = marque;
		this.sensibiliteCoupure = sensibiliteCoupure;
		this.adresse = adresse;
		this.commune = commune;
		this.segmentCommercial = segmentCommercial;
		this.enseigne = enseigne;
		this.statut = statut;
		this.approche = approche;
		this.source = source;
		this.typeEntite = typeEntite;
		this.formeJuridique = formeJuridique;
		this.activitePrincipale = activitePrincipale;
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
		this.villeRcs = villeRcs;
		this.dateInscriptionRcs = dateInscriptionRcs;
		this.etablissement = etablissement;
		this.siretExistant = siretExistant;
		this.listInter = new ArrayList<>();
	}

	
	public EntiteJuridique() {
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

	public String getSegmenCommercial() {
		return SegmenCommercial;
	}

	public void setSegmenCommercial(String segmenCommercial) {
		SegmenCommercial = segmenCommercial;
	}

	public String getSegmentMarqueting() {
		return segmentMarqueting;
	}

	public void setSegmentMarqueting(String segmentMarqueting) {
		this.segmentMarqueting = segmentMarqueting;
	}

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getValeurClient() {
		return ValeurClient;
	}

	public void setValeurClient(String valeurClient) {
		ValeurClient = valeurClient;
	}

	public String getRisqueLiquidationJudiciaire() {
		return risqueLiquidationJudiciaire;
	}

	public void setRisqueLiquidationJudiciaire(String risqueLiquidationJudiciaire) {
		this.risqueLiquidationJudiciaire = risqueLiquidationJudiciaire;
	}

	public String getMarche() {
		return marche;
	}

	public void setMarche(String marche) {
		this.marche = marche;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public boolean getSensibiliteCoupure() {
		return sensibiliteCoupure;
	}

	public void setSensibiliteCoupure(boolean sensibiliteCoupure) {
		this.sensibiliteCoupure = sensibiliteCoupure;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getSegmentCommercial() {
		return segmentCommercial;
	}

	public void setSegmentCommercial(String segmentCommercial) {
		this.segmentCommercial = segmentCommercial;
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTypeEntite() {
		return typeEntite;
	}

	public void setTypeEntite(String typeEntite) {
		this.typeEntite = typeEntite;
	}

	public String getFormeJuridique() {
		return formeJuridique;
	}

	public void setFormeJuridique(String formeJuridique) {
		this.formeJuridique = formeJuridique;
	}

	public String getActivitePrincipale() {
		return activitePrincipale;
	}

	public void setActivitePrincipale(String activitePrincipale) {
		this.activitePrincipale = activitePrincipale;
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

	public String getVilleRcs() {
		return villeRcs;
	}

	public void setVilleRcs(String villeRcs) {
		this.villeRcs = villeRcs;
	}

	public String getDateInscriptionRcs() {
		return dateInscriptionRcs;
	}

	public void setDateInscriptionRcs(String dateInscriptionRcs) {
		this.dateInscriptionRcs = dateInscriptionRcs;
	}

	public Etablissement getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(Etablissement etablissement) {
		this.etablissement = etablissement;
	}

	public SourceSiret getSiretExistant() {
		return siretExistant;
	}

	public void setSiretExistant(SourceSiret siretExistant) {
		this.siretExistant = siretExistant;
	}

	public List<Interlocuteur> getListInter() {
		return listInter;
	}

	public void setListInter(List<Interlocuteur> listInter) {
		this.listInter = listInter;
	}
	
	public void addListInterlocuteur(List<Interlocuteur> i){
		this.listInter=i;
	}
}

