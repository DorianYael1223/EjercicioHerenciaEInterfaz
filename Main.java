package EjercicioHerenciaEInterfas;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat format1 = new DecimalFormat("#.00");

        FiguraGeometrica figura1 = new Rectangulo("Rectangulo", 8, 9);
        FiguraGeometrica figura2 = new Circulo("Circulo", 8);
        FiguraGeometrica figura3 = new Triangulo("Triangulo", 10, 7);

        try {
            figura1 = new Circulo("Circulo", 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Se ha producido un error al crear la figura Circulo: " + e.getMessage());
        }

        try {
            figura2 = new Rectangulo("Rectangulo", 2, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("Se ha producido un error al crear la figura Rectangulo: " + e.getMessage());
        }

        try {
            figura3 = new Triangulo("Triangulo", 2, 3);
        } catch (IllegalArgumentException e) {
            System.out.println("Se ha producido un error al crear la figura Triangulo: " + e.getMessage());
        }

        if (figura1 != null) {
            System.out.println("Figura Circulo");
            System.out.println("Area = " + format1.format(figura1.calcularArea()));
            System.out.println("Perimetro = " + format1.format(figura1.calcularPerimetro()));
            System.out.println();
        }

        if (figura2 != null) {
            System.out.println("Figura Rectangulo");
            System.out.println("Area = " + format1.format(figura2.calcularArea()));
            System.out.println("Perimetro = " + format1.format(figura2.calcularPerimetro()));
            System.out.println();
        }

        if (figura3 != null) {
            System.out.println("Figura Triangulo");
            System.out.println("Area = " + format1.format(figura3.calcularArea()));
            System.out.println("Perimetro = " + format1.format(figura3.calcularPerimetro()));
            System.out.println();
        }
    }
}
