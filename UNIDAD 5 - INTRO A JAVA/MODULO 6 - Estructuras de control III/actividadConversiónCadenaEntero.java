/* ✏️  Actividad: Conversión de Cadena a Entero
Escribe un programa que solicite al usuario ingresar una cadena 
de caracteres que represente un número entero. Utiliza el método 
Integer.parseInt() para convertir la cadena en un número entero. 
Implementa un bloque "try-catch" para manejar la excepción en caso 
de que la cadena ingresada no pueda ser convertida en un número entero.
En caso de que se produzca la excepción, muestra un mensaje apropiado 
en la pantalla. */

import java.util.Scanner;

public class actividadConversiónCadenaEntero {
public static void main(String[] args) {
    try {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar cadena para representar un numero: ");
        String cadena=sc.nextLine();
        System.out.println("El numero ingresado es: "+Integer.parseInt(cadena));
        sc.close();
    } catch (Exception e) {
        System.out.println("Error: "+e.getMessage());
        e.printStackTrace();
    }
}    
}
