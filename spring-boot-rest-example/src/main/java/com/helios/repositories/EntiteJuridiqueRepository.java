package com.helios.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.helios.models.EntiteJuridique;
 
public interface EntiteJuridiqueRepository  extends CrudRepository<EntiteJuridique, String> {
	EntiteJuridique findOne(String id);
    List<EntiteJuridique> findAll();
    @Query("select b from EntiteJuridique b where b.siren = ?1")
    List<EntiteJuridique> findAllBySiret(String siret);
}
