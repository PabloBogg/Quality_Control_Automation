/*✏️  Actividad: Division Segura 
Escribe un programa que pida al usuario que ingrese dos números enteros y 
realice la división del primer número entre el segundo número. 
Implementa un bloque "try-catch" para manejar la excepción en caso de 
que se intente realizar una división por cero. En caso de que ocurra 
la excepción, muestra un mensaje apropiado en la pantalla */

import java.util.InputMismatchException;
import java.util.Scanner;

public class actividadDivisionSegura {
public static void main(String[] args) {
    try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar num1: ");
        int num1=sc.nextInt();
        System.out.println("Ingresar num2: ");
        int num2=sc.nextInt();
        int resultado=num1/num2;
        System.out.println("El resultado es: "+resultado);
        sc.close();
    }
    catch(ArithmeticException e){
        System.out.println("Error: "+e.getMessage());
    }
    catch(InputMismatchException e){
        System.out.println("Error: "+e.getMessage());
            }
}    
}
