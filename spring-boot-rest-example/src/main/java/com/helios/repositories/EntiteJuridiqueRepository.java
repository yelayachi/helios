package com.helios.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.helios.models.EntiteJuridique;
 
public interface EntiteJuridiqueRepository  extends CrudRepository<EntiteJuridique, String> {
	EntiteJuridique findOne(String id);
    List<EntiteJuridique> findAll();
}
