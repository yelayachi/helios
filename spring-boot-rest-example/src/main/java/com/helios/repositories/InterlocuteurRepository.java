package com.helios.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.helios.models.Interlocuteur;

/**
 * Created by kaspernissen on 12/02/2016.
 */
public interface InterlocuteurRepository extends CrudRepository<Interlocuteur, Long> {
    List<Interlocuteur> findOne(String name);
}
