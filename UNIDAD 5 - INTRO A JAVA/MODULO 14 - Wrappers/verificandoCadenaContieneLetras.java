/*
 * ✏️  Actividad: Verificando si una cadena contiene solo letras
Pide al usuario que introduzca una cadena. Crea un bucle que recorra
cada carácter en la cadena y utiliza Character.isLetter() para 
verificar si todos los caracteres son letras. Muestra un mensaje 
al usuario indicando si la cadena contiene solo letras o no.
 */
import java.util.Scanner;

    public class verificandoCadenaContieneLetras {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Por favor, introduce una cadena:");
            String input = scanner.nextLine();
    
            boolean allLetters = true;
    
            // Recorrer cada carácter de la cadena
            for (int i = 0; i < input.length(); i++) {
                if (!Character.isLetter(input.charAt(i))) {
                    allLetters = false;
                    break; // Salir del bucle si encuentra un carácter no válido
                }
            }
    
            // Mostrar el resultado al usuario
            if (allLetters) {
                System.out.println("La cadena contiene solo letras.");
            } else {
                System.out.println("La cadena contiene caracteres que no son letras.");
            }
    
            scanner.close();
        }
    }
