package com.helios.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.helios.models.Interlocuteur;

public interface InterlocuteurController {

    @RequestMapping(method = RequestMethod.GET, params = {"id"})
    public ResponseEntity<List<Interlocuteur>> getInterlocuteur(@RequestParam(value="id") String id);
}
