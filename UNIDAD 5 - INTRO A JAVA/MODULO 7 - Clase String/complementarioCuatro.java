/* 4. Calculando la Longitud de Cadenas sin Espacios:

En esta actividad, se solicita al usuario ingresar una cadena de texto
 y calcular su longitud, pero esta vez sin contar los espacios en blanco.
  Para lograr esto, se utilizará el método length() de la clase String y 
  se realizará un proceso adicional para excluir los espacios de la cuenta. */

import java.util.Scanner;

public class complementarioCuatro {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Ingresar frase: ");
    String frase=sc.nextLine();
    String fraseSinEspacios=frase.replace(" ", "");
    System.out.println("La cadena sin espacios es: "+ fraseSinEspacios);
    System.out.println("La cadena sin espacios tiene: "+ fraseSinEspacios.length()+ " caracteres.");
    sc.close();
    
  }

        



    }

