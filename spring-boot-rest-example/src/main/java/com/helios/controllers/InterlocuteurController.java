package com.helios.controllers;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.helios.models.Interlocuteur;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RequestMapping("/vue360/interlocuteur")
public interface InterlocuteurController {


    
    
    
    /**
     * Récupération des données concernant la vue 360° interlocuteur
     * @param id
     * @return
     */
    @ApiOperation(value="Récupération des données concernant la vue 360° interlocuteur", notes="Service NAMEK")
    @RequestMapping(method = RequestMethod.GET, params = {"id"}, value = "/{id}")
  	public ResponseEntity<Interlocuteur> getInterlocuteur(@ApiParam(value = "id intelocuteur") @PathParam("id intelocuteur") String id);
  	
}
