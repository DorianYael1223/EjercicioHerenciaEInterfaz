package EjercicioHerenciaEInterfas;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat format1 = new DecimalFormat("#.00"); // Create a DecimalFormat object for formatting output

        // Create instances of geometric figures
        FiguraGeometrica figura1;
        FiguraGeometrica figura2;
        FiguraGeometrica figura3;

        try {

            figura1 = new Circulo("Circulo", 5);
            System.out.println(figura1.nombre + " Figure");
            System.out.println("Area = " + format1.format(figura1.calcularArea()));
            System.out.println("Perimeter = " + format1.format(figura1.calcularPerimetro()));
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred while creating the Circle figure: " + e.getMessage());
        }

        try {

            figura2 = new Rectangulo("Rectangulo", 2, 4);
            System.out.println(figura2.nombre + " Figure");
            System.out.println("Area = " + format1.format(figura2.calcularArea()));
            System.out.println("Perimeter = " + format1.format(figura2.calcularPerimetro()));
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred while creating the Rectangle figure: " + e.getMessage());
        }

        try {

            figura3 = new Triangulo("Triangulo", 7, 8);
            System.out.println(figura3.nombre + " Figure");
            System.out.println("Area = " + format1.format(figura3.calcularArea()));
            System.out.println("Perimeter = " + format1.format(figura3.calcularPerimetro()));
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred while creating the Triangle figure: " + e.getMessage());
        }
    }
}
