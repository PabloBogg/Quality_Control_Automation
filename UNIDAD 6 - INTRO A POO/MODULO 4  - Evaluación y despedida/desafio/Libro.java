package desafio;
/*
 * a) Clase Libro

Atributos privados:

titulo (String)

autor (String)

anioPublicacion (int)

disponible (boolean, por defecto true)

Constructor público: Recibe el título, autor y año de publicación, inicializando  
el atributo “disponible” como true.

Métodos:

getter y setters correspondientes. 
 */

class Libro{

    //Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    //Constructor
    public Libro (String titulo, String autor, int anioPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
        this.disponible=true;
    }

    //Getters-Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }  

    public void mostrarDatosLibro(){
        System.out.println("Libro: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Año de publicacion: "+anioPublicacion);
        System.out.println("Disponible: "+((disponible)?"Si":"No"));//variable = (condición) ? expresión1 : expresión2;

    }

}