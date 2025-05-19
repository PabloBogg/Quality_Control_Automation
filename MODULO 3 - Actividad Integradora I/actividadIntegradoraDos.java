//package INTEGRADOR;
import java.util.Scanner;


public class actividadIntegradoraDos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);


        // Solicitar al usuario que ingrese dos números
        System.out.print("Por favor, ingrese el primer número: ");
        double numero1 = scanner.nextDouble();


        System.out.print("Por favor, ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();


        // Mostrar el menú de opciones para elegir la operación
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Elija una opción (1-4): ");
        int opcion = scanner.nextInt();


        // Declarar una variable para almacenar el resultado
        double resultado = 0;


        // Realizar la operación según la opción seleccionada
        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 4.");
        }


        // Cerrar el scanner
        scanner.close();
    }
}
