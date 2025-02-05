/*
 * ✏️  Actividad: Trabajando con una figura geométrica
Objetivo:  Practicar el uso de atributos estáticos, métodos, y la implementación de un menú 
interactivo para trabajar con objetos en Java.

Instrucciones:

Crea una clase llamada Rectangulo.

Define dos atributos (ancho y alto) que pueden ser números decimales o enteros.

Define un atributo estático de tipo entero llamado contadorRectangulos, que registre el número 
total de instancias de la clase Rectangulo creadas.

Diseña un constructor con parámetros:

El constructor debe inicializar los valores de ancho y alto.

Además, debe incrementar en 1 el valor de contadorRectangulos cada vez que se cree una nueva 
instancia.

Implementa los siguientes métodos:

area(): Calcula y devuelve el área del rectángulo.

perimetro(): Calcula y devuelve el perímetro del rectángulo.

imprimirArea(): Muestra el área calculada en la consola.

imprimirPerimetro(): Muestra el perímetro calculado en la consola.

Un método estático que permita obtener el valor actual de contadorRectangulos para conocer 
cuántos rectángulos se han creado hasta el momento.

Desarrolla un menú interactivo(opcional):

Permite al usuario crear nuevas instancias de la clase Rectangulo.

Incluye opciones para acceder a los métodos y mostrar información relevante, como el área, 
el perímetro y el total de rectángulos creados.
 */
package proyecto3;

public class Rectangulo {
    private double ancho;
    private double alto;
    private static int contadorRectangulos;

    public Rectangulo(double ancho, double alto){
        this.ancho=ancho;
        this.alto=alto;
        contadorRectangulos++;
    }

    public double area(){
        return ancho*alto;
    }

    public double perimetro(){
        return (ancho+alto)*2;
    }

    public void imprimirArea(){
        System.out.println("Area: "+area());
    }

    public void imprimirPerimetro(){
        System.out.println("Perimetro: "+perimetro());
    }

    public static void imprimirContador() {
        System.out.println("Cantidad de rectangulos: "+contadorRectangulos);
    }
    
}
