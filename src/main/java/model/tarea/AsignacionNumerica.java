package model.tarea;

import java.util.LinkedList;
import java.util.List;

public class AsignacionNumerica<T> extends Asignacion {

    public AsignacionNumerica(String tarea, List<T> notas) {
        this.tarea = tarea;
        this.notas = notas;
    }

    public void setNotas() {
        this.notas = new LinkedList<Integer>();
    }

    public boolean aprobo() {
        return !notas.isEmpty() && Integer.getInteger(notas.get(notas.size()-1).toString())>5;
    }
}
