package model.tarea;

import java.util.LinkedList;
import java.util.List;

public class TareaConceptual extends Tarea {
    private List<String>desaprobados;
    private static final String MAL= "M";
    private static final String REGULAR= "R";
    public TareaConceptual(){
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
