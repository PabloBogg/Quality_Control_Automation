/* ✏️  Actividad: Ejercicios Complementarios
Generando un número aleatorio entre dos límites
Escribe un programa en el que se cree una variable de tipo array que contenga seis
elementos de tipo entero. El programa debe contar la cantidad de elementos pares
presentes en el array y mostrar el resultado por consola utilizando solo las 
herramientas aprendidas hasta el momento.
*/

import java.util.Scanner;

public class complementario1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Definicion del array
        int[] array= new int[6];

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
        System.out.println("Ingresar el 6° valor: ");
        array[5]=sc.nextInt();

        // Contar el numero de elemntos par
        int contador=0;
        if (array[0]%2==0){
            contador=contador+1;
        }
        if (array[1]%2==0){
            contador=contador+1;
        }
        if (array[2]%2==0){
            contador=contador+1;
        }
        if (array[3]%2==0){
            contador=contador+1;
        }
        if (array[4]%2==0){
            contador=contador+1;
        }
        if (array[5]%2==0){
            contador=contador+1;
        }

        // Mostrar resultado
        System.out.println("Array: [" + array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4]+ ", " + array[5] +"]");
        System.out.println("La cantidad de numeros pares en el array es: "+ contador);
        sc.close();

    }
    
}


