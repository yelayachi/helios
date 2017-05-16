package com.helios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.helios.models.Interlocuteur;
import com.helios.repositories.InterlocuteurRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/vue360/interlocuteur")
public class InterlocuteurControllerImpl {

	
  @Autowired
  private InterlocuteurRepository repository;
	
  @ApiOperation(value="", notes="permet de rechercher un interlocuteur à partir de son id")
  @RequestMapping(method = RequestMethod.GET, params = {"id"}, value = "/{id}")
	public ResponseEntity<Interlocuteur> getInterlocuteur(String id) {
		return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
	}

}
