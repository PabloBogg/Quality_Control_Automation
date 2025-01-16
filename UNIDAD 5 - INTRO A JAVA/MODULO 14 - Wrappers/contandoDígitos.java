/*
 * ✏️  Actividad: Contando los dígitos en un número
Pídele al usuario que introduzca un número. Convierte el 
número en una cadena y luego utiliza un bucle y Character.isDigit() 
para contar el número de dígitos en el número.
 */

import java.util.Scanner;

public class contandoDígitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Intruduzca una cadena de numeros");
            
            String cadena = scanner.nextLine();
            int contador = 0;

            for (int i = 0; i < cadena.length(); i++) {
                if (Character.isDigit(cadena.charAt(i))) {
                    contador++;
                }

            }
            System.out.println("La cantidad de digitos es: " + contador);

        } catch (Exception e) {
            System.out.println("Ingresar un numero valido");
        }

        scanner.close();

    }

}
