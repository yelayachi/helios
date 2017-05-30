package com.helios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.helios.models.EntiteJuridique;
import com.helios.models.EntiteJuridiqueUtilitaires;
import com.helios.repositories.EntiteJuridiqueRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v0")
public class EntiteJuridiqueControllerImpl{

	@Autowired
	private EntiteJuridiqueRepository repository;
	
	/**
     * Récupère des données concernant la vue 360° Entité Juridique
     * @param id
     * @return La vue 360 de Entité Juridique au format json
     */
	@RequestMapping(value = "/vue360/ej/{id}/", method = RequestMethod.GET)
	@ApiOperation(value="Récupération des données concernant la vue 360° Entité Juridique", notes="Service NAMEK")
	public ResponseEntity<EntiteJuridique> getEJ(@PathVariable(value="id") String id) {
		return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
	}
	

    /**
     * Recuperation des données concernant l'interlocuteur a parti de l'id de l'entite juridique
     * @param id_EntiteJ
     * @param Val_A_Rechercher
     * @param nbEnreg
     * @return
     */
	 @ApiOperation(value="Récupération des données concernant entite juridique", notes="Service Namek (USW6 et USW5)")
	 @RequestMapping(method = RequestMethod.GET, value = "/recherche/ej/interlocuteur/{id_EntiteJ}")
	 public ResponseEntity<List<EntiteJuridique>> findAllEJVal(@PathVariable(value="id_EntiteJ") String id_EntiteJ, @RequestParam(required = false)String Val_A_Rechercher,
			@RequestParam(required = false, defaultValue="20") String nbEnreg) {
		 if(Val_A_Rechercher == null || Val_A_Rechercher.equals("")){
			 ResponseEntity<List<EntiteJuridique>> listEntiteJuridique = new ResponseEntity<>(EntiteJuridiqueUtilitaires.getAllByID(repository.findAll(),id_EntiteJ), HttpStatus.OK);
			 return EntiteJuridiqueUtilitaires.getFixeSize(listEntiteJuridique,Integer.valueOf(nbEnreg));
		 }
		ResponseEntity<List<EntiteJuridique>> listEntiteJuridique = new ResponseEntity<>(EntiteJuridiqueUtilitaires.getAllByID(repository.findAll(),id_EntiteJ), HttpStatus.OK);
		ResponseEntity<List<EntiteJuridique>> result= EntiteJuridiqueUtilitaires.getFixeSize(EntiteJuridiqueUtilitaires.getAllMath(listEntiteJuridique, Val_A_Rechercher),Integer.valueOf(nbEnreg));

		MultiValueMap<String,String> header = new HttpHeaders();
		header.add("nbResult", result.getBody().size()+"");
		
		return new ResponseEntity<>(result.getBody(),header ,HttpStatus.OK);
	}
	 /**
	  * Récupération des entités juridiques a parti du siret
	  * @param siret
	  * @param nbEnreg
	  * @return
	  */
	 @ApiOperation(value="Récupération des entités juridiques a parti du siret", notes="Service Altair (USW07)")
	 @RequestMapping(method = RequestMethod.GET, value = "/recherche/ej/")
	 public ResponseEntity<List<EntiteJuridique>> findAllEJBySiret(@RequestParam(required = true)String siret,
			@RequestParam(required = false, defaultValue="20") String nbEnreg) {
		 return new ResponseEntity<>(repository.findAllBySiret(siret), HttpStatus.OK);
		
	 }
}
