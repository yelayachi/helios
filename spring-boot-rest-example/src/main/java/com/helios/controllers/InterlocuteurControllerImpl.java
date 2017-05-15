package com.helios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.helios.models.Interlocuteur;
import com.helios.repositories.InterlocuteurRepository;

public class InterlocuteurControllerImpl implements InterlocuteurController {

  @Autowired
  private InterlocuteurRepository repository;
	
	@Override
	public ResponseEntity<List<Interlocuteur>> getInterlocuteur(String id) {
		return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
	}

}
