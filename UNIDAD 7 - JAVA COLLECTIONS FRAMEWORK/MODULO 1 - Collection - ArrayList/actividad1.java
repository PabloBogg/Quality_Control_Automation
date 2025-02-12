import java.util.ArrayList;//136
import java.util.Scanner;

/*
 * ✏️ Actividad: Creación de una lista con nombres de ciudades
Objetivo: Practicar el uso de ArrayList en Java para almacenar y manipular datos dinámicos, permitiendo al usuario 
ingresar nombres de ciudades y luego mostrar la lista completa de ciudades ingresadas.



Instrucciones

Inicializa un ArrayList: Crea un ArrayList de tipo String para almacenar los nombres de las ciudades ingresadas por 
el usuario. Esto se puede hacer de la siguiente manera: ArrayList<String> ciudades = new ArrayList<>();

Solicita la entrada del usuario: Implementa un bucle (puede ser while o for) que pida al usuario ingresar el nombre 
de una ciudad. En cada iteración, pregunta si el usuario desea agregar más ciudades. Si la respuesta es sí, agrega el 
nombre de la ciudad al ArrayList utilizando el método add. Por ejemplo: ciudades.add(nombreCiudad);

Finaliza la entrada de datos: El bucle debe continuar hasta que el usuario indique que no desea agregar más ciudades. 
Por ejemplo, podrías usar un mensaje como "¿Deseas agregar otra ciudad? (sí/no)" para decidir si continuar.

Mostrar la lista de ciudades: Una vez que el usuario decida no agregar más ciudades, muestra por consola la lista 
completa de ciudades almacenadas en el ArrayList.
 */
public class actividad1 {
    public static void main(String[] args) {

        // Definicion LISTA
        ArrayList<String> ciudades = new ArrayList<>();

        // Ingreso de datos a la LISTA
        Scanner sc = new Scanner(System.in);
        String condition = "si";

        do {
            System.out.println("Ingresar la ciudad nuemero " + (ciudades.size() + 1) + ": ");
            ciudades.add(sc.nextLine());

            System.out.println("Desea agregar alguna ciudad mas? si - no: ");
            condition = sc.nextLine();
            condition = condition.toLowerCase();

        } while (condition.equals("si"));

        // Mostrar LISTA
        for (String string : ciudades) {
            System.out.println(string);
            System.out.println();
        }
        sc.close();

    }

}
