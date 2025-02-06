package modelos2;

/*
 * En la clase ejecutable, declara una variable global como un arreglo de 
 * objetos 'Punto' para almacenar las instancias creadas."
 */
public class Main {
    public static Punto[] puntosArray = new Punto[3];

    public static void main(String[] args) {
        puntosArray[0] = new Punto(5, 10);
        puntosArray[1] = new Punto(6, 15);
        puntosArray[2] = new Punto(5, 20);

        System.out.println("La distancia desde el ORIGEN al PUNTO 1 es: " + puntosArray[0].distanciaDesdeOrigen());
        System.out.println("---");
        System.out.println("La distancia entre el PUNTO 1 (" + puntosArray[0].getX() + "," + puntosArray[0].getY()
                + ") y el PUNTO 2 (" + puntosArray[1].getX() + "," + puntosArray[1].getY() + ") es: "
                + Punto.calcularDistancia(puntosArray[0], puntosArray[1]));
        System.out.println("---");
        
        System.out.println("Los PUNTOS 1, 2 y 3: ");
        Punto.estanAlineados(puntosArray[0], puntosArray[1],puntosArray[2]);
    }
}
