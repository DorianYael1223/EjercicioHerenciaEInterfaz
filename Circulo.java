package EjercicioHerenciaEInterfas;

// Circle class that extends FiguraGeometrica (Abstract class for geometric shapes)
class Circulo extends FiguraGeometrica {
    private double radio; // Radius of the circle

    // Constructor for the Circle class
    public Circulo(String nombreFigura, double radio) {
        super(nombreFigura); // Call the constructor of the superclass (FiguraGeometrica)

        // Check if the provided radius is positive; if not, throw an exception
        if (radio <= 0) {
            throw new IllegalArgumentException("The radius must be a positive value.");
        }

        this.radio = radio; // Initialize the radius
    }

    // Calculate and return the area of the circle
    @Override
    public double calcularArea() {
        return Math.PI * (Math.pow(radio, 2));
    }

    // Calculate and return the perimeter (circumference) of the circle
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
