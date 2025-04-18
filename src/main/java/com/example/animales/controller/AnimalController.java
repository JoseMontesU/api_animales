package com.example.animales.controller;


import com.example.animales.modeler.AnimalModel;
import com.example.animales.servicee.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/animal")

public class AnimalController {
    @Autowired
    AnimalService as;

    @GetMapping(path = "todos")
    public ArrayList<AnimalModel> leerAnimales() {
    return as.getAnimales();
    }

    @GetMapping(path = "/{id}")

    public Optional<AnimalModel> leerAnimal(@PathVariable("id") int id) {
        return as.getAnimal(id);

    }

    @PostMapping(path = "/save")
    public AnimalModel guardarAnimales(@RequestBody AnimalModel animal) {
        return as.guardarAnimales(animal);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminar(@PathVariable("id") int id) {
    return as.eliminarPorID(id);
    }


}
