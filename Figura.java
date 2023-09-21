package EjercicioHerenciaEInterfas;

interface Calcula{
    double CalcularArea();
    double CalcularPerimetro();
}
abstract class FiguraGeometrica implements Calcula{
    protected String nombre;
    public Object nombreFigura;

    public FiguraGeometrica (String nombre){
        this.nombre=nombre;
    }
}
