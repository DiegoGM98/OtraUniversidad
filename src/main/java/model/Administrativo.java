package model;

public class Administrativo extends Trabajador {
    private Departamento departamento;
    private String horarioAtencion;

    public Administrativo(Universidad universidad, String nombre, String direccion, String estadoCivil, String rut, String horario, Departamento departamento, String horarioAtencion) {
        super(universidad, nombre, direccion, estadoCivil, rut, horario);
        this.departamento = departamento;
        this.horarioAtencion = horarioAtencion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    @Override
    public String getTipo() {
        return "Administrativo";
    }
}

