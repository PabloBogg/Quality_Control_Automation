import java.util.Arrays;
import java.util.Scanner;

public class complementario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam;
        int ultimoIndice=-1;
        do{ 
            System.out.println("Ingresa el tamaño del arreglo: (Debe ser mayor a 0) ");
            tam = sc.nextInt();
        }while(tam <= 0);

        int[] arr = new int[tam];

        while(ultimoIndice < tam -1){

        System.out.println("Ingrese el VALOR con el que desea rellenar:");
        int valor = sc.nextInt();

        System.out.println("Ingrese el INDICE hasta donde desea rellenar:");
        int indice = sc.nextInt();

        if (indice <= ultimoIndice || indice >= tam){
            System.out.println("Indice Invalido, debe ser mayor que " + ultimoIndice + " y menor que "+ tam);
            continue;
        }

        Arrays.fill(arr, ultimoIndice + 1, indice + 1, valor);
        ultimoIndice = indice;
        }

        System.out.println("Arreglo final: " + Arrays.toString(arr));
        sc.close();
    }
}
