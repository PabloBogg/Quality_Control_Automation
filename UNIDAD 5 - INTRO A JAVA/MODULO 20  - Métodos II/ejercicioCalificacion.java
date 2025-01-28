/*
 * 3. Ejercicio de calificación: Basándote en el siguiente ejercicio que ya 
 * has realizado, crea un método "obtenerNota()" que reciba por parámetro 
 * un "int" y devuelva un "String". El método debe utilizar la estructura 
 * de control "switch expression".

Ejercicio anterior: En este ejercicio de calificación, tu tarea es escribir 
un programa que solicite al usuario ingresar un número entre 0 y 100. Luego, 
el programa validará el número ingresado y mostrará la calificación correspondiente 
según la siguiente escala:

- Si la puntuación está entre 90 y 100, se mostrará "A".

- Si la puntuación está entre 80 y 89, se mostrará "B".

- Si la puntuación está entre 70 y 79, se mostrará "C".

- Si la puntuación está entre 60 y 69, se mostrará "D".

- Si la puntuación es menor a 60, se mostrará "F".

El programa mostrará en la consola el valor de la calificación obtenida.
 */

import java.util.Scanner;

public class ejercicioCalificacion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingresar nota: ");
        int nota =sc.nextInt();

        System.out.println("La nota es: "+obtenerNota(nota));

        sc.close();


    }

    public static String obtenerNota(int nota){
        return switch(nota/10){
            case 10,9->"A";
            case 8->"B";
            case 7->"C";
            case 6->"D"; 
            default ->"F";
        };
    }
    
}
