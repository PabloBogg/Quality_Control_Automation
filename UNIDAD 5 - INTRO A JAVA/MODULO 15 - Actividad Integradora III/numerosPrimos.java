/*
 * ✏️  Actividad: Números primos
Escribe un programa que solicite al usuario que introduzca un número y 
verifique si es un número primo utilizando un bucle do-while. Si el número 
no es primo, pedir al usuario que introduzca otro número hasta que 
introduzca un número primo. Finalizar el programa cuando ingrese 0 (cero).

Un número es primo si solo tiene dos divisores: 1 y él mismo.
 */

import java.util.Scanner;

public class numerosPrimos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        boolean esPrimo=false;
        

        do {
            do {
                System.out.println("Ingresar numero entero:");
                num=sc.nextInt();
            } while (num<=1 && num!=0 );

            //Comprobar si es primo
            if (num==2) {
                esPrimo=true;
            } else if (num!=0){
                for(int i=2;i<num;i++){
                    if (num%i==0) {
                        esPrimo=false;
                        i=num;
                    }else{
                        esPrimo=true;
                    }
                }
            }

            if (esPrimo && num!=0) {
                System.out.println("El numero "+num+" SI es primo.");
            } else if (!esPrimo && num!=0){
                System.out.println("El numero "+num+" NO es primo.");
            }
        

        } while (num!=0);
        System.out.println("Ingreso CERO: FIN!");
        sc.close();
    }
}
