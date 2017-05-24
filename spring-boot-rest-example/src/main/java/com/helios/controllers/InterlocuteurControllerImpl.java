package com.helios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RestController;

import com.helios.models.Interlocuteur;
import com.helios.models.InterlocuteurUtilitaires;
import com.helios.repositories.InterlocuteurRepository;

@RestController
public class InterlocuteurControllerImpl implements InterlocuteurController {

	
  @Autowired
  private InterlocuteurRepository repository;

@Override
public ResponseEntity<Interlocuteur> getInterlocuteur(String id) {
	return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
}

@Override
public ResponseEntity<List<Interlocuteur>> findAllInterlocuteur(String id_EntiteJ, String Val_A_Rechercher,
		String nbEnreg) {
	
	//list de parametre a passer a la fonction findAll()
//	List<String> tmp = new ArrayList<>();
//	tmp.add(id_EntiteJ);
	
	//On faire un requete pour recuperer tous les interlocuteurs associes a une entite juridique "id_EntiteJ"
	ResponseEntity<List<Interlocuteur>> listInterlocuteur = new ResponseEntity<>(InterlocuteurUtilitaires.getAllByID(repository.findAll(),id_EntiteJ), HttpStatus.OK);
	
	if (Val_A_Rechercher == null || Val_A_Rechercher.equals("")){
		//cas USW6
		return InterlocuteurUtilitaires.getFixeSize(listInterlocuteur,Integer.valueOf(nbEnreg));
	}
	//cas USW5
	
	ResponseEntity<List<Interlocuteur>> result= InterlocuteurUtilitaires.getFixeSize(InterlocuteurUtilitaires.getAllMath(listInterlocuteur, Val_A_Rechercher),Integer.parseInt(nbEnreg));
	
	MultiValueMap<String,String> header = new HttpHeaders();
	header.add("nbResult", result.getBody().size()+"");
	
	return new ResponseEntity<>(result.getBody(),header ,HttpStatus.OK);
	
}

}
