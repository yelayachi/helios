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
import com.helios.models.WS01Vue;
import com.helios.models.WS02Vue;
import com.helios.models.WS03Vue;
import com.helios.repositories.EntiteJuridiqueRepository;
import com.helios.util.MapperObjetVue;

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
	@ApiOperation(value="Récupération des données concernant la vue 360° Entité Juridique", notes="Service NAMEK")
	@RequestMapping(method = RequestMethod.GET,value = "/vue360/ej/{id}/")
	public ResponseEntity<WS02Vue> getEJ(@PathVariable(value="id") String id) {
		return new ResponseEntity<>(MapperObjetVue.traduireToWS02(repository.findOne(id)), HttpStatus.OK);
	}
	

    /**
     * Recuperation des données concernant l'interlocuteur a parti de l'id de l'entite juridique
     * @param id_EntiteJ
     * @param Val_A_Rechercher
     * @param nbEnreg
     * @return
     */
	 @ApiOperation(value="Récupération des données concernant entite juridique", notes="Service Namek (USW6 et USW5)")
	 @RequestMapping(method = RequestMethod.GET, value = "/recherche/ej/interlocuteur/{id_interlocuteur}")
	 public ResponseEntity<List<WS03Vue>> findAllEJVal(@PathVariable(value="id_interlocuteur") String id_EntiteJ, @RequestParam(required = false)String Val_A_Rechercher,
			@RequestParam(required = false, defaultValue="20") String nbEnreg) {
		 if(Val_A_Rechercher == null || Val_A_Rechercher.equals("")){
			 List<EntiteJuridique> listEntiteJuridique = EntiteJuridiqueUtilitaires.getAllByID(repository.findAll(),id_EntiteJ);
			 return new ResponseEntity<>(MapperObjetVue.traduireToWS0304(EntiteJuridiqueUtilitaires.getFixeSize(listEntiteJuridique,Integer.valueOf(nbEnreg))),HttpStatus.OK);
		 }
		List<EntiteJuridique> listEntiteJuridique = EntiteJuridiqueUtilitaires.getAllByID(repository.findAll(),id_EntiteJ);
		List<EntiteJuridique> result= EntiteJuridiqueUtilitaires.getFixeSize(EntiteJuridiqueUtilitaires.getAllMath(listEntiteJuridique, Val_A_Rechercher),Integer.valueOf(nbEnreg));

		MultiValueMap<String,String> header = new HttpHeaders();
		header.add("nbResult", result.size()+"");
		
		return new ResponseEntity<>(MapperObjetVue.traduireToWS0304(result),header ,HttpStatus.OK);
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
