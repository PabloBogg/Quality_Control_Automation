
/*✏️  Actividad: Promediando elementos
Escribe un programa en el cual se cree una variable de tipo array
que contenga cuatro elementos de tipo entero. Estos elementos deben
ser ingresados por el usuario. El programa debe sumar y promediar 
los cuatro elementos de forma manual e imprimir por consola el 
resultado, utilizando solamente las herramientas adquiridas 
hasta el momento.
*/
import java.util.Scanner;

public class promediandoElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Definicion del array
        int[] array= new int[4];

        // Ingreso de valores por teclado
        System.out.println("Ingresar el 1° valor: ");
        array[0]=sc.nextInt();
        System.out.println("Ingresar el 2° valor: ");
        array[1]=sc.nextInt();
        System.out.println("Ingresar el 3° valor: ");
        array[2]=sc.nextInt();
        System.out.println("Ingresar el 4° valor: ");
        array[3]=sc.nextInt();

        // Calculo de suma y promedio
        int suma=array[0] + array[1] + array[2] + array[3];
        float promedio = suma/array.length;

        // Mostrar resultados por pantalla
        System.out.println("Array: [" + array[0]+", "+ array[1]+", "+ array[2]+", "+ array[3]+"]");
        System.out.println("La suma de todos los elementos del array es: " + suma);
        System.out.println("El promedio de todos los elementos del array es: " + promedio);
    
        sc.close();
    }
}
