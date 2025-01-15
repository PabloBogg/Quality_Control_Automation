/*
 * ✏️  Actividad: Menú interactivo con while 
Crea un menú interactivo con 5 opciones para que el usuario elija, como por ejemplo:

Comprar producto.
Realizar devolución.
Ver mis pedidos.
Preguntas frecuentes.
Salir.

Luego, solicita al usuario que elija una opción del menú mostrado en pantalla. 
El menú debe seguir apareciendo hasta que el usuario elija la opción para 
salir del programa. En este ejercicio, no es necesario que las opciones 
del menú realicen acciones reales, simplemente muestra un mensaje que 
indique qué opción eligió el usuario.
 */

import java.util.Scanner;

public class menuInteractivoWhile {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese alguna de las siguientes opciones: \n1)Comprar producto" +
                "\n2)Realizar devolucion\n3)Ver mis pedidos\n4)Preguntas Frecuentes\n5)Salir");
        int opcion = leer.nextInt();

        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    System.out.println("Usted ha comprado el producto X");
                    break;
                case 2:
                    System.out.println("Ud. ha realizado la devolución de un producto");
                    break;
                case 3:
                    System.out.println("Ver lista de pedidos");
                    break;
                case 4:
                    System.out.println("Preguntas frecuntes: haga sus preguntas");
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
                    break;

            }
            System.out.println("Ingrese alguna de las siguientes opciones: \n1)Comprar producto" +
                    "\n2)Realizar devolucion\n3)Ver mis pedidos\n4)Preguntas Frecuentes\n5)Salir");
            opcion = leer.nextInt();
        }
        System.out.println("Gracias por su compra!!!");
        leer.close();
    }

}
