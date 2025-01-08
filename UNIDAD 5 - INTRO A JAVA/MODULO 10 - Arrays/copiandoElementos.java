/*✏️  Actividad: Copiando elementos
Desarrolla un programa que inicie creando un array de 3 enteros, con 
valores predeterminados. Posteriormente, genera una copia del mismo 
con una extensión de 2 elementos adicionales.
Solicita al usuario que ingrese dos números para ser almacenados 
en las nuevas posiciones del array.
Finalmente, muestra por consola el contenido del nuevo array.
Es esencial emplear exclusivamente las herramientas aprendidas 
hasta el momento, evitando el uso de bucles en el proceso. */

import java.util.Scanner;

public class copiandoElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definicion del array1 y array2
        int[] array1 = { 2, 50, 583 };
        int[] array2= new int[5];
        

        // Ingreso de valores por teclado
        System.out.println("Ingresar el 4° valor del array N°2: ");
        array2[3]=sc.nextInt();
        System.out.println("Ingresar el 5° valor del array N°2: ");
        array2[4]=sc.nextInt();

        // Definicion del array2
        array2[0]=array1[0];
        array2[1]=array1[1];
        array2[2]=array1[2];

       // Mostrar resultados por pantalla
        System.out.println("Array N°1: [" + array1[0] + ", " + array1[1] + ", " + array1[2] + "]");
        System.out.println("Array N°2: [" + array2[0] + ", " + array2[1] + ", " + array2[2] + ", " + array2[3] + ", " + array2[4] +"]");
       

        sc.close();
    }
}
