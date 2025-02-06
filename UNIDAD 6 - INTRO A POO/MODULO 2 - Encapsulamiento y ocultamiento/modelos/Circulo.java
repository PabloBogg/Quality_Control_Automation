package modelos;
/*
 * Clase Circulo

Crea una clase llamada Circulo en la carpeta modelos.

Define los atributos necesarios para calcular su área y perímetro (por ejemplo, radio).

Asegúrate de usar modificadores de acceso privados y de implementar getters y setters.

Desarrolla los métodos:

area(): Calcula y devuelve el área del círculo.

perimetro(): Calcula y devuelve el perímetro del círculo.

imprimirDatos(): Muestra en consola el radio, el área y el perímetro del círculo.
 */

public class Circulo {
    private double radio;
// Constructor
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
// Getters - Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
// Metodos
public double area(){
    return Math.PI*(radio*radio);
} 

public double perimetro(){
    return 2*Math.PI*radio;
}

public void imprimirDatos(){
    System.out.println("Radio: "+radio);
    System.out.println("Area: "+area());
    System.out.println("Perimetro: "+perimetro());
    
}
    
    
    
}
