package com.helios.util;


import java.util.ArrayList;
import java.util.List;

import com.helios.models.EntiteJuridique;
import com.helios.models.EntiteJuridiqueVue;
import com.helios.models.Interlocuteur;
import com.helios.models.InterlocuteurWS02Vue;
import com.helios.models.WS01Vue;
import com.helios.models.WS02Vue;
import com.helios.models.WS03Vue;
import com.helios.models.WS0506Vue;

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
		ws01.setTelephone(interlocuteur.getTelephoneFixe());
		ws01.setTelephoneMobile(interlocuteur.getTelephoneMobile());
		ws01.setNbEntitesJuridiques(interlocuteur.getNbEntitesJuridiques());
		List<EntiteJuridiqueVue> entitesJuridiques = new ArrayList<>();
		if (interlocuteur.getEntitesJuridiques() != null)
			for (EntiteJuridique entiteJuridique : interlocuteur.getEntitesJuridiques()) {
				EntiteJuridiqueVue entiteJuridiqueVue = new EntiteJuridiqueVue();
				entiteJuridiqueVue.setIdEntiteJuridique(entiteJuridique.getIdEntiteJuridique());
				entiteJuridiqueVue.setRaisonSociale(entiteJuridique.getRaisonSociale());
				entiteJuridiqueVue.setReference(entiteJuridique.getReference());
				entiteJuridiqueVue.setSegmentCommercial(entiteJuridique.getSegmentCommercial());
				entiteJuridiqueVue.setSiren(entiteJuridique.getSiren());
				entiteJuridiqueVue.setSource(entiteJuridique.getSource());
				entiteJuridiqueVue.setRisqueLiquidationJudiciaire(entiteJuridique.getRisqueLiquidationJudiciaire());
				entitesJuridiques.add(entiteJuridiqueVue);
			}
		ws01.setEntitesJuridiques(entitesJuridiques);
		return ws01;
	}

	/**
	 * 
	 * @param entiteJuridique
	 * @return
	 */

	public static WS02Vue traduireToWS02(EntiteJuridique entiteJuridique) {
		WS02Vue ws02Vue = new WS02Vue();
		// ws02Vue.setApproche(entiteJuridique);
		// ws02Vue.setEnseigne(entiteJuridique.gete);
		ws02Vue.setIdEntiteJuridique(entiteJuridique.getIdEntiteJuridique());
		ws02Vue.setRaisonSociale(entiteJuridique.getRaisonSociale());
		ws02Vue.setRisqueLiquidationJudiciaire(entiteJuridique.getRisqueLiquidationJudiciaire());
		ws02Vue.setSegmentCommercial(entiteJuridique.getSegmentCommercial());
		// ws02Vue.setSource(entiteJuridique.gets);
		// ws02Vue.setNbInterlocuteurs(entiteJuridique.getn);
		// ws02Vue.setStatut(entiteJuridique.gets);

		List<InterlocuteurWS02Vue> interlocuteurs = new ArrayList<>();
		if (entiteJuridique.getListInter() != null)
			for (Interlocuteur interlocuteur : entiteJuridique.getListInter()) {
				InterlocuteurWS02Vue interlocuteurWS02Vue = new InterlocuteurWS02Vue();
				interlocuteurWS02Vue.setCivilite(interlocuteur.getCivilite());
				interlocuteurWS02Vue.setEmail(interlocuteur.getEmail());
				// interlocuteurWS02Vue.setEspaceClient(interlocuteur.gete);
				interlocuteurWS02Vue.setFonction(interlocuteur.getFonction());
				interlocuteurWS02Vue.setIdInterlocuteur(interlocuteur.getIdInterlocuteur());
				interlocuteurWS02Vue.setNom(interlocuteur.getNom());
				interlocuteurWS02Vue.setPrenom(interlocuteur.getPrenom());
				interlocuteurWS02Vue.setStatutEspaceClient(interlocuteur.getStatutEspaceClient());
				interlocuteurWS02Vue.setTelephone(interlocuteur.getTelephoneFixe());
				interlocuteurWS02Vue.setTelephoneMobile(interlocuteur.getTelephoneMobile());
				interlocuteurs.add(interlocuteurWS02Vue);
			}
		ws02Vue.setInterlocuteurs(interlocuteurs);

		return ws02Vue;
	}

	/**
	 * 
	 * @param entiteJuridique
	 * @return
	 */
	public static List<WS03Vue> traduireToWS0304(List<EntiteJuridique> entiteJuridique) {
		
		List<WS03Vue> listWs03vue = new ArrayList<>();
		
		for (EntiteJuridique entiteJ : entiteJuridique) {
			WS03Vue ws03vue = new WS03Vue();
			//ws03vue.setAdresse(entiteJuridique.get);
			ws03vue.setIdEntiteJuridique(entiteJ.getIdEntiteJuridique());
			ws03vue.setRaisonSociale(entiteJ.getRaisonSociale());
			ws03vue.setReference(entiteJ.getReference());
			ws03vue.setSegmentCommercial(entiteJ.getSegmentCommercial());
			ws03vue.setRisqueLiquidationJudiciaire(entiteJ.getRisqueLiquidationJudiciaire());
			ws03vue.setSiren(entiteJ.getSiren());
			//ws03vue.setSensibiliteCoupure(entiteJ.getsen);
			if(entiteJ.getListInter() != null)
			ws03vue.setNbInterlocuteurs(String.valueOf(entiteJ.getListInter().size()));
			//ws03vue.setMarche(entiteJ.getma));
			//ws03vue.setApproche(entiteJ.getap);
			listWs03vue.add(ws03vue);
		}
		
		return listWs03vue;
	}

    public static List<WS0506Vue> traduireToWS0506Vue(List<Interlocuteur> interlocuteurs) {

    	List<WS0506Vue> result = new ArrayList<>();
    	
    	for (Interlocuteur interlocuteur : interlocuteurs){
	    	
    		WS0506Vue ws0506 = new WS0506Vue();
	
			ws0506.setCivilite(interlocuteur.getCivilite());
			ws0506.setEmail(interlocuteur.getEmail());
			ws0506.setFonction(interlocuteur.getFonction());
			ws0506.setIdInterlocuteur(interlocuteur.getIdInterlocuteur());
			ws0506.setNom(interlocuteur.getNom());
			ws0506.setEspaceClient(interlocuteur.getEspaceClient()+"");
			ws0506.setStatutEspaceClient(interlocuteur.getStatutEspaceClient()+"");
			ws0506.setPreferenceContact(interlocuteur.getPrefCanalContact());
			ws0506.setCommentaire(interlocuteur.getCommentaire());
			ws0506.setPrenom(interlocuteur.getPrenom());
			ws0506.setTelephoneFixe(interlocuteur.getTelephoneFixe());
			ws0506.setTelephoneMobile(interlocuteur.getTelephoneMobile());
			
			result.add(ws0506);
    	}
		return result;
	}
}
