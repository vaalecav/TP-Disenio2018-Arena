package model.tarea;

import java.util.List;

public abstract class Tarea<T>{
    public abstract void setNotas();

    protected List<T>notas;
    public abstract boolean aprobo();
}
