package desafio;
/*
 * Escribe un programa principal (Main) donde:

Crees una biblioteca.

Agregues libros al arreglo.

Muestres los libros disponibles.

Prestes y devuelvas libros.
 */

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca("biblioteca1", 3);

        Libro libro1 = new Libro("Mobyi Dick", "Melville", 1840);
        Libro libro2 = new Libro("Ana Carenina", "Tolstoy", 1830);
        Libro libro3 = new Libro("100 de Soledad", "Gabriel Garcia Marquez", 1970);

        biblioteca1.agregarLibro(libro1);
        biblioteca1.agregarLibro(libro2);
        biblioteca1.agregarLibro(libro3);


        System.out.println("Mostrar libros diponibles");
        biblioteca1.mostrarLibrosDisponibles();

        System.out.println("Prestar libro 1");
        biblioteca1.prestarLibro("Mobyi Dick");



    }
}
