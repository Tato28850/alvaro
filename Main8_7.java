package ejercicio8_7;

import java.util.Scanner;

public class Main8_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaOrdenada lista = new ListaOrdenada();
        int input;

        do {
            System.out.println("1. INSERTAR PRODUCTO ORDENADAMENTE");
            System.out.println("2. BORRAR PRODUCTO");
            System.out.println("3. BUSCAR PRODUCTO");
            System.out.println("4. MOSTRAR LA LISTA");
            System.out.println("5. SALIR");

            input = sc.nextInt();

            if (input == 5) {
                break;
            }

            switch (input) {
                case 1:
                    int numProducto;
                    String descripcion;
                    float precio;

                    System.out.println();
                    System.out.println("Introduce un numero de producto: ");
                    numProducto = sc.nextInt();
                    System.out.println("Introduce una descripcion: ");
                    sc.nextLine();
                    descripcion = sc.nextLine();
                    System.out.println("Introduce un precio: ");
                    precio = sc.nextFloat();

                    lista.insertarOrdenado(new Producto(numProducto, descripcion, precio));

                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Introduce un numero de producto para borrarlo: ");
                    input = sc.nextInt();

                    if (lista.borrarNodo(input)) {
                        System.out.println("PRODUCTO BORRADO");
                    } else {
                        System.out.println("ERROR: PRODUCTO NO BORRADO");
                    }

                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Introduce un valor para buscarlo: ");
                    input = sc.nextInt();

                    if (lista.buscarNodo(input) != null) {
                        System.out.println("EL PRODUCTO ES: " + lista.buscarNodo(input));
                    } else {
                        System.out.println("ERROR: EL PRODUCTO NO EXISTE");
                    }

                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("ListaOrdenada: {NumProducto: " + lista + "}");
                    System.out.println();
                    break;
                default:
                    break;
            }

        } while (true);

    }
}
