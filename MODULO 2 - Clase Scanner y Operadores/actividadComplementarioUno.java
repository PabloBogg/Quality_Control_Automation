/* 1. Verificación de Edad
Pide al usuario que ingrese su año de nacimiento y almacena el dato en una variable previamente declarada llamada añoNacimiento.
Declara una variable del tipo Constante llamado ANIOACTUAL con el año actual.
Calcula la edad actual del usuario, considerando que la cuenta sería ANIOACTUAL - añoNacimiento. Almacena 
el dato en una variable llamada calculoEdad.
Determina si el usuario es mayor de edad (tener 18 años o más) y muestra un mensaje apropiado.
💡Al declarar la variable del tipo constante, recuerda las convenciones recomendadas para hacerlo. */

import java.time.Year;
import java.util.Scanner;

public class actividadComplementarioUno {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingresar el anio de nacimiento: ");
        int anioNacimiento=teclado.nextInt();
        int ANIOACTUAL=Year.now().getValue();
        int calculoEdad=ANIOACTUAL-anioNacimiento;
        String resultado=calculoEdad>=18 ? "si" : "no";
        System.out.println("El usuario tiene "+calculoEdad+" anios, "+resultado+" es mayor de edad.");
        teclado.close();
    }
}
