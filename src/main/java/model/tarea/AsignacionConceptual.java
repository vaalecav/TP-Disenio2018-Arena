package model.tarea;

import java.util.LinkedList;
import java.util.List;

public class AsignacionConceptual<T> extends Asignacion {

    public AsignacionConceptual (String tarea, List<T> notas) {
        this.tarea = tarea;
        this.notas = notas;
    }

    private List<String>desaprobados;
    private static final String MAL= "M";
    private static final String REGULAR= "R";
    public AsignacionConceptual(){
        desaprobados = new LinkedList();
        desaprobados.add(MAL);
        desaprobados.add(REGULAR);
    }
    public void setNotas() {
        this.notas = new LinkedList<String>();
    }

    public boolean aprobo() {
        if(notas.isEmpty())return false;
        String ultimaNota = this.notas.get(notas.size()-1).toString();
        return !desaprobados.stream().anyMatch(n->n.equals(ultimaNota));
    }
}
