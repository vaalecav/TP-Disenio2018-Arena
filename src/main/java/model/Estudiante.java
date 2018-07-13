package model;

import model.tarea.Asignacion;
import org.uqbar.commons.model.annotations.Observable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Estudiante {
    private String nombre;
    private String apellido;


    private int legajo;
    private String usuarioGithub;
    private ArrayList<Asignacion> asignaciones;

    public Estudiante(String nombre, String apellido, int legajo, String usuarioGithub) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.usuarioGithub = usuarioGithub;
        this.asignaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) { this.legajo = legajo; }

    public String getUsuarioGithub() {
        return usuarioGithub;
    }

    public void setUsuarioGithub(String usuarioGithub) { this.usuarioGithub = usuarioGithub; }

    public List<Asignacion> getAsignaciones() { return asignaciones; }

    public void setAsignaciones(ArrayList<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public void agregarAsignacion(Asignacion asignacion) { this.asignaciones.add(asignacion); }

    public String getMostrarNotas() {
        return (!this.asignaciones.isEmpty() ?
                this.asignaciones.stream().map(asignacion -> asignacion.getMostrarNota()).collect(Collectors.joining("\n"))
                : "El alumno no posee notas ingresadas");
    }

}
