/*
 * ✏️  Actividad: Contando Elementos Pares
Escribe un programa que genere un array de 10 elementos de tipo entero.
 Inicializa cada elemento con un número aleatorio menor a 100 y 
 luego imprime todos los elementos del array en una única línea. 
 Posteriormente, recorre el array para contar los elementos pares 
 y muestra el total en la consola.
 */

import java.util.Random;

public class contandoElementosPares {
    public static void main(String[] args) {
       
        int[] array = new int[10];
        Random numAleatorio = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = numAleatorio.nextInt(100);
        }

        System.out.print("Elementos del arreglo: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int countPares = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                countPares++;
            }
        }
        System.out.println("Total de elementos pares: " + countPares);
    }
    
}

