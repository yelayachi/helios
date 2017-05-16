package com.helios.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.helios.models.Interlocuteur;

@RestController
@RequestMapping("/interlocuteurs")
public interface InterlocuteurController {

    @RequestMapping(method = RequestMethod.GET, params = {"id"}, value = "/{id}")
    public ResponseEntity<Interlocuteur> getInterlocuteur(@RequestParam(value="id") String id);
}
