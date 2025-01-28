/*
 * 2. Tabla de multiplicar 2.0

En esta actividad, vas a crear un programa que solicita al usuario que 
ingrese 3 números (incluida la lógica en un método llamado pedirNumeros
())  y luego imprime la tabla de multiplicar de cada uno de ellos  1 al 
  10 (incluida la lógica en un método llamado imprimirTablasMultiplicar
  (int[] numeros)). Para ello, implementarás un  un array para almacenar 
  los números ingresados y luego invocarás el método para cada uno de ellos.
 */

import java.util.Scanner;

public class complementario2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int [] array=new int[3];
        for (int i = 0; i <array.length; i++) {
            array[i]=pedirNumeros(sc);
            imprimirTablasMultiplicar(array[i]);

        }

    }

    public static int pedirNumeros(Scanner sc) {
        int num = 0;
        do {
            try {
                System.out.println("Ingresar numero entero: ");
                num = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Ingresar solo numero entero.");
                sc.nextLine();
            }
        } while (num == 0);

        return num;

    }

    public static void imprimirTablasMultiplicar(int num){
        System.out.println("--- TABLA DEL "+num+" ---");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i+" * "+num+" = "+(num*i));
        }
        System.out.println("---------------");
    }

}
