package ejercicio8_7;

public class Producto {

    private int numProducto;
    private String descripcion;
    private float precio;

    public Producto(int numProducto, String descripcion, float precio) {
        this.numProducto = numProducto;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getNumProducto() {
        return numProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "numProducto=" + numProducto +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
