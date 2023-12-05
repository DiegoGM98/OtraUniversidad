package model;

public abstract class Trabajador {
    private Universidad universidad;
    private String nombre;
    private String direccion;
    private String estadoCivil;
    private String rut;
    private String horario;

    public Trabajador(Universidad universidad, String nombre, String direccion, String estadoCivil, String rut, String horario) {
        this.universidad = universidad;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.rut = rut;
        this.horario = horario;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getRut() {
        return rut;
    }

    public String getHorario() {
        return horario;
    }

    public abstract String getTipo();
}

