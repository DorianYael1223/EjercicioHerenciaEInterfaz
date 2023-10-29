package EjercicioHerenciaEInterfas;

interface Calcula {
    double calcularArea();

    double calcularPerimetro();
}

class FiguraGenerica<T extends Calcula> {
    private T figura;

    public FiguraGenerica(T figura) {
        this.figura = figura;
    }

    public String obtenerTipoFigura() {
        if (figura instanceof FiguraGeometrica) {
            return ((FiguraGeometrica) figura).getNombre();
        } else {
            return "Tipo de figura desconocido";
        }
    }

    public void mostrarCaracteristicas() {
        System.out.println("Tipo de figura: " + obtenerTipoFigura());
        System.out.println("Área: " + figura.calcularArea());
        System.out.println("Perímetro: " + figura.calcularPerimetro());
    }
}

abstract class FiguraGeometrica implements Calcula {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}