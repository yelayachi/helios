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

import com.helios.models.Interlocuteur;
import com.helios.models.InterlocuteurUtilitaires;
import com.helios.repositories.InterlocuteurRepository;

import io.swagger.annotations.ApiOperation;

@RequestMapping("/v0")
@RestController
public class InterlocuteurControllerImpl{

	
  @Autowired
  private InterlocuteurRepository repository;


  
  @ApiOperation(value="Récupération des données concernant la vue 360° interlocuteur", notes="Service NAMEK")
  @RequestMapping(method = RequestMethod.GET, value = "/vue360/interlocuteur/{id}")
	public ResponseEntity<Interlocuteur> getInterlocuteur(@PathVariable(value="id") String id) {
  	return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
  }

 //Ajout des fonctionalités entité juridiques

  @ApiOperation(value="Récupération des données concernant l'interlocuteur (client)", notes="Service Namek (USW6 et USW5)")
  @RequestMapping(method = RequestMethod.GET, value = "/recherche/interlocuteur/ej/{id}")
  public ResponseEntity<List<Interlocuteur>> findAllInterlocuteur(@PathVariable(value="id") String id,
  																		@RequestParam(required = false) String Val_A_Rechercher,
  																		@RequestParam(required= false, defaultValue="20") String nbEnreg) {
  	
  	//On faire un requete pour recuperer tous les interlocuteurs associes a une entite juridique "id_EntiteJ"
  	ResponseEntity<List<Interlocuteur>> listInterlocuteur = new ResponseEntity<>(InterlocuteurUtilitaires.getAllByID(repository.findAll(),id), HttpStatus.OK);
  	
  	if (Val_A_Rechercher == null || Val_A_Rechercher.equals("")){
  		System.out.println(nbEnreg);
  		//cas USW6
  		return InterlocuteurUtilitaires.getFixeSize(listInterlocuteur,Integer.valueOf(nbEnreg));
  	}
  	//cas USW5
  	
  	ResponseEntity<List<Interlocuteur>> result= InterlocuteurUtilitaires.getFixeSize(InterlocuteurUtilitaires.getAllMath(listInterlocuteur, Val_A_Rechercher),Integer.parseInt(nbEnreg));
  	
  	MultiValueMap<String,String> header = new HttpHeaders();
  	header.add("nbResult", result.getBody().size()+"");
  	
  	return new ResponseEntity<>(result.getBody(),header ,HttpStatus.OK);
  	
  }
  
}
