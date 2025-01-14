/*
 * Calcular suma acumulada:

Escribe un programa que recorra un array de enteros y  
calcule la suma acumulada de los elementos, reemplazando 
cada elemento por la suma acumulada hasta ese punto.
El tamaño y los números  a contener pueden ser de tu elección.
 */

public class complementario2 {
    public static void main(String[] args) {
        int[] enteros = {1,2,3,4,5,6};
        // 21
        int suma = 0;
        for (int i = 0; i < enteros.length; i++) {
            
            System.out.println(enteros[i]);
            suma = suma + enteros[i];
            enteros[i] = suma;
            System.out.println("----------");
            
            System.out.println(enteros[i]);
    }
        
    
}
}

