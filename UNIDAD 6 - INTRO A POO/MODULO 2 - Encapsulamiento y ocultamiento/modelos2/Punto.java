package modelos2;

/*Crea una clase llamada  'Punto' que representa un punto en un plano bidimensional.

Define 2 atributos para la clase del tipo private: x e y que representan las coordenadas del punto.

Crea los métodos getter y setter de todos los atributos de la clase. 

Crea un método de instancia llamado 'distanciaDesdeOrigen', que calcula y devuelve la distancia
del punto desde el origen (0,0).

Crea un método para cálculos entre puntos, estático, llamado 'calcularDistancia' en la clase 'Punto'.
Este método recibe dos objetos de la misma clase y calcula la distancia entre ellos.

Crea un método estático para cálculos entre puntos, llamado 'estanAlineados' en la clase 'Punto'.
Este método recibe tres objetos de la clase 'Punto' y determina si los puntos dados están alineados
en la misma recta*/
public class Punto {

    private double x;
    private double y;

    public Punto() {
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanciaDesdeOrigen() {
        return Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));

    }

    public static double calcularDistancia(Punto p1, Punto p2) {
        return Math.sqrt((Math.pow(p1.getX() - p2.getX(), 2)) + (Math.pow(p1.getY() - p2.getY(), 2)));

    }

    public static void estanAlineados(Punto p1, Punto p2, Punto p3) {
        if ((p1.getX() == p2.getX() && p2.getX() == p3.getX()) || (p1.getY() == p2.getY() && p2.getY() == p3.getY())) {
            System.out.println("Estan alineados");
        } else {
            System.out.println("No estan alineados");
        }
    }
}
