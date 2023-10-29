package EjercicioHerenciaEInterfas;

// Triangle class that extends FiguraGeometrica (Abstract class for geometric shapes)
class Triangulo extends FiguraGeometrica {
    private double base; // Base length of the triangle
    private double altura; // Height of the triangle

    // Constructor for the Triangle class
    public Triangulo(String nombreFigura, double base, double altura) {
        super(nombreFigura); // Call the constructor of the superclass (FiguraGeometrica)

        // Check if the provided base and height are positive and non-zero; if not, throw an exception
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("The base and height must be positive and non-zero values.");
        }

        this.base = base; // Initialize the base length
        this.altura = altura; // Initialize the height
    }

    // Calculate and return the area of the triangle
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Calculate and return the perimeter of the triangle
    @Override
    public double calcularPerimetro() {
       return base + (2 * altura);
    }
}

