/*
 * ✏️  Actividad: Práctica Inicial
A continuación, utilizaremos los ejercicios que ya has resuelto anteriormente como base, 
pero esta vez vas a aplicar el uso de métodos en su resolución. 

Imprimir nombre:  Crea un método llamado imprimeNombre() que reciba por parámetro un 
nombre y luego imprima el mensaje "Mi nombre es [nombre]". Invocar dicho método desde el método main para ver el mensaje por consola

Imprimir nombre y edad: Crea el método imprimeNombreYEdad(String nombre, int edad) 
que reciba dos parámetros, el nombre y la edad, y luego imprima el mensaje "Me llamo [nombre] y tengo [edad] años".

public static void main(String[] args) {
    Scanner pepe = new Scanner(System.in);
    System.out.println("Por favor ingrese un nombre:");
    String nombre = pepe.nextLine();
    System.out.println("Por favor ingrese una edad:");
    int edad = pepe.nextInt();
    imprimirNombreYEdad(nombre, edad);
}
 */

import java.util.Scanner;

public class actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el nombre: ");
        String nombre = sc.nextLine();
        //imprimeNombre(nombre);
        System.out.println("Ingresar la edad: ");
        int edad = sc.nextInt();
        imprimeNombreYEdad(nombre, edad);


        sc.close();

    }

    public static void imprimeNombre(String parametroNombre) {
        System.out.println("Mi nombre es " + parametroNombre);
    }

    public static void imprimeNombreYEdad(String parametroNombre, int parametroEdad){
        System.out.println("Me llamo "+parametroNombre+ " y tengo " +parametroEdad+" años");
    }

}