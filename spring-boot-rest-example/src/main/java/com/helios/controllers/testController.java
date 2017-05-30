package com.helios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.helios.models.EntiteJuridique;
import com.helios.repositories.EntiteJuridiqueRepository;

@RestController
public class testController {
	
	@Autowired
	private EntiteJuridiqueRepository repository;
	
	@RequestMapping(value = "/test/v0/vue360/ej/{id}/", method = RequestMethod.GET)
	public ResponseEntity<EntiteJuridique> getEJE(@PathVariable(value="id") String id,
			@RequestParam(required = false) String test) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
	}

}
