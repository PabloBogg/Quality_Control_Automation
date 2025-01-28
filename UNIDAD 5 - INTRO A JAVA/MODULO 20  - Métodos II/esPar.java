//Primer ejercicio:

import java.util.Scanner;

public class esPar {
    public static void main(String[] args) {
        int numero = solicitarNumero();

        if(esPar(numero)){
            System.out.println("El " + numero + " Elegido es PAR");
        } else {
            System.out.println("El " + numero + " Elegido es IMPAR");
        }
    }

    public static int solicitarNumero(){
        Scanner sc = new Scanner(System.in);
        Integer numero = null;

        System.out.println("Por favor ingrese un numero: ");
        do{
            try {
                numero = sc.nextInt();
            } catch (Exception e) {
                // TODO: handle exception
                sc.nextLine();
                System.out.println("No ingreso un numero correcto, vuelva a intentar: ");
            }
        } while (numero==null);

        return numero;

    }    


    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }

}