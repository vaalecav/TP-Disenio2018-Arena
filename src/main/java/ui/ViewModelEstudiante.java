package ui;

import model.Estudiante;
import model.tarea.Asignacion;
import org.uqbar.commons.model.annotations.Observable;

import java.util.List;

@Observable
public class ViewModelEstudiante {
    private Estudiante estudiante;
    private String nombre;
    private String apellido;
    private int legajo;
    private String usuarioGithub;

    public ViewModelEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.nombre = estudiante.getNombre();
        this.apellido = estudiante.getApellido();
        this.legajo = estudiante.getLegajo();
        this.usuarioGithub = estudiante.getUsuarioGithub();
    }

    // ********************************************************
    // ** Acciones
    // ********************************************************

    public void guardar() {
        this.estudiante.setLegajo(this.legajo);
        this.estudiante.setNombre(this.nombre);
        this.estudiante.setApellido(this.apellido);
        this.estudiante.setUsuarioGithub(this.usuarioGithub);
    }

    // ********************************************************
    // ** Atributos
    // ********************************************************

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

}
