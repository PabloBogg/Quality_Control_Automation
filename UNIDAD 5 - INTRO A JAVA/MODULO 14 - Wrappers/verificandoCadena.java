/*
 * ✏️  Actividad: Verificando si una cadena representa un número válido
Pídele al usuario que introduzca una cadena. Intenta convertir la cadena 
a un número decimal usando Double.valueOf(). Si la cadena no representa 
un número válido, Double.valueOf() lanzará una excepción. Captura esta 
excepción y muestra un mensaje al usuario indicando que la entrada 
no es un número válido.
 */
import java.util.Scanner;

public class verificandoCadena {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try {
            System.out.println("Ingresar cadena: ");
        Double cadena =Double.valueOf(sc.nextLine());
        System.out.println(cadena);
        } catch (Exception e) {
            System.out.println("Error en el ingreso de la cadena");
        }
        
        sc.close();
    }
    
}
