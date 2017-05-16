package com.helios.repositories;

import org.springframework.data.repository.CrudRepository;

import com.helios.models.Interlocuteur;
 
/**
 * Created by kaspernissen on 12/02/2016.
 */
public interface InterlocuteurRepository extends CrudRepository<Interlocuteur, String> {
    Interlocuteur findOne(String id);
}
