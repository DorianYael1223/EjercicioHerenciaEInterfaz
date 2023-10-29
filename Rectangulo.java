package EjercicioHerenciaEInterfas;
// Rectangle class that extends FiguraGeometrica (Abstract class for geometric shapes)
class Rectangulo extends FiguraGeometrica {
    private double base; // Width of the rectangle
    private double altura; // Height of the rectangle

    // Constructor for the Rectangle class
    public Rectangulo(String nombreFigura, double base, double altura) {
        super(nombreFigura); // Call the constructor of the superclass (FiguraGeometrica)

        this.base = base; // Initialize the width
        this.altura = altura; // Initialize the height
    }

    // Calculate and return the area of the rectangle
    @Override
    public double calcularArea() {
        return altura * base;
    }

    // Calculate and return the perimeter of the rectangle
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
