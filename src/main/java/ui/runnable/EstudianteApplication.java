package ui.runnable;

import model.Estudiante;
import model.RepositorioEstudiantes;
import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;
import org.uqbar.commons.applicationContext.ApplicationContext;
import ui.ViewNotas;

public class EstudianteApplication extends Application {

    public static void main(String[] args) {
        new EstudianteApplication().start();
    }

    @Override
    protected Window<?> createMainWindow() {
        ApplicationContext.getInstance().configureSingleton(Estudiante.class, new RepositorioEstudiantes());
        return new ViewNotas(this);
    }
}
