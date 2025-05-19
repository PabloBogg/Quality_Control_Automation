
/* ✏️  Actividad: Ejercicios Complementarios
Ordenando Nombres Alfabéticamente
Desarrolla un programa que pida al usuario ingresar 4 nombres. Estos nombres serán
ordenados alfabéticamente y posteriormente impresos en la consola. Es esencial 
emplear exclusivamente las herramientas aprendidas hasta el momento.
*/
import java.util.Arrays;
import java.util.Scanner;

public class complementario3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definicion del array
        String[] array = new String[4];

        // Ingreso de nombres por teclado
        System.out.println("Ingresar el 1° nombre: ");
        array[0] = sc.nextLine();
        System.out.println("Ingresar el 2° nombre: ");
        array[1] = sc.nextLine();
        System.out.println("Ingresar el 3° nombre: ");
        array[2] = sc.nextLine();
        System.out.println("Ingresar el 4° nombre: ");
        array[3] = sc.nextLine();

        // Mostrar resultado
        System.out.println("Array original: " + Arrays.toString(array));
        // Ordenar el array
        Arrays.sort(array);
        // Mostrar resultado
        System.out.println("Array ordenado: " + Arrays.toString(array));
        sc.close();

    }

}
