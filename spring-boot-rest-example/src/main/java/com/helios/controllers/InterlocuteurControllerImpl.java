package com.helios.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.helios.models.Interlocuteur;
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
	List<String> tmp = new ArrayList<>();
	tmp.add(id_EntiteJ);
	ResponseEntity<List<Interlocuteur>> listInterlocuteur = new ResponseEntity<>(repository.findAll(tmp), HttpStatus.OK);
	if (Val_A_Rechercher.equals("")){
		//if (reposi)
	}else{
		
	}
	return null;
}

  
//  /**
//   * 
//   * @param id
//   * @return
//   */
//  @ApiOperation(value="Récupération des données concernant la vue 360° interlocuteur", notes="Service NAMEK")
//  @RequestMapping(method = RequestMethod.GET, params = {"id"}, value = "/{id}")
//	public ResponseEntity<Interlocuteur> getInterlocuteur(@ApiParam(value = "id intelocuteur") @PathParam("id intelocuteur") String id) {
//		return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
//	}

}
