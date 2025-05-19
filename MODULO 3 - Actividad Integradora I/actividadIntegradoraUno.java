import java.util.Scanner;

public class actividadIntegradoraUno {
public static void main(String[] args) {

Scanner miScanner = new Scanner(System.in);

System.out.println("Gordo, dígame un número");
int numb1 = miScanner.nextInt();

String parOimpar = (numb1 % 2 == 0) ? "El número es par" :
"Es impar";

System.out.println(parOimpar);

miScanner.close();

}
}