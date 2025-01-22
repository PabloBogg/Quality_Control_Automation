import java.util.Arrays;
import java.util.Scanner;

public class nnuerosPrimoPlus {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar cantidad de numeros primos: ");

        int cantidad=sc.nextInt();
        int [] array= new int[cantidad];
        array[0]=2;

        boolean esPrimo=false;
        int indice=1;
        int numero=2;

        do{
            for(int j:array){
                if (numero%j==0) {
                    esPrimo=false;
                }else{
                    esPrimo=true;
                }
                numero++;
            
            } 
            if (esPrimo){
                array[indice]=numero;
                indice++;   
            }


    }while(array.length<cantidad);
    
    System.out.println(Arrays.toString(array));
    sc.close();
    
}
}
