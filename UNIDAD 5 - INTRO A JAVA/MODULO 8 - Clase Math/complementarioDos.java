/* 2. Generación aleatoria y análisis de raíz cuadrada

Escribe un programa que cumpla con las siguientes condiciones:
1- Pide al usuario que ingrese un número entre 1 y 30. Este número será almacenado en una variable
llamada numeroLimite .

2- Utiliza la clase Math para generar un número aleatorio entre 1 y el 
numeroLimite recibido del usuario.

3- Utiliza el método Math.sqrt() para calcular la raíz cuadrada del número 
aleatorio generado y muéstralo en pantalla.

4- Analiza si el número aleatorio generado es primo y muestra un mensaje en pantalla
indicando si lo es o no.

Finalmente, muestra el número aleatorio generado y su raíz cuadrada en pantalla. */

import java.util.Scanner;

public class complementarioDos {
    public static void main(String[] args) {
        //1
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar un numero entre 1 y 30: ");
        int numeroLimite=sc.nextInt();
        do {
            System.out.println("Ingresar un numero valido entre 1 y 30: ");
            numeroLimite=sc.nextInt();
        } while (numeroLimite>30 || numeroLimite<1);
        //2
        int numeroAleatorio= (int) (Math.random()*numeroLimite+1);

        //int numero = (int) (Math.random() * (limSup - limInf) + limInf);

        //3
        double numeroRaiz= Math.sqrt(numeroAleatorio);

        //4
        if (numeroAleatorio%numeroAleatorio==0 ){

        }
    }
}
