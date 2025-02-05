/*
 * ✏️  Actividad: Fibonacci y recursividad
Reorganiza el código extrayendo la lógica en métodos sin alterar su funcionamiento. 
Después, intenta modificar la lógica para resolverlo de forma recursiva. 
 */
import java.util.Scanner;

public class fibonacciProyecto {
    public static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args) {
    int numero = pedirNumero();
   
    System.out.println("El valor del calculo de Fibonacci en la posición: " + numero +" es: " + fibonacci(numero));
    System.out.println("El resultado con RECURSIVIDAD de Fibonacci es : "+recursividadFibonacci(numero));

    
   }


   public static int pedirNumero(){
    System.out.println("Ingrese la posicion de la serie Fibonacci que quiere conocer:");
        int n = scanner.nextInt();
        return n;
   }

    public static int fibonacci(int n) {
        int[] serie = new int[n + 1];
        int i = 0;
        int posicion = 0;

        while (posicion <= n) {
            if (posicion == 0) {
                serie[posicion] = 0;
                i++;
            } else if (posicion == 1) {
                serie[posicion] = 1;
            } else {
                serie[posicion] = i;
                i = serie[posicion - 1] + serie[posicion];
            }
            posicion++;
        }
        return serie[n];
    }
    
    public static int recursividadFibonacci(int posicion){
        if(posicion == 0){
            return 0;
        }
        if(posicion == 1){
            return 1;
        }

        return recursividadFibonacci(posicion - 1) + recursividadFibonacci(posicion - 2);


    }

    
}
