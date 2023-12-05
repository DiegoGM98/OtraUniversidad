package model;

public class Profesor extends Trabajador {
    private Departamento departamento;
    private String tipoContrato; // parcial, media jornada, jornada completa

    public Profesor(Universidad universidad, String nombre, String direccion, String estadoCivil, String rut, String horario, Departamento departamento, String tipoContrato) {
        super(universidad, nombre, direccion, estadoCivil, rut, horario);
        this.departamento = departamento;
        this.tipoContrato = tipoContrato;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    @Override
    public String getTipo() {
        return "Profesor";
    }
}
