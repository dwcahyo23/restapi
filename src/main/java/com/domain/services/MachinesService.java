package com.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.models.entities.Machines;
import com.domain.models.repos.MachinesRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MachinesService {

    @Autowired
    private MachinesRepo machinesRepo;

    public Machines save(Machines machines) {
        return machinesRepo.save(machines);
    }

    public Machines findOne(String id) {
        return machinesRepo.findById(id).get();
    }

    public Iterable<Machines> findAll() {
        return machinesRepo.findAll();
    }

    public void removeOne(String id) {
        machinesRepo.deleteById(id);
    }

    public List<Machines> findByName(String name) {
        return machinesRepo.findByNameContains(name);
    }
}
