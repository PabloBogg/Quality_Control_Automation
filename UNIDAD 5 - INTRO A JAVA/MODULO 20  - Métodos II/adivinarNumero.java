/*
 * Adivinar el número: Basándose en el ejercicio que ya has realizado, 
 * crea un método "numeroAleatorio()" que reciba por parámetro dos variables 
 * de tipo "int": un número máximo y un número mínimo. El método debe generar 
 * y devolver un número aleatorio dentro del rango especificado.

Ejercicio anterior: “Adivinando un número” Escribe un programa que genere un 
número aleatorio entre 1 y 20, y muestra por consola un mensaje pidiéndote que 
adivines ese número utilizando un bucle do-while. El programa te indicará si el 
número que ingresas es mayor o menor que el número aleatorio, y seguirá pidiéndote 
que adivines hasta que lo hagas correctamente.
 */

import java.util.Random;
import java.util.Scanner;

public class adivinarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMinimo = 1;
        int numMaximo = 20;
        int numUsuario;
        int numAleatorio = numeroAleatorioMetodo(numMinimo, numMaximo);
        
        do {
            System.out.println("Ingresar numero para adivinar: ");
            numUsuario = sc.nextInt();
            if (numUsuario > numAleatorio) {
                System.out.println("Ingresaste un numero MAYOR");
            } else if (numAleatorio < numAleatorio) {
                System.out.println("Ingresaste un numero MENOR");
            }
                
            
        } while (numUsuario != numAleatorio);
        System.out.println("Adivinaste!");
        sc.close();
    }

    public static int numeroAleatorioMetodo(int numMin, int numMax) {
        Random rand = new Random();
        return rand.nextInt(numMin, numMax);
    }

}
