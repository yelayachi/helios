package com.helios.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.helios.models.Interlocuteur;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RequestMapping("/")
public interface InterlocuteurController {
 
    /**
     * Récupère des données concernant la vue 360° Interlocuteur
     * @param id
     * @return La vue 360 d'un Interlocuteur au format json
     */
    @ApiOperation(value="Récupération des données concernant la vue 360° interlocuteur", notes="Service NAMEK")
    @RequestMapping(method = RequestMethod.GET, params = {"id"}, value = "/v0/vue360/interlocuteur/{id}")
  	public ResponseEntity<Interlocuteur> getInterlocuteur(@ApiParam(value = "id interlocuteur") @PathParam("id interlocuteur") String id);
  	
    
    /**
     * Recuperation des données concernant l'interlocuteur
     * @param id_EntiteJ
     * @param Val_A_Rechercher
     * @param nbEnreg
     * @return
     */
    @ApiOperation(value="Récupération des données concernant l'interlocuteur (client)", notes="Service Namek (USW6 et USW5)")
    @RequestMapping(method = RequestMethod.GET,params = {"id_EntiteJ","Val_A_Rechercher","nbEnreg"}, value = "/v0/recherche/interloceteur/ej/{id_EntiteJ}")
    public ResponseEntity<List<Interlocuteur>> findAllInterlocuteur(@ApiParam(value = "id entite juridique") @PathParam("id entite juridique") String id_EntiteJ,
    		@ApiParam(value = "Val_A_Rechercher", name="Valeur à rechercher",required = false) @PathVariable(value ="Valeur à rechercher") String Val_A_Rechercher,
    		@ApiParam(value = "nbEnreg", name="nombre d'enregistrements à retourner",defaultValue = "20",required = false) @PathVariable(value="nombre d'enregistrements à retourner") String nbEnreg) ;
    
}
