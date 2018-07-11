package ui;

import model.Estudiante;
import model.tarea.Asignacion;
import org.uqbar.commons.model.annotations.Observable;

import java.util.List;

@Observable
public class ViewModel {
    private Estudiante estudiante;
    private String nombre;
    private String apellido;
    private int legajo;
    private String usuarioGithub;
    private List<Asignacion> asignaciones;

    public ViewModel(Estudiante unModel) {
        this.estudiante = estudiante;
    }

    // ********************************************************
    // ** Acciones
    // ********************************************************


    // ********************************************************
    // ** Atributos
    // ********************************************************

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
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
