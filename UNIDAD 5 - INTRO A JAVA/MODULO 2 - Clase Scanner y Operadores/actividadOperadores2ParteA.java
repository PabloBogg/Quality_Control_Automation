//2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes validaciones:
//A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
//B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.

import java.util.Scanner;

public class actividadOperadores2ParteA {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
System.out.print("Ingrese numero a: ");
int a = teclado.nextInt();
System.out.print("Ingrese numero b: ");
int b = teclado.nextInt();
System.out.print("Ingrese numero c: ");
int c = teclado.nextInt();
System.out.print("Ingrese numero d: ");
int d = teclado.nextInt();


System.out.println("El numero " + a + " es mayor que "+b+" 'y' el numero "+c+" es mayor que "+d+": "+ (a>b && c>d));
System.out.println("El numero " + a + " es mayor que "+b+" 'o' el numero "+c+" es mayor que "+d+": "+ (a>b || c>d));

teclado.close();

    }
    
}
