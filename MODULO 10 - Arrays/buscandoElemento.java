/*
✏️  Actividad: Buscando un elemento
El programa debe crear un array de tamaño 3 que almacene números enteros.
Luego, solicita un número al usuario y muestra por consola si ese número
está presente en el array o no. Es importante utilizar únicamente las
herramientas aprendidas hasta el momento, sin emplear bucles en el proceso.
 */

import java.util.Scanner;

public class buscandoElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definicion del array
        int[] array = { 2, 5, 58 };

        // Ingreso de valores por teclado
        System.out.println("Ingresar el numero a buscar: ");
        int num = sc.nextInt();

        // Determianr si el numero esta en el array
        boolean numExiste = false;
        int indice = 0;

        if (array[0] == num) {
            numExiste = true;
            indice = 0;
        } else if (array[1] == num) {
            numExiste = true;
            indice = 1;
        } else if (array[2] == num) {
            numExiste = true;
            indice = 2;
        }

        // Mostrar resultados por pantalla
        System.out.println("Array: [" + array[0] + ", " + array[1] + ", " + array[2] + "]");
        if (numExiste) {
            System.out.println("El numero " + num + " esta en el array en la posicion " + indice + 1);
        } else {
            System.out.println("El numero" + num + " no esta en el array");
        }

        sc.close();
    }
}
