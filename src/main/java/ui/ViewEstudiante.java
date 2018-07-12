package ui;

import model.Estudiante;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;


@SuppressWarnings("serial")
public class ViewEstudiante extends Dialog<ViewModelEstudiante> {
    public ViewEstudiante(WindowOwner owner, Estudiante model) {
        super(owner, new ViewModelEstudiante(model));
    }

    @Override
    protected void createFormPanel(Panel mainPanel) {
        Panel form = new Panel(mainPanel);
        form.setLayout(new ColumnLayout(2));

        this.setTitle("Estudiante: Modificar datos");

        new Label(mainPanel).setText("Legajo");
        new NumericField(mainPanel).bindValueToProperty("legajo");

        new Label(mainPanel).setText("Nombre");
        new TextBox(mainPanel).bindValueToProperty("nombre");

        new Label(mainPanel).setText("Apellido");
        new TextBox(mainPanel).bindValueToProperty("apellido");

        new Label(mainPanel).setText("Usuario de GitHub");
        new TextBox(mainPanel).bindValueToProperty("usuarioGithub");
    }

    @Override
    protected void addActions(Panel actions) {
        new Button(actions).setCaption("Aceptar").onClick(this::accept).setAsDefault();
        new Button(actions).setCaption("Cancelar").onClick(this::cancel);
    }

    @Override
    protected void executeTask() {
        this.getModelObject().guardar();
        super.executeTask();
    }
}
