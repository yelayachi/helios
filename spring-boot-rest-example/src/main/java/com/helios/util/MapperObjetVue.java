package com.helios.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.helios.models.EntiteJuridique;
import com.helios.models.EntiteJuridiqueVue;
import com.helios.models.Interlocuteur;
import com.helios.models.WS01Vue;

public class MapperObjetVue {

	
	/**
	 * 
	 * @param interlocuteur
	 * @return
	 */
	public static WS01Vue traduireToWS01Vue(Interlocuteur interlocuteur) {
		
		WS01Vue ws01 = new WS01Vue();
		
		ws01.setCivilite(interlocuteur.getCivilite());
		ws01.setEmail(interlocuteur.getEmail());
		ws01.setEspaceMembre(interlocuteur.getEspaceMembre());
		ws01.setFonction(interlocuteur.getFonction());
		ws01.setIdInterlocuteur(interlocuteur.getIdInterlocuteur());
		ws01.setNom(interlocuteur.getNom());
		ws01.setPrenom(interlocuteur.getPrenom());
		ws01.setTelephone(interlocuteur.getTelephone());
		ws01.setTelephoneMobile(interlocuteur.getTelephoneMobile());
		List<EntiteJuridiqueVue>  entitesJuridiques = new ArrayList<>();
		if(interlocuteur.getEntitesJuridiques() != null)
		for (EntiteJuridique entiteJuridique : interlocuteur.getEntitesJuridiques()) {
			EntiteJuridiqueVue entiteJuridiqueVue = new EntiteJuridiqueVue();
			entiteJuridiqueVue.setIdEntiteJuridique(entiteJuridique.getIdEntiteJuridique());
			entiteJuridiqueVue.setRaisonSociale(entiteJuridique.getRaisonSociale());
			entiteJuridiqueVue.setReference(entiteJuridique.getReference());
			entiteJuridiqueVue.setSegmentCommercial(entiteJuridique.getSegmentCommercial());
			entiteJuridiqueVue.setSiren(entiteJuridique.getSiren());
			//entiteJuridiqueVue.setSource(entiteJuridique.gets);
			entiteJuridiqueVue.setRisqueLiquidationJudiciaire(entiteJuridique.getRisqueLiquidationJudiciaire());
			entitesJuridiques.add(entiteJuridiqueVue);
		}
		ws01.setEntitesJuridiques(entitesJuridiques);		
		return ws01;
	}
	
	
	

}
