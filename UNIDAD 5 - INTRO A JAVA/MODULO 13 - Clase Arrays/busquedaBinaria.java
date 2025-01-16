/*
 * ✏️  Actividad: Búsqueda binaria
La búsqueda binaria es un algoritmo eficiente para encontrar un 
elemento en una lista ordenada de elementos. La clase Arrays 
ya incluye su implementación mediante el método binarySearch(). 
Escribe un programa que realice una búsqueda binaria en un arreglo 
ordenado de enteros utilizando el método Arrays.binarySearch(). 
El programa debe imprimir el arreglo generado originalmente, solicitar 
al usuario el valor buscado e imprimir el índice del valor buscado 
si está presente en el arreglo.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class busquedaBinaria {
    public static void main(String[] args) {
        Scanner scanner;
        Random random;
        scanner = new Scanner(System.in);
        random = new Random();
        Integer[] arr = new Integer[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 1;
        }
        System.out.println("Original: " + Arrays.toString(arr));

        //Arrays.sort(arr);

        System.out.println("Ingrese el numero a buscar");

        int find = scanner.nextInt();

        int index = Arrays.binarySearch(arr, find);

        System.out.println(index >= 0 ? "Si se encuentra con indice = " + index : "No se encuentra");

        scanner.close();
    }
    
}
