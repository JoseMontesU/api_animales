package com.example.animales.repositoryy;

import com.example.animales.modeler.AnimalModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends CrudRepository<AnimalModel, Integer> {

}
