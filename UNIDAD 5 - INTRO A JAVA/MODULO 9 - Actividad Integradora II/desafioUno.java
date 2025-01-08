/* ✏️  Actividad: Conversión de unidades de temperatura
Escribe un programa que cumpla con las siguientes condiciones:

1. Solicita al usuario ingresar una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F).

2. Convierte la temperatura a la otra unidad de medida y muestra el resultado en pantalla. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class desafioUno {

private static Scanner miScanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        ejercicio01();

        miScanner.close();
    }

    public static void ejercicio01() {

     try {
        
    

        System.out.println("Precioso, ingrese un temperatura: ");
        double temp = miScanner.nextDouble();

        System.out.println("Hobbit! Presione:\n1. Celsius\n2. Fahrenheit");
        int tempOpt = miScanner.nextInt();

    switch (tempOpt) {
        case 1:
            double resultadoF = (temp * 9 / 5) + 32;
            System.out.println("Mortal, la temperatura en Fahrenheit es " + resultadoF);
            break;

        case 2:
            double resultadoC = (temp - 32) * 5 / 9;
            System.out.println("Mortal, la temperatura en Celsius es " + resultadoC);
        break;

        default:
            System.out.println("HORRIBLE HOBBIT! NO SE PUEDE! 111111 o 2222222");
            break;
            
    }
} catch (InputMismatchException e) {
    System.out.println("NOOOOOOOOOOOOOOOOOOOOOOOOOOOOO, NO es válido!");
    
 }
   }      
}
