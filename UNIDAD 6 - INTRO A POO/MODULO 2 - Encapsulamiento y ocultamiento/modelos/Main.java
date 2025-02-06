package modelos;
/*
 * Menú interactivo

Crea un menú en el que el usuario pueda:

Seleccionar una figura geométrica (rectángulo, triángulo o círculo).

Ingresar los datos necesarios para la figura seleccionada.

Visualizar en consola los datos y cálculos correspondientes a la figura creada
 */

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("---- Menu ----");
            System.out.println("1 - Rectangulo");
            System.out.println("2 - Triangulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Salir");

            System.out.println("Ingresar opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("RECTANGULO");
                    double ancho;
                    System.out.println("Ingresar ANCHO: ");
                    ancho = sc.nextDouble();
                    double alto;
                    System.out.println("Ingresar ALTO: ");
                    alto = sc.nextDouble();
                    Rectangulo rectangulo1 = new Rectangulo(ancho, alto);
                    System.out.println("DATOS");
                    rectangulo1.imprimirDatos();
                    break;
                case 2:
                    System.out.println("TRIANGULO");
                    double base;
                    System.out.println("Ingresar BASE: ");
                    base = sc.nextDouble();
                    double altura;
                    System.out.println("Ingresar ALTURA: ");
                    altura = sc.nextDouble();
                    Triangulo triangulo1 = new Triangulo(base, altura);
                    System.out.println("DATOS");
                    triangulo1.imprimirDatos();
                    break;

                case 3:
                    System.out.println("CIRCULO");
                    double radio;
                    System.out.println("Ingresar RADIO: ");
                    radio = sc.nextDouble();
                    
                    Circulo circulo1 = new Circulo(radio);
                    System.out.println("DATOS");
                    circulo1.imprimirDatos();
                    break;
                case 4:
                System.out.println("Saliendo..");
                break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opcion != 4);
    }
}
