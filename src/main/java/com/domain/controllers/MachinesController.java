package com.domain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.models.entities.Machines;
import com.domain.services.MachinesService;

@RestController
@RequestMapping("api/machines")
public class MachinesController {

    @Autowired
    private MachinesService machinesService;

    @PostMapping
    public Machines create(@RequestBody Machines machines) {
        return machinesService.save(machines);
    }

    @GetMapping
    public Iterable<Machines> findAll() {
        return machinesService.findAll();
    }
}
