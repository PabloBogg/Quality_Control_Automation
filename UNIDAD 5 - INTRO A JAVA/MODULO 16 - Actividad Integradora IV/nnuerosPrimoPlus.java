/*
 *  1. Números primos plus

Siguiendo el ejemplo del ejercicio de “números primos”, ahora el desafío 
es que desarrolles un programa que te solicite la cantidad deseada de 
números primos que deseas obtener.

Tu programa deberá generar y mostrar la cantidad de números primos que hayas solicitado.
 */
import java.util.Arrays;
import java.util.Scanner;

public class nnuerosPrimoPlus {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar cantidad de numeros primos: ");

        int cantidad=sc.nextInt();
        int [] array= new int[cantidad];
        array[0]=2;
        int indice=1;
        boolean esPrimo=false;
            for(int j=3;array[cantidad-1]==0;j++){
                for (int i=0;array[i]!=0;i++){
                    if (j%array[i]==0) {
                        esPrimo=false;
                        break;
                    }else{
                        esPrimo=true;
                    }
                }
                if (esPrimo) {
                    array[indice]=j;
                    indice++;
                }
            
            } 
    System.out.println(Arrays.toString(array));
    sc.close();
    
}
}
