package model;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private List<Trabajador> trabajadores;
    private List<Facultad> facultades;
    private String nombre;
    private List<String> direcciones;
    private String tipo; // Estatal o privada

    public Universidad(String nombre, List<String> direcciones, String tipo) {
        this.nombre = nombre;
        this.direcciones = direcciones;
        this.tipo = tipo;
        this.trabajadores = new ArrayList<>();
        this.facultades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getDirecciones() {
        return direcciones;
    }

    public String getTipo() {
        return tipo;
    }

    public void addTrabajador(Trabajador trabajador) {
        this.trabajadores.add(trabajador);
    }

    public void addFacultad(Facultad facultad) {
        this.facultades.add(facultad);
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public List<Facultad> getFacultades() {
        return facultades;
    }
}





