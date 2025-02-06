package modelos;
/*
 * Clase Rectangulo

Dentro de la carpeta, crea una clase llamada Rectangulo.

Define dos atributos privados: ancho y alto. Pueden ser números decimales o enteros.

Diseña dos constructores:

Uno que reciba todos los parámetros para inicializar los atributos.

Otro sin parámetros (constructor por defecto).

Implementa los métodos getter y setter para acceder y modificar los atributos de forma controlada.

 Crea los siguientes métodos:

area(): Calcula y devuelve el área del rectángulo.

perimetro(): Calcula y devuelve el perímetro del rectángulo.

imprimirDatos(): Muestra en consola los atributos, el área y el perímetro del rectángulo.
 */

 public class Rectangulo{
    private double ancho;
    private double alto;
    
    // Contructores
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }


    public Rectangulo() {
    }

    // Getters - Setters
    public double getAncho() {
        return ancho;
    }


    public double getAlto() {
        return alto;
    }


    public void setAncho(double ancho) {
        this.ancho = ancho;
    }


    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double area(){
        return ancho*alto;
    } 

    public double perimetro(){
        return (ancho+alto)*2;
    }

    public void imprimirDatos(){
        System.out.println("Ancho: "+this.getAncho());
        System.out.println("Alto: "+this.getAlto());
        System.out.println("Area: "+area());
        System.out.println("Perimetro: "+perimetro());
    }

    //rectangulo1.imprimirDatos()

 }