package model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private Facultad facultad;
    private List<CarreraUniversitaria> carreras;
    private List<Administrativo> administrativos;
    private List<Profesor> profesores;
    private String nombre;

    public Departamento(Facultad facultad, String nombre) {
        this.facultad = facultad;
        this.nombre = nombre;
        this.carreras = new ArrayList<>();
        this.administrativos = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void addCarrera(CarreraUniversitaria carrera) {
        this.carreras.add(carrera);
    }

    public void addAdministrativo(Administrativo administrativo) {
        this.administrativos.add(administrativo);
    }

    public void addProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }
}