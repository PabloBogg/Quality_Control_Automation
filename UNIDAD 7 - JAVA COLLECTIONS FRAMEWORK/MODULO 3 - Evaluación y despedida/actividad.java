/*
 * ✏️  Actividad: Uso de ArrayList 
Objetivo: Desarrollar una aplicación en Java que permita gestionar códigos postales y ciudades utilizando únicamente ArrayList, incorporando validaciones para evitar la duplicación de datos.


Instrucciones:

Almacenar códigos postales y ciudades en listas separadas:

Usa un ArrayList<Integer> para almacenar los códigos postales.

Usa un ArrayList<String> para almacenar las ciudades correspondientes.

Asegúrate de que el índice de un código postal en la primera lista coincida con el índice de su ciudad en la segunda lista.


Solicitar datos al usuario:

Pide al usuario que ingrese 10 pares de códigos postales y ciudades.

Antes de agregar un nuevo código postal, valida que no exista en el ArrayList de códigos postales.


Muestra los datos ingresados:

Recorre ambos ArrayList para mostrar los códigos postales y las ciudades asociadas.


Buscar una ciudad por su código postal:

Solicita al usuario un código postal, busca su índice en el ArrayList de códigos postales y muestra la ciudad correspondiente.


Modificar y eliminar datos:

Permite al usuario agregar una nueva ciudad con su código postal correspondiente.

Solicita al usuario que elimine 3 ciudades existentes, asegurándote de que el código postal ingresado exista antes de eliminarlo.

Validaciones adicionales:

Implementa un método para normalizar los nombres de las ciudades (por ejemplo, eliminando espacios adicionales
 y ajustando el formato de mayúsculas/minúsculas).

Asegúrate de que los códigos postales sean números positivos y no estén duplicados.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class actividad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // códigos postales.
        ArrayList<Integer> codigosPostales = new ArrayList<>();
        // ciudades correspondientes.
        ArrayList<String> ciudades = new ArrayList<>();

        // Solicitar datos al usuario:
        // Pide al usuario que ingrese 10 pares de códigos postales y ciudades.
        // Antes de agregar un nuevo código postal, valida que no exista en el ArrayList
        // de códigos postales.
        System.out.println("--Ingresar Datos--");
        Integer codigoPostalIngresado;
        String ciudadIngresada;
        for (int i = 0; i < 2; i++) {

            System.out.println("Ingrasar Codigo Postal N°" + (i+1) + ": ");
            codigoPostalIngresado = sc.nextInt();
            sc.nextLine();

            if (!validarIngreso(codigoPostalIngresado, codigosPostales)) {
                codigosPostales.add(codigoPostalIngresado);
                System.out.println("Ingresado correctamente");
            } else {
                System.out.println("El Codigo ya existe en el ArrayList");
            }

            System.out.println("Ingrasar Ciudad N°" + (i+1) + ": ");
            ciudadIngresada = sc.nextLine();
            ciudadIngresada=normalizarCiudades(ciudadIngresada);
            ciudades.add(ciudadIngresada);
            sc.nextLine();

        }

        // Muestra los datos ingresados:
        // Recorre ambos ArrayList para mostrar los códigos postales y las ciudades
        // asociadas.
        System.out.println("--Mostrar Datos--");
        for (int i = 0; i < codigosPostales.size(); i++) {
            System.out.println(
                    "INDICE " + i + " --> Ciudad: " + ciudades.get(i) + " | Codigo postal: " + codigosPostales.get(i));

        }

        // Buscar una ciudad por su código postal:
        // Solicita al usuario un código postal, busca su índice en el ArrayList de
        // códigos postales y muestra la ciudad correspondiente.
        System.out.println("--Buscar Ciudad por Codigo Postal--");
        System.out.println("Ingresar Codigo Postal: ");
        Integer codigoPostalABuscar = sc.nextInt();
        Integer indice = codigosPostales.indexOf(codigoPostalABuscar);
        System.out.println("El Codgo Postal " + codigoPostalABuscar + " corresponde a: " + ciudades.get(indice));

        // Modificar y eliminar datos:
        // Permite al usuario agregar una nueva ciudad con su código postal
        // correspondiente.
        // Solicita al usuario que elimine 3 ciudades existentes, asegurándote de que el
        // código postal ingresado exista antes de eliminarlo.
        System.out.println("--Modificar y Eliminar Datos--");
        System.out.println("Ingresar nueva Ciudad: ");
        ciudadIngresada = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingresar nuevo Codigo Postal: ");
        codigoPostalIngresado = sc.nextInt();
        sc.nextLine();

        if (validarIngreso(codigoPostalIngresado, codigosPostales)) {
            codigosPostales.add(codigoPostalIngresado);
            System.out.println("Ingresado correctamente");
        } else {
            System.out.println("El Codigo ya existe en el ArrayList");
        }

        ciudades.add(normalizarCiudades(ciudadIngresada));

        System.out.println("--Eliminar Datos--");
        for (int i = 0; i < 3; i++) {

            System.out.println("Ingrasar Codigo Postal N°" + i + " a eliminar: ");
            codigoPostalIngresado = sc.nextInt();

            if (validarIngreso(codigoPostalIngresado, codigosPostales)) {
                codigosPostales.remove(codigoPostalIngresado);
                System.out.println("Eliminado correctamente");
            } else {
                System.out.println("El Codigo no existe en el ArrayList");
            }

        }

        sc.close();
    }

    public static boolean validarIngreso(Integer codigoPostalIngresado, ArrayList codigoPostal) {
        return codigoPostal.contains(codigoPostalIngresado);
    }

    public static String normalizarCiudades(String ciudad) {
        return ciudad.toLowerCase();
    }

    
}