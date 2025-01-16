/*
 * ✏️  Actividad: Contando los espacios en blanco en una cadena
Pídele al usuario que introduzca una cadena. Crea un bucle que 
recorra cada carácter en la cadena y utiliza Character.isWhitespace() 
para contar el número de espacios en blanco en la cadena. 
Muestra el recuento al usuario.
 */

import java.util.Scanner;

public class contandoEspaciosBlancoCadena {
    public static void main(String[] args) {
        System.out.println("Intruduzca una cadena");
        Scanner scanner = new Scanner(System.in);

        String cadena = scanner.nextLine();
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isWhitespace(cadena.charAt(i))) {
                contador++;
            }

        }
        System.out.println("La cantidad de espacios en blanco es: " + contador);
        scanner.close();
    }
}
