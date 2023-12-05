package model;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private Universidad universidad;
    private List<Departamento> departamentos;
    private String nombre;
    private String ubicacion; // latitud / longitud

    public Facultad(Universidad universidad, String nombre, String ubicacion) {
        this.universidad = universidad;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.departamentos = new ArrayList<>();
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void addDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }
}
