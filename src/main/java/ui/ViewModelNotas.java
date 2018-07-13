package ui;

import model.Estudiante;
import model.RepositorioEstudiantes;
import org.uqbar.commons.model.annotations.Observable;

import java.util.Optional;


@Observable
public class ViewModelNotas {
    private int legajo;
    private String notas;
    private String errores;

    // ********************************************************
    // ** Acciones
    // ********************************************************

    public void obtenerNotas() {
        this.notas = RepositorioEstudiantes
                .getEstudiantes()
                .stream()
                .filter(alumno -> alumno.getLegajo() == this.getLegajo())
                .findFirst()
                .map(Estudiante::getMostrarNotas)
                .orElse("Legajo incorrecto");
    }

    // ********************************************************
    // ** Atributos
    // ********************************************************

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNotas() {
        return notas;
    }

    public String getErrores() {
        return errores;
    }

    public void setErrores(String errores) {
        this.errores = errores;
    }

    public Optional<Estudiante> getEstudiante() {
        return RepositorioEstudiantes.getEstudiantes().stream()
                .filter(estudiante -> estudiante.getLegajo() == this.getLegajo())
                .findFirst();
    }
}
