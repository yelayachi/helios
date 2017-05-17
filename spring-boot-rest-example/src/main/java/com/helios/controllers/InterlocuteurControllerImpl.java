package com.helios.controllers;

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
