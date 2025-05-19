/* ✏️  Actividad: Divisibilidad
En esta actividad, escribirás un programa que solicite al usuario un 
número y determine si es divisible por 5, por 3, por ambos o por ninguno. El resultado se mostrará en pantalla. */

import java.util.Scanner;

public class actividadDivisibilidad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar un numero: ");
        int num=sc.nextInt();

        boolean divisiblePor5= (num%5==0)? true:false;
        boolean divisiblePor3= (num%3==0)? true:false;

        if (divisiblePor5 && divisiblePor3) {
            System.out.println("El numero "+num+" es divisible por 5 y 3.");
        }
        else if (divisiblePor5){
            System.out.println("El numero "+num+" es divisible por 5.");
        }
        else if (divisiblePor3){
            System.out.println("El numero "+num+" es divisible por 3.");
            
        }
        else {System.out.println("El numero "+num+" no es divisible por 5 ni por 3.");
    }
    sc.close();
    }
}
