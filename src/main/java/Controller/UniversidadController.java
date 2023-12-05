package Controller;

import model.*;

import java.util.List;

public class UniversidadController {
    private Universidad universidad;

    public UniversidadController(Universidad universidad) {
        this.universidad = universidad;
    }

    public void addFacultad(String nombre, String ubicacion) {
        Facultad facultad = new Facultad(universidad, nombre, ubicacion);
        universidad.addFacultad(facultad);
    }

    public void addDepartamento(Facultad facultad, String nombre) {
        Departamento departamento = new Departamento(facultad, nombre);
        facultad.addDepartamento(departamento);
    }

    public void addCarrera(Departamento departamento, String nombre) {
        CarreraUniversitaria carrera = new CarreraUniversitaria(departamento, nombre);
        departamento.addCarrera(carrera);
    }

    public void addAdministrativo(Departamento departamento, String nombre, String direccion, String estadoCivil, String rut, String horario, String horarioAtencion) {
        Administrativo administrativo = new Administrativo(universidad, nombre, direccion, estadoCivil, rut, horario, departamento, horarioAtencion);
        departamento.addAdministrativo(administrativo);
        universidad.addTrabajador(administrativo);
    }

    public void addProfesor(Departamento departamento, String nombre, String direccion, String estadoCivil, String rut, String horario, String tipoContrato) {
        Profesor profesor = new Profesor(universidad, nombre, direccion, estadoCivil, rut, horario, departamento, tipoContrato);
        departamento.addProfesor(profesor);
        universidad.addTrabajador(profesor);
    }

    public List<Trabajador> getTrabajadores() {
        return universidad.getTrabajadores();
    }

    public List<Facultad> getFacultades() {
        return universidad.getFacultades();
    }
}

