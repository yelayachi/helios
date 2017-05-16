package com.helios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.helios.models.Interlocuteur;
import com.helios.repositories.InterlocuteurRepository;

@RestController
@RequestMapping("/interlocuteurs")
public class InterlocuteurControllerImpl {

  @Autowired
  private InterlocuteurRepository repository;
	
  @RequestMapping(method = RequestMethod.GET, params = {"id"}, value = "/{id}")
	public ResponseEntity<Interlocuteur> getInterlocuteur(Long id) {
		return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
	}

}
