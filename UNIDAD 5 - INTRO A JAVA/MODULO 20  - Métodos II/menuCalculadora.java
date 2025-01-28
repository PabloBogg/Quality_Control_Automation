//Segundo ejercicio:

import java.util.Scanner;

public class menuCalculadora {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n======= MENU CALCULADORA =======");
            System.out.println("Por favor seleccione una de las siguientes opciones: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();

            if(opcion == 5){
                salir = true;
                System.out.println("\nSaliendo del programa...");
                continue;
            }

            if (opcion >= 1 && opcion <= 5){

            System.out.println("Ingrese el primer numero: ");
            double num1 = sc.nextDouble();
            System.out.println("Ingrese el segundo numero: ");
            double num2 = sc.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("ERROR: No se puede dividir por CERO.");
                    }
                    break;
                default:
                    break;

            }
        } else {
            System.out.println("\nOpcion invalida, por favor intente nuevamente:");
        }
            
        }
        sc.close();
    }
}

