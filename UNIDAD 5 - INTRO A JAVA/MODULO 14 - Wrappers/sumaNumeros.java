/*
 * ✏️  Actividad: Suma de números
Pídele al usuario que introduzca una cadena que represente 
un número entero y luego otra cadena que represente un 
número decimal. Convierte cada cadena al tipo de dato 
correspondiente utilizando los métodos valueOf, suma 
sus valores e imprímelos por consola.
 */

import java.util.Scanner;

public class sumaNumeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("Ingresar cadena con NUMERO ENTERO: ");
        int numEntero = Integer.valueOf(sc.nextLine());
         

        System.out.println("Ingresar cadena con NUMERO DECIMAL: ");
        Double numDecimal = Double.valueOf(sc.nextLine());

        System.out.println("La suma es: "+ (numEntero+numDecimal));
        } catch (Exception e) {
            System.out.println("Erro en el dato ingresado");
        }

        

        sc.close();


    }
}
