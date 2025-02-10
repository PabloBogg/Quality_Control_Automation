package desafio;
/*
 * b) Clase Biblioteca

Atributos privados:

nombre (String)

libros (arreglo de objetos Libro, tamaño fijo)

cantidadLibros (int, para llevar la cuenta de libros en el arreglo)

Constructor público: Recibe el nombre de la biblioteca y el tamaño máximo 
del arreglo. Inicializa el arreglo libros y cantidadLibros en 0.

Métodos:

agregarLibro(Libro libro): Verifica si hay espacio disponible en el arreglo. 
Si lo hay, agrega el libro y aumenta cantidadLibros. Si el libro ya existe 
(mismo título y autor), muestra un mensaje de error.

mostrarLibros(): Recorre el arreglo y muestra los datos de cada libro almacenado.

prestarLibro(String titulo): Busca un libro por su título en el arreglo. 
Si está disponible, cambia su estado a false. Si no lo encuentra o no está 
disponible, muestra un mensaje de error.

devolverLibro(String titulo): Busca un libro por su título en el arreglo. 
Si no está disponible, cambia su estado a true. Si no lo encuentra, muestra 
un mensaje de error.
 */

public class Biblioteca {
    private String nombre;
    private Libro[] libros;
    private int cantidadLibros;

    // Constructor
    public Biblioteca(String nombre, int tamaño) {
        this.nombre = nombre;
        this.libros = new Libro[tamaño];
        this.cantidadLibros = 0;
    }

    /*
     * agregarLibro(Libro libro): Verifica si hay espacio disponible en el arreglo.
     * Si lo hay, agrega el libro y aumenta cantidadLibros. Si el libro ya existe
     * (mismo título y autor), muestra un mensaje de error.
     */

    public void agregarLibro(Libro libro) {// [libro1, libro2]
        boolean libroYaExiste = false;
        if (cantidadLibros < libros.length) {

            for (Libro recorreLibros : libros) {

                if (!(recorreLibros == null)) {

                    if (recorreLibros.getTitulo().equals(libro.getTitulo())
                            && recorreLibros.getAutor().equals(libro.getAutor())) {
                        libroYaExiste = true;
                    }
                }
            }

            if (!libroYaExiste) {
                libros[cantidadLibros] = libro;
                cantidadLibros++;
                System.out.println("Libro agregado correctamente");
            } else {
                System.out.println("Error, el libro ya existe.");
            }

        } else {
            System.out.println("No es posible agregar el libro, no hay lugar disponible.");
        }
    }

    /*
     * mostrarLibros(): Recorre el arreglo y muestra los datos de cada libro
     * almacenado.
     */

    public void mostrarLibros() {

        for (Libro libro : libros) {
            libro.mostrarDatosLibro();
        }
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("--LIBROS DISPONIBLES--");
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                libro.mostrarDatosLibro();
            }

        }
    }

    /*
     * prestarLibro(String titulo): Busca un libro por su título en el arreglo.
     * Si está disponible, cambia su estado a false. Si no lo encuentra o no está
     * disponible, muestra un mensaje de error.
     */

    public void prestarLibro(String titulo) {
        boolean estaDisponible=false;
        boolean libroInexistente=false;
        for (Libro recorreLibros : libros) {
            if (recorreLibros.getTitulo().equals(titulo)) {
                if (recorreLibros.isDisponible()) {
                    recorreLibros.setDisponible(false);
                    System.out.println("Libro prestado correctamente.");
                    estaDisponible=true;
                    break;
                }
            } else{
                libroInexistente=true;
            }
        }
        if (!estaDisponible) {
            System.out.println("El libro no esta disponible.");
                                
        }
        if (libroInexistente)  
         {
                System.out.println("El libro no se encuentra en la biblioteca.");
        }
    }

    /*
     * devolverLibro(String titulo): Busca un libro por su título en el arreglo.
     * Si no está disponible, cambia su estado a true. Si no lo encuentra, muestra
     * un mensaje de error.
     */

    public void devolverLibro(String titulo) {

        for (Libro recorreLibros : libros) {
            if (recorreLibros.getTitulo().equals(titulo)) {
                if (!recorreLibros.isDisponible()) {
                    recorreLibros.setDisponible(true);
                } else {
                    System.out.println("El libro ya estaba disponible.");
                    ;
                }
            } else {
                System.out.println("El libro no se encuentra en la biblioteca.");
            }
        }

    }

}
