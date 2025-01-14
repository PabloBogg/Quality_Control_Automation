/*
 * ✏️  Actividad: Imprimiendo elementos en orden inverso
Escribe un programa que recorra un array de enteros y los imprima en 
orden inverso, comenzando desde el último elemento.. El tamaño y 
los números  a contener pueden ser de tu elección.
 */
public class imprimiendoElementosOrdenInverso {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
