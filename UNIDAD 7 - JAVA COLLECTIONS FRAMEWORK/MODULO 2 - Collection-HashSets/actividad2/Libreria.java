package actividad2;
/*
 * Diseña la clase Libreria:

Declara un HashSet para almacenar los objetos Libro y gestionar el catálogo.

Implementa los siguientes métodos:

agregarLibro(Libro libro): Permite agregar un objeto Libro al catálogo. Usa el comportamiento de HashSet para evitar duplicados.

eliminarLibro(String isbn): Elimina del catálogo el libro que coincida con el número de ISBN proporcionado.

mostrarCatalogo(): Imprime la lista actual de libros del catálogo, mostrando su título, autor y número de ISBN.
 */

import java.util.HashSet;

public class Libreria {

    HashSet<Libro> libreria = new HashSet<Libro>();

    public void agregarLibro(Libro libro) {
        if (libreria.add(libro)) {
            System.out.println("Agregado correctamente");
        } else {
            System.out.println("No se pudo agregar");
        }

    }

    public void eliminarLibro(String isbn) {
        for (Libro libro : libreria) {
            if (libro.equals(new Libro(null, null, isbn))) {
                if (libreria.remove(libro)) {
                    System.out.println("Eliminado correctamente");
                    break;
                } else {
                    System.out.println("No se pudo eliminar");
                }
            }

        }

    }

    public void mostrarCatalogo() {
        for (Libro libro : libreria) {
            libro.imprimirDatos();
        }
    }

}
