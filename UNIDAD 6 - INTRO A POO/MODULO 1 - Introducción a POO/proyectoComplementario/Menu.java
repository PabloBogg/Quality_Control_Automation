/*
 * Ejercicio: Menú de opciones para crear un objeto Auto

Diseña un menú interactivo en consola que permita al usuario crear un objeto de la clase Auto.

Sugerencias:

El usuario podrá ingresar valores para los atributos del objeto (marca, modelo, año), pero también 
tendrá la opción de dejar algunos atributos sin completar.

Incluye una opción en el menú para imprimir en consola los valores de los atributos del objeto creado.

En los constructores donde no se reciban suficientes parámetros para inicializar todos los atributos, 
asigna un valor por defecto a los atributos restantes. Esto garantizará que el objeto siempre tenga 
valores válidos.
 */
package proyectoComplementario;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Auto[] autos=new Auto[0];
        int opcion = 0;

        do {
            System.out.println("---- Menu ----\n" +
                    "1 - Crear auto\n" +
                    "2 - Mostrar datos\n" +
                    "4 - Salir\n" + 
                    "--------------" );

            opcion = ingresarEnteroValidado();
            sc.nextLine();

            switch (opcion) {
                case 1:
                autos = Arrays.copyOf(autos, autos.length + 1);
                autos[autos.length-1]=crearAuto();
                    break;

                case 2:
                    for (Auto auto : autos) {
                        auto.imprimirDatos();
                    }
                    break;
                case 4:
                    System.out.println("Saliendo");

                    break;

                default:
                    System.out.println("");
                    break;
            }

        } while (opcion != 4);

    }

    public static int ingresarEnteroValidado() {
        int aux = 0;

        try {
            do {
                System.out.println("Ingresar opcion: ");
                aux = sc.nextInt();
            } while (aux != 1 && aux != 2 && aux != 4);
        } catch (Exception e) {
            System.out.println("Dato del tipo incorrecto: " + e.getMessage());
            return 4;
        }

        return aux;

    }

    public static Auto crearAuto(){
        String marca;
        System.out.println("Ingresar MARCA: ");
        marca=sc.nextLine();
        
        String modelo;
        System.out.println("Ingresar MODELO: ");
        modelo=sc.nextLine();

        int año;
        System.out.println("Ingresar AÑO: ");
        año=sc.nextInt();

        return new Auto(marca, modelo, año);

    }

}
