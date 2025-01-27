import java.util.Scanner;

public class complementario1 {

   

    public static void main(String[] args) {
        
        // 1. Tabla de multiplicar

        // En esta actividad, vas a crear un programa que solicita al usuario que ingrese un 
        // número (incluida la lógica en un método llamado pedirNumero())  y luego imprime la
        //  tabla de multiplicar de ese número del 1 al 10 (incluida la lógica en un método 
        //  llamado imprimirTablaMultiplicar()). Para ello, implementarás un método que reciba
        //   el número ingresado por el usuario y que imprima la tabla de multiplicar 
        //   correspondiente.
        Scanner sc = new Scanner(System.in);
        int numero = pedirNumero(sc);
        imprimirTablaMultiplicar(numero);
        sc.close();

    }

    public static int pedirNumero(Scanner leer){
        System.out.println("Por favor ingrese un número: ");
         int numero = leer.nextInt();
         return numero;
    }

    public static void imprimirTablaMultiplicar(int num){
        for(int i=1; i<=10; i++){
            System.out.println(num + " * " + i + " = "+ (num*i));
        }

    }


}