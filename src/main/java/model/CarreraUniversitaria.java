package model;

public class CarreraUniversitaria {
    private Departamento departamento;
    private String nombre;

    public CarreraUniversitaria(Departamento departamento, String nombre) {
        this.departamento = departamento;
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public String getNombre() {
        return nombre;
    }
}

