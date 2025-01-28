/*
 * Imprimir array: Crea un programa que utilice un método 
 * "imprimirArray(int[] array)" que se encargue de imprimir 
 * un array por consola. El método debe recibir como parámetro 
 * un arreglo de tipo "int" y no devolver nada. Luego, crea 
 * una sobrecarga del método para que acepte arrays de tipo 
 * String y arreglos bidimensionales de tipo "int" y de tipo "String".
 */

import java.util.Arrays;

public class imprimirArray {

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5 };
        String[] stringArray = { "Hola", "Mundo", "Java" };
        int[][] intMatrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        String[][] stringMatrix = { { "A", "B", "C" }, { "D", "E", "F" } };

       System.out.println("Array Int");
        imprimirArray(intArray);
        System.out.println("Array String");
        imprimirArray(stringArray);
        System.out.println("Array Int[][]");
        imprimirArray(intMatrix);
        System.out.println("Array String[][]");
        imprimirArray(stringMatrix);

    }

    public static void imprimirArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void imprimirArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void imprimirArray(int[][] array) {
        for (int i=0;i<array.length;i++){
            System.out.println(Arrays.toString(array[i]));
        }
        
    }

    public static void imprimirArray(String[][] array) {
        for (int i=0;i<array.length;i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
