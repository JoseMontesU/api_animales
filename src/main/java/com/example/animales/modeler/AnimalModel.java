package com.example.animales.modeler;

import jakarta.persistence.*;

@Entity
@Table(name="animales")

public class AnimalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String tipo;
    private String sexo;
    private int edad;

    public AnimalModel(int id, String nombre, String tipo, String sexo, int edad) {
        this.id= id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.sexo = sexo;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AnimalModel() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
