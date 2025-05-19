/* ✏️  Actividad: Ejercicios Complementarios
Sumando elementos en posiciones pares
Desarrolla un programa que cree un array de tamaño 5 que almacene números enteros.
Luego, suma los elementos ubicados en las posiciones pares del array (es decir, 
las posiciones 0, 2 y 4) y muestra por consola el resultado de la suma. Utiliza 
exclusivamente las herramientas aprendidas hasta el momento.
*/

import java.util.Scanner;

public class complementario2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // Definicion del array
        int[] array= new int[5];

        // Ingreso de valores por teclado
        System.out.println("Ingresar el 1° valor: ");
        array[0]=sc.nextInt();
        System.out.println("Ingresar el 2° valor: ");
        array[1]=sc.nextInt();
        System.out.println("Ingresar el 3° valor: ");
        array[2]=sc.nextInt();
        System.out.println("Ingresar el 4° valor: ");
        array[3]=sc.nextInt();
        System.out.println("Ingresar el 5° valor: ");
        array[4]=sc.nextInt();
        

        // Suma en elementos pares
        int suma=array[0]+array[2]+array[4];

        // Mostrar resultado
        System.out.println("Array: [" + array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4]+ "]");
        System.out.println("-----: [|, -, |, -, |]");
        System.out.println("La suma de los elementos en los indices pares es: "+ suma);
        sc.close();

    }
    
}


