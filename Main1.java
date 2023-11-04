package EjercicioHerenciaEInterfas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        // Create a list of FiguraGenerica<FiguraGeometrica> to store geometric figures.
        List<FiguraGenerica<FiguraGeometrica>> figuras = new ArrayList<>();

        try {
            // Add instances of geometric figures to the list.
            figuras.add(new FiguraGenerica<>(new Circulo("Circle", 5.0)));
            figuras.add(new FiguraGenerica<>(new Rectangulo("Rectangle", 4.0, 6.0)));
            figuras.add(new FiguraGenerica<>(new Triangulo("Triangulo", 5, 10)));
            // Sort the list of figures by figure type using Collections.sort
            // and a comparator based on obtenerTipoFigura() of FiguraGenerica.
            Collections.sort(figuras, (figura1, figura2) -> figura1.obtenerTipoFigura().compareTo(figura2.obtenerTipoFigura()));

            // Iterate through the list of figures and display their characteristics.
            for (FiguraGenerica<FiguraGeometrica> figura : figuras) {
                figura.mostrarCaracteristicas();
                System.out.println();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error creating figures: " + e.getMessage());
        }

        // Create an iterator for the list of figures and display their characteristics again.
        Iterator<FiguraGenerica<FiguraGeometrica>> iterator = figuras.iterator();
        System.out.println("Characteristics of the figures:");
        while (iterator.hasNext()) {
            FiguraGenerica<FiguraGeometrica> figura = iterator.next();
            figura.mostrarCaracteristicas();
            System.out.println();
        }
    }
}
