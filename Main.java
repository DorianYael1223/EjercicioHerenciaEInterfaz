package EjercicioHerenciaEInterfas;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat format1 = new DecimalFormat("#.00"); // Create a DecimalFormat object for formatting output

        // Create instances of geometric shapes with specific dimensions
        FiguraGeometrica figura1 = new Rectangulo("Rectangulo", 8, 9);
        FiguraGeometrica figura2 = new Circulo("Circulo", 8);
        FiguraGeometrica figura3 = new Triangulo("Triangulo", 10, 7);

        try {
            figura1 = new Circulo("Circulo", 5);
        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred while creating the Circle figure: " + e.getMessage());
        }

        try {
            figura2 = new Rectangulo("Rectangulo", 2, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred while creating the Rectangle figure: " + e.getMessage());
        }

        try {
            figura3 = new Triangulo("Triangulo", 2, 3);
        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred while creating the Triangle figure: " + e.getMessage());
        }

        // Display information about each geometric figure if it was successfully
        // created
        if (figura1 != null) {
            System.out.println("Circle Figure");
            System.out.println("Area = " + format1.format(figura1.calcularArea()));
            System.out.println("Perimeter = " + format1.format(figura1.calcularPerimetro()));
            System.out.println();
        }

        if (figura2 != null) {
            System.out.println("Rectangle Figure");
            System.out.println("Area = " + format1.format(figura2.calcularArea()));
            System.out.println("Perimeter = " + format1.format(figura2.calcularPerimetro()));
            System.out.println();
        }

        if (figura3 != null) {
            System.out.println("Triangle Figure");
            System.out.println("Area = " + format1.format(figura3.calcularArea()));
            System.out.println("Perimeter = " + format1.format(figura3.calcularPerimetro()));
            System.out.println();
        }
    }
}
