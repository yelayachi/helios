package com.helios.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class InterlocuteurUtilitaires {

	/**
	 * Permet d'appliquer un filtre s sur un interlocuteur 
	 * @param i : Interlocuteur
	 * @param s :  String
	 * @return true si l'un des attribut de l'interlocuteur match, false sinon
	 */
	public static boolean isMatch(Interlocuteur i, String s){
		
		if (i.getIdInterlocuteur().contains(s) || i.getCivilite().contains(s) || i.getNom().contains(s) || i.getPrenom().contains(s) || 
			i.getTelephone().contains(s) || i.getTelephoneMobile().contains(s) ||	i.getEmail().contains(s) || i.getFonction().contains(s) ||
			i.getEspaceMembre().contains(s) ||	i.getRole().contains(s) ||	i.getPrefCanalContact().contains(s) ||	i.getCommentaire().contains(s) ||
			i.getAccesInternetActif().contains(s) || i.getStatutEspaceClient().contains(s)){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Permet de filtrer tout les interlocuteurs qui matchent avec s.
	 * @param interlocuteurs : List<Interlocuteur>
	 * @param s : String
	 * @return Une liste d'interlocuteurs
	 */
	public static ResponseEntity<List<Interlocuteur>> getAllMath(ResponseEntity<List<Interlocuteur>> interlocuteurs, String s){
		
		//La liste qui va contenir les interlocuteurs qui matchent s
		List<Interlocuteur> result = new ArrayList<Interlocuteur>();
		
		for (Interlocuteur i : interlocuteurs.getBody()){
			//Il faudra prendre en compte dans l'implementation reelle les donnees flagees supprimees
			if (isMatch(i, s)){
				result.add(i);
			}
		}
		ResponseEntity<List<Interlocuteur>> resultList = new ResponseEntity<>(result, HttpStatus.OK);
		return resultList;
		
	}
	
	/**
	 * Retourne une liste comme un sous ensemble de taille size d'une liste d'interlocuteurs
	 * @param interlocuteurs : ResponseEntity<List<Interlocuteur>>
	 * @param size : int
	 * @return une liste d'interlocuteurs
	 */
	public static ResponseEntity<List<Interlocuteur>> getFixeSize(ResponseEntity<List<Interlocuteur>> interlocuteurs, int size){
		
		List<Interlocuteur> resultTmp = new ArrayList<Interlocuteur>(size);
		
		for ( int i=0;i<=size;i++){
			resultTmp.add(interlocuteurs.getBody().get(i));
		}
		ResponseEntity<List<Interlocuteur>> resultList = new ResponseEntity<>(resultTmp, HttpStatus.OK);
		return resultList;
	}
	
	public static List<Interlocuteur> getAllByID(List<Interlocuteur> interlocuteurs, String id){
		
		List<Interlocuteur> resultList = new ArrayList<>();
		
		for (Interlocuteur i : interlocuteurs){
			
			for (EntiteJuridique e :i.getEntitesJuridiques()){
				if (e.getIdEntiteJuridique().equals(id)){
					resultList.add(i);
					break;
				}
			}
		}
		return interlocuteurs;
		
		
	}
	
}
