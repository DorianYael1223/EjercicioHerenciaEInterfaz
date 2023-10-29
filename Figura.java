package EjercicioHerenciaEInterfas;
// Interface for calculating area and perimeter of a shape
interface Calcula {
    double calcularArea(); // Method for calculating the area of a shape

    double calcularPerimetro(); // Method for calculating the perimeter of a shape
}

// Generic class for handling various geometric shapes
class FiguraGenerica<T extends Calcula> {
    private T figura; // The generic shape stored as T

    public FiguraGenerica(T figura) {
        this.figura = figura;
    }

    // Get the type of the geometric shape
    public String obtenerTipoFigura() {
        if (figura instanceof FiguraGeometrica) {
            return ((FiguraGeometrica) figura).getNombre();
        } else {
            return "Unknown shape type";
        }
    }

    // Display the characteristics of the shape
    public void mostrarCaracteristicas() {
        System.out.println("Shape Type: " + obtenerTipoFigura());
        System.out.println("Area: " + figura.calcularArea());
        System.out.println("Perimeter: " + figura.calcularPerimetro());
    }
}

// Abstract class for geometric shapes implementing the Calcula interface
abstract class FiguraGeometrica implements Calcula {
    protected String nombre; // Name or type of the geometric shape

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    // Get the name of the geometric shape
    public String getNombre() {
        return nombre;
    }
}
