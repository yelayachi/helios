package com.helios.repositories;

import org.springframework.data.repository.CrudRepository;

import com.helios.models.Pie;

import java.util.List;

/**
 * Created by kaspernissen on 12/02/2016.
 */
public interface PieRepository extends CrudRepository<Pie, Long> {
    List<Pie> findByName(String name);
}
