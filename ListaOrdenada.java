package ejercicio8_7;

public class ListaOrdenada {
    private Nodo primero;

    public void insertarOrdenado(Producto p) {
        if (listaVacia()) {
            primero = new Nodo(p);

        } else {

            Nodo nodoAux = primero;
            Nodo nodoPrevio = null;

            Nodo nodoAux2 = new Nodo(p);
            boolean bool = false;

            do {
                if (nodoAux.getProducto().getNumProducto() == p.getNumProducto()) {
                    System.out.println("ERROR: EL PRODUCTO YA ESTA EN LA LISTA");
                    return;
                }

                if (nodoAux.getProducto().getNumProducto() > p.getNumProducto()) {
                    nodoAux2.setSig(nodoAux);

                    if (nodoPrevio == null) {
                        primero = nodoAux2;
                    } else {
                        nodoPrevio.setSig(nodoAux2);
                    }

                    bool = true;
                }

                nodoPrevio = nodoAux;
                nodoAux = nodoAux.getSig();

            } while (nodoAux != null && !bool);

            if (!bool) {
                nodoPrevio.setSig(nodoAux2);
            }

        }

    }


    public Producto buscarNodo(int x) {
        if (listaVacia()) {
            return null;
        } else {
            Nodo nodoAux = primero;

            if (nodoAux.getProducto().getNumProducto() == x) {
                return nodoAux.getProducto();
            }

            do {
                if (nodoAux.getSig() != null && nodoAux.getSig().getProducto().getNumProducto() == x) {
                    return nodoAux.getSig().getProducto();
                }

                nodoAux = nodoAux.getSig();
            } while (nodoAux != null);
        }

        return null;
    }


    public boolean borrarNodo(int x) {
        if (listaVacia()) {
            return false;
        } else {
            Nodo nodoAux = primero;

            if (nodoAux.getProducto().getNumProducto() == x) {
                primero = nodoAux.getSig();
                return true;
            }

            do {
                if (nodoAux.getSig() != null && nodoAux.getSig().getProducto().getNumProducto() == x) {
                    nodoAux.setSig(nodoAux.getSig().getSig());
                    return true;
                }

                nodoAux = nodoAux.getSig();
            } while (nodoAux != null);
        }


        return false;
    }

    public boolean listaVacia() {
        return primero == null;
    }

    @Override
    public String toString() {
        if (listaVacia()) {
            return "ERROR: LISTA VACIA";
        }

        String toString = "";

        Nodo nodoAux = primero;

        while (nodoAux != null) {
            if (nodoAux != primero) {
                toString += ", ";
            }

            toString += nodoAux.getProducto().getNumProducto();

            nodoAux = nodoAux.getSig();
        }

        return toString;
    }
}
