package com.helios.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.helios.models.EntiteJuridique;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RequestMapping("/")
public interface EntiteJuridiqueController {
	
	 /**
     * Récupère des données concernant la vue 360° Entité Juridique
     * @param id
     * @return La vue 360 de Entité Juridique au format json
     */
    @ApiOperation(value="Récupération des données concernant la vue 360° Entité Juridique", notes="Service NAMEK")
    @RequestMapping(value = "/v0/vue360/ej/{id}/", params="{id}",method = RequestMethod.GET)
  	public ResponseEntity<EntiteJuridique> getEJ(@PathVariable(value="id") String id);
  	
    
    /**
     * Recuperation des données concernant l'interlocuteur
     * @param id_EntiteJ
     * @param Val_A_Rechercher
     * @param nbEnreg
     * @return
     */
    @ApiOperation(value="Récupération des données concernant entite juridique", notes="Service Namek (USW6 et USW5)")
    @RequestMapping(method = RequestMethod.GET,params = {"id_EntiteJ"}, value = "/v0/recherche/ej/interlocuteur/{id_EntiteJ}")
    public ResponseEntity<List<EntiteJuridique>> findAllEJVal(@ApiParam(value = "id entite juridique") @PathParam("id entite juridique") String id_EntiteJ,
    																		@ApiParam(value = "Valeur à rechercher") @PathVariable(value ="Valeur à rechercher") String Val_A_Rechercher,
    																		@ApiParam(value = "nombre d'enregistrements à retourner") @PathVariable(value="nombre d'enregistrements à retourner") String nbEnreg);
    
    /**
     * Recuperation des données concernant l'entités juridiques associées à un interlocuteur dans une pop up
     * @param id_EntiteJ
     * @param Val_A_Rechercher
     * @param nbEnreg
     * @return
     */
    @ApiOperation(value="Recuperation des données concernant l'entités juridiques associées à un interlocuteur dans une pop up", notes="Service Namek (USW6 et USW5)")
    @RequestMapping(method = RequestMethod.GET,params = {"id_inter"}, value = "/v0/recherche/ej/interlocuteur/")
    public ResponseEntity<List<EntiteJuridique>> findAllEJID(@ApiParam(value = "id <") @PathParam("id Interlocuteur") String id_inter,
    		@ApiParam(value = "nbEnreg", name="nombre d'enregistrements à retourner",defaultValue = "20",required = false) @PathVariable(value="nombre d'enregistrements à retourner") String nbEnreg);
    
}
	

