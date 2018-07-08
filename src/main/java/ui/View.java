package ui;

import model.Estudiante;

import model.tarea.Asignacion;
import model.tarea.AsignacionNumerica;
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
    private List<Asignacion> asignacionesVale = new ArrayList<>();
    private List<String> notasMate = new ArrayList<>();
    notasMate.add("2");
    notasMate.add("6");
    asignacionesVale.add(new AsignacionNumerica("matematica", notasMate));

    public View() {
        super(new ViewModel(new Estudiante("vale","cav",123,"valecav", asignacionesVale));
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
