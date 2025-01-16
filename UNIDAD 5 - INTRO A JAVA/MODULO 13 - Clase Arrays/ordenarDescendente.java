/*
 * ✏️  Actividad: Ordenar en forma descendente
Escribe un programa en el que declares una variable de tipo array que 
contenga 10 elementos de tipo entero. Inicializa el arreglo con valores 
aleatorios entre 1 y 100, imprime por consola el arreglo inicial y luego 
ordenalo en forma descendente utilizando el método Arrays.sort(). 
Finalmente, imprime los elementos ordenados en la consola.
 */
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;


public class ordenarDescendente {
    public static void main(String[] args) {
        
        Integer[] arr = new Integer[10];
        Random rand = new Random();

        for (int i=0; i<arr.length; i++){
            arr[i] = rand.nextInt(100) + 1;
        }
        System.out.println("Original: " + Arrays.toString(arr));
        
        Arrays.sort(arr, Collections.reverseOrder()); // Usando Collections

        /* 
        // Invirtiendo manualmente
        Arrays.sort(arr);
        for (int i=0; i< arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        */

        System.out.println("Descendente: " + Arrays.toString(arr));
    }
}