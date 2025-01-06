/* ✏️  Actividad: Resta con Manejo de Excepciones
Escribe un programa que solicite al usuario ingresar dos números. 
Luego, realiza la resta del primer número menos el segundo número. 
Implementa un bloque "try-catch" para manejar las excepciones que puedan 
surgir en caso de que el usuario no ingrese números. En caso de que se 
produzca una excepción, muestra un mensaje apropiado en pantalla. 
Si no se produce ninguna excepción, muestra el resultado de la resta. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class actividadRestaManejoExcepciones {
    public static void main(String[] args) {
        
        try{
            Scanner teclado=new Scanner(System.in);
            System.out.println("Ingresar primer numero: ");
            int num1=teclado.nextInt();
            System.out.println("Ingresar segundo numero: ");
            int num2=teclado.nextInt();

            int resultado=num1-num2;
            System.out.println("El resultado es: "+resultado);
            teclado.close();
        }
        catch(InputMismatchException e)
        {
            System.out.println("El dato ingresado debe ser un numero: "+ e.getMessage());
        }

    }
}