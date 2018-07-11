package model;

import model.tarea.Asignacion;
import org.uqbar.commons.model.annotations.Observable;

import java.util.List;

@Observable
public class Estudiante {
    private String nombre;
    private String apellido;
    private int legajo;
    private String usuarioGithub;
    private List<Asignacion> asignaciones;

    public Estudiante(String nombre, String apellido, int legajo, String usuarioGithub) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.usuarioGithub = usuarioGithub;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getUsuarioGithub() {
        return usuarioGithub;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
}
