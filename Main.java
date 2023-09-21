package EjercicioHerenciaEInterfas;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat format1 = new DecimalFormat("#.00");

        FiguraGeometrica figura1 = null;
        FiguraGeometrica figura2 = null;
        FiguraGeometrica figura3 = null;

        try {
            figura1 = new Circulo("Circulo", -1);
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
            System.out.println("Area = " + format1.format(figura1.CalcularArea()));
            System.out.println("Perimetro = " + format1.format(figura1.CalcularPerimetro()));
            System.out.println();
        }

        if (figura2 != null) {
            System.out.println("Figura Rectangulo");
            System.out.println("Area = " + format1.format(figura2.CalcularArea()));
            System.out.println("Perimetro = " + format1.format(figura2.CalcularPerimetro()));
            System.out.println();
        }

        if (figura3 != null) {
            System.out.println("Figura Triangulo");
            System.out.println("Area = " + format1.format(figura3.CalcularArea()));
            System.out.println("Perimetro = " + format1.format(figura3.CalcularPerimetro()));
            System.out.println();
        }
    }
}
