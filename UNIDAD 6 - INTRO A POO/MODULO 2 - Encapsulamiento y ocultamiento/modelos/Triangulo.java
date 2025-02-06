package modelos;
/*
 * Clase Triangulo

En la misma carpeta modelos, crea una clase llamada Triangulo.

Define los atributos necesarios para calcular su área (por ejemplo, base y altura).

Usa modificadores de acceso privados para proteger los atributos y crea sus respectivos getters y setters.

Implementa los métodos:

area(): Calcula y devuelve el área del triángulo.

imprimirDatos(): Muestra en consola los atributos y el área del triángulo.
 */

public class Triangulo {
    private double base; 
    private double altura;
    
    // Constructores
    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
// Getters - Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Metodos
    public double area(){
        return (base*altura)/2;
    } 

    public void imprimirDatos(){
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Area: "+area());
        
    }
    
}
