package com.example.animales.servicee;

import com.example.animales.modeler.AnimalModel;
import com.example.animales.repositoryy.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository ar;

    public Optional<AnimalModel> getAnimal(int id) {
Optional<AnimalModel> a1 = ar.findById(id);
    return a1;

    }
    public AnimalModel guardarAnimales(AnimalModel animal) {
    return ar.save(animal);

    }
    public ArrayList<AnimalModel> getAnimales() {
            ArrayList<AnimalModel> listaAnimal = (ArrayList<AnimalModel>) ar.findAll();
            return listaAnimal;

    }
    public String eliminarPorID(int id) {
        ar.deleteById(id);

        return "Se elminino correctamente la cochinada";
    }


}
