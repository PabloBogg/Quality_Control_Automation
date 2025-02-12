package actividad2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Libreria libreria = new Libreria();

        int opcion;
        do {
            System.out.println("MENU:");
            System.out.println("1- Agregar Libro");
            System.out.println("2- Eliminar Libro");
            System.out.println("3- Mostrar Catalogo");
            System.out.println("4- SALIR");

            System.out.println("INGRESE LA OPERACION A REALIZAR");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Agrega el TITULO del libro: ");
                    String titulo = normalizar(scan.nextLine());

                    System.out.println("Agrega el AUTOR del libro: ");
                    String autor = normalizar(scan.nextLine());

                    System.out.println("Agrega el ISBN del libro: ");
                    String isbn = scan.nextLine();

                    libreria.agregarLibro(new Libro(titulo, autor, isbn));
                    break;

                case 2:
                    System.out.println("Ingresa el ISBN para eliminar el libro: ");
                    isbn = scan.nextLine();

                    libreria.eliminarLibro(isbn);
                    break;

                case 3:
                    libreria.mostrarCatalogo();
                    break;
                case 4:
                    System.out.println("ADIOS");
                    break;
                default:
                    System.out.println("DEBE SER DE 1 A 5");
                    break;
            }
        } while (opcion != 4);

        scan.close();

        // NORMALIZAR

    }

    public static String normalizar(String nombre) {
        return nombre.toLowerCase();

    }

}
