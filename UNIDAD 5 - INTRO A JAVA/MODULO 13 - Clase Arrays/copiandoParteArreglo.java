/*
 * ✏️  Actividad: Copiando parte de un arreglo. 
Crea un programa en Java que declare y muestre un arreglo de enteros 
junto con sus índices. Luego, solicita al usuario dos índices: un 
índice inicial y un índice final. Con estos dos índices, copia la 
parte del arreglo original comprendida entre ellos (inclusive) en 
un nuevo arreglo utilizando el método Arrays.copyOfRange(). Asegúrate 
de incluir validaciones para confirmar que el índice inicial es menor 
que el índice final y que ambos índices están dentro del rango válido 
del arreglo original. Finalmente, imprime el nuevo arreglo por consola.
 */

import java.util.Arrays;
import java.util.Scanner;

public class copiandoParteArreglo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [] array={10, 50, 49, 87, 95, 100};

        for (int i=0;i<array.length;i++){
            
            System.out.println("Indice: "+ i+" - Valor: "+array[i]);

        }
        int indiceInicial;
        int indiceFinal;
        do{
            System.out.println("Ingresar Indice Inicial: ");
            indiceInicial=sc.nextInt();
        } while(indiceInicial<0 || indiceInicial>array.length);
        
        do{
            System.out.println("Ingresar Indice Final: ");
            indiceFinal=sc.nextInt();
        }while(indiceFinal<indiceInicial || indiceFinal>array.length);

        int [] nuevoArray=Arrays.copyOfRange(array, indiceInicial,(indiceFinal+1));

        System.out.println("Original: "+Arrays.toString(array));
        System.out.println("Nuevo array: "+Arrays.toString(nuevoArray));


        sc.close();



    }
}
