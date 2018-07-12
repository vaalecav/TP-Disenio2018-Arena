package model;

import model.tarea.AsignacionNumerica;

import java.util.ArrayList;
import java.util.List;

public class RepositorioEstudiantes {
    private static ArrayList<Estudiante> estudiantes;

    public static ArrayList<Estudiante> getEstudiantes() {
        if (estudiantes == null) {
            List<Integer> notasNumericasBrenda = new ArrayList<>();
            notasNumericasBrenda.add(2);
            notasNumericasBrenda.add(6);
            notasNumericasBrenda.add(9);

            List<String> notasConceptualesBrenda = new ArrayList<>();
            notasConceptualesBrenda.add("R");
            notasConceptualesBrenda.add("MB");

            Estudiante brenda = new Estudiante("Brenda", "Boryszanski", 1595581, "brandonborys");
            brenda.agregarAsignacion(new AsignacionNumerica("Parcial diseño", notasNumericasBrenda));
            brenda.agregarAsignacion(new AsignacionNumerica("Trabajo Practico Economía", notasConceptualesBrenda));

            estudiantes = new ArrayList<Estudiante>() {{
                add(brenda);
                add(new Estudiante("Santiago", "Anaya", 1595582, "elñoco"));
                add(new Estudiante("Valeria", "Cavallaro", 1595583, "valerio"));
            }};
        }

        return estudiantes;
    }
}
