package com.helios.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class EntiteJuridiqueUtilitaires {
	/**
	 * Retourne un boolean si nous avons des paramatres null
	 * @param param
	 * @return un booléen 
	 */
	public static boolean testNull(String param){
		if(param == null || param == "")
			return false;
		else
			return true;
	}
	
	/**
	 * Retourne une liste comme un sous ensemble de taille size d'une liste d'entite juridique
	 * @param entiteJuridique : ResponseEntity<List<Interlocuteur>>
	 * @param size : int
	 * @return une liste d'entite juridique
	 */
	public static List<EntiteJuridique> getFixeSize(List<EntiteJuridique> entiteJuridique, int size){
			
			List<EntiteJuridique> resultTmp = new ArrayList<EntiteJuridique>(size);
			
			for ( int i=0;i<entiteJuridique.size();i++){
				resultTmp.add(entiteJuridique.get(i));
			}
			List<EntiteJuridique> resultList = resultTmp;
			return resultList;
		}
	
	public static List<EntiteJuridique> getAllByID(List<EntiteJuridique> entiteJuridique, String id){
			
			List<EntiteJuridique> resultList = new ArrayList<>();
			
			for (EntiteJuridique i : entiteJuridique){
				
				for (Interlocuteur e :i.getListInter()){
					if (e.getIdInterlocuteur().equals(id)){
						resultList.add(i);
						break;
					}
				}
			}
			return resultList;
			
			
		}
	/**
	 * Permet d'appliquer un filtre s sur les entitées juridique 
	 * @param i : Entité juridique
	 * @param s :  String
	 * @return true si l'un des attribut de l'entite juridique match, false sinon
	 */
	public static boolean isMatch(EntiteJuridique i, String s){
		
		if (i.getIdEntiteJuridique().contains(s) || i.getRaisonSociale().contains(s) || i.getReference().contains(s) || i.getSiren().contains(s) || 
			i.getRisqueLiquidationJudiciaire().contains(s) || i.getSegmentCommercial().contains(s)){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Permet de filtrer tout les entitées juridues qui matchent avec s.
	 * @param entité juridique : List<entitejuridique>
	 * @param s : String
	 * @return Une liste d'entité juridique
	 */
	public static List<EntiteJuridique> getAllMath(List<EntiteJuridique> entiteJuridique, String s){
		
		//La liste qui va contenir les entitées Juridique qui matchent s
		List<EntiteJuridique> result = new ArrayList<EntiteJuridique>();
		
		for (EntiteJuridique i : entiteJuridique){
			//Il faudra prendre en compte dans l'implementation reelle les donnees flagees supprimees
			if (isMatch(i, s)){
				result.add(i);
			}
		}
		List<EntiteJuridique> resultList = result;
		return resultList;
		
	}

}
