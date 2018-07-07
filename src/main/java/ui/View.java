package ui;

import model.Estudiante;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

import java.awt.*;

@SuppressWarnings("serial")
public class View  extends MainWindow<ViewModel> {
    public View() {
        super(new ViewModel(new Estudiante("vale","caav","12234324","sdfsfds")));
    }

    @Override
    public void createContents(Panel mainPanel) {
        this.setTitle("Notas de un estudiante");
        mainPanel.setLayout(new VerticalLayout());

        new Label(mainPanel).setText("asignaciones");

        new NumericField(mainPanel).bindValueToProperty("legajo");

      /*  new Button(mainPanel)
                .setCaption("Obtener notas")
                .onClick(()-> this.getModelObject());

        new Label(mainPanel) //
                .setBackground(Color.yellow)
                .bindValueToProperty("kilometros");

        */
      new Label(mainPanel).setText(" kilómetros");
    }

    public static void main(String[] args) {
        new View().startApplication();
    }
}
