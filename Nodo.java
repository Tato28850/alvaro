package ejercicio8_7;

public class Nodo {

    private Producto producto;
    private Nodo sig;

    public Nodo(Producto p) {
        this.producto = p;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
