/*
 * ✏️  Actividad:  Número de dígitos
Escribe un programa que te pida que ingreses un número entero y 
utilice un bucle while para calcular la cantidad de dígitos de ese número. 
Por ejemplo, el número 4578 tiene 4 dígitos. El programa debe tener en 
cuenta que el 0 tiene una cifra y también contar las cifras de números negativos.
 */

import java.util.Scanner;

public class numeroDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero: ");
        int numIngresado = sc.nextInt();
        int contador = 0;
        int aux = numIngresado;

        if (numIngresado == 0) {
            contador = 1;
        } else {
            if(numIngresado<0){
                numIngresado=-numIngresado;
            }
            while (numIngresado > 0) {
                numIngresado = numIngresado / 10;
                contador++;
            }
        }

        sc.close();
        System.out.println("El numero " + aux + " tiene " + contador + " cifras");
    }

}
