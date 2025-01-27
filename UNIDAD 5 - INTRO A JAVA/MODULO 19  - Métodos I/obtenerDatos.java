/*Actividad: ¡Manos a la obra!
1. Obtener datos: Perfeccionando la actividad de “imprimir datos”, no solo crea el método imprimeNombreYEdad(String nombre, int edad)
*  que reciba dos parámetros, el nombre y la edad, sino a su vez, crea dos métodos para obtener el nombre y la edad, respectivamente.
*  Ambos métodos deben recibir por parámetro un objeto de tipo "Scanner".
* */

import java.util.Scanner;

public class obtenerDatos {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String nombre = obtenerNombre(sc);
            int edad = obtenerEdad(sc);
            imprimeNombreYEdad(nombre,edad);
            sc.close();
        }

    public static String obtenerNombre(Scanner sc) {
        System.out.println("Por favor ingresar un nombre");
        String nombre = sc.nextLine();
        return nombre;
    }
    public static int obtenerEdad(Scanner sc) {
        System.out.println("Por favor ingresar Edad");
        int  edad = sc.nextInt();
        return edad;
    }
        public static void imprimirNombre(String parametroNombre) {
            System.out.println("Mi nombre es " + parametroNombre);
        }
        public static void imprimeNombreYEdad(String parametroNombre, int parametroEdad){
            System.out.println("Me llamo "+parametroNombre+ " y tengo " +parametroEdad+" años");
        }
    }

