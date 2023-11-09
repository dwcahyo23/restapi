package com.domain.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.domain.models.entities.Machines;

public interface MachinesRepo extends CrudRepository<Machines, String> {

    List<Machines> findByNameContains(String name);

}
