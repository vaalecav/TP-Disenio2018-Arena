package ui;

import model.Estudiante;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.PanelBuilder;

import java.awt.*;

public class ViewNotas extends SimpleWindow<ViewModelNotas> {

    public ViewNotas(WindowOwner parent) {
        super(parent, new ViewModelNotas());
    }

    @Override
    protected void createMainTemplate(Panel mainPanel) {
        this.setTitle("Estudiante: notas");

        mainPanel.setLayout(new VerticalLayout());
        mainPanel.setWidth(1000);
        super.createMainTemplate(mainPanel);
    }

    // *************************************************************************
    // * BUSQUEDA
    // *************************************************************************

    /**
     * Panel principal de búsuqeda para filtrar por legajo
     */

    @Override
    protected void createFormPanel(Panel mainPanel) {
        new Label(mainPanel).setText("Ingrese el legajo del estudiante");
        new NumericField(mainPanel).bindValueToProperty("legajo");

        new Button(mainPanel)
                .setCaption("Obtener notas")
                .onClick(() -> this.getModelObject().obtenerNotas());

        new Label(mainPanel) //
                .setBackground(Color.BLUE)
                .setForeground(Color.WHITE)
                .bindValueToProperty("notas");
    }


    // *************************************************************************
    // * ACCIONES
    // *************************************************************************

    @Override
    protected void addActions(Panel actionsPanel) {
        actionsPanel.setLayout(PanelBuilder::setVerticalLayout);

        new Button(actionsPanel)
                .setCaption("Modificar datos")
                .onClick(this::modificarDatos);

        new Label(actionsPanel)
                .bindValueToProperty("errores");
    }

    public void modificarDatos() {
        if (getModelObject().getEstudiante().isPresent()) {
            Dialog<?> dialog = new ViewEstudiante(this, getModelObject().getEstudiante().get());
            dialog.open();
            dialog.onAccept(() -> {});
        } else {
            getModelObject().setErrores("No hay estudiantes con el legajo ingresado");
        }
    }
}


