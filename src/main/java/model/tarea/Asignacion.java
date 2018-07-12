package model.tarea;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Asignacion<T>{
    public String tarea;
    protected List<T> notas;

    public abstract void setNotas();

    public abstract boolean aprobo();

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String obtenerUltimaNota() { return this.notas.get(notas.size()-1).toString(); }

    public String getMostrarNota() {
        return this.getTarea() + ": \n- " + this.obtenerUltimaNota();
    }

}
