//escribir un programa que solicite al usuario un número y determine si es positivo, negativo o cero. El resultado se mostrará en pantalla.
import java.util.Scanner;
public class actividadClasificaciónDeNúmeros {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Por favor, ingrese un número");
double num= sc.nextDouble();
if (num>0) {System.out.println("El número " + num + " es positivo");
}
else if (num<0) {System.out.println("El número " + num + " es negativo");
}
else {System.out.println("El número " + num + " es cero");}
sc.close();
}
}



