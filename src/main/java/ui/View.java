package ui;

import model.Estudiante;

import model.tarea.Asignacion;
import model.tarea.AsignacionNumerica;
import net.sf.oval.internal.util.LinkedSet;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")
public class View  extends MainWindow<ViewModel> {
    public View() {
        super(new ViewModel(new Estudiante("vale","cav",123,"valecav")));
        this.setUp();
    }

    private void setUp() {
        List asignacionesVale=new ArrayList<>();
        List<Integer>notas1=new ArrayList<>();
        notas1.add(1);
        notas1.add(5);
        notas1.add(10);
        AsignacionNumerica asignacion1=new AsignacionNumerica("parcial dds",notas1);
        List<Integer>notas2=new ArrayList<>();
        notas2.add(3);
        notas2.add(5);
        notas2.add(8);
        AsignacionNumerica asignacion2=new AsignacionNumerica("parcial algoritmos",notas2);
        asignacionesVale.add(asignacion1);
        asignacionesVale.add(asignacion2);
        this.getModel().getSource().setAsignaciones(asignacionesVale);
    }

    @Override
    public void createContents(Panel mainPanel) {
        this.setTitle("Notas de un estudiante");
        mainPanel.setLayout(new VerticalLayout());

        new Label(mainPanel).setText("Asignaciones");

        new NumericField(mainPanel).bindValueToProperty("legajo");

        new Button(mainPanel)
                .setCaption("Obtener notas")
                .onClick(()-> this.getModelObject().getLegajo());

        new Label(mainPanel)
                .setBackground(Color.YELLOW)
                .bindValueToProperty("legajo");

      new Label(mainPanel).setText("NOTAS");
    }

    public static void main(String[] args) {
        new View().startApplication();
    }
}
