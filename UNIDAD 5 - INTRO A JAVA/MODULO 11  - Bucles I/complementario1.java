/*
 * Invertir un array

Escribe un programa que recorra un array de enteros y lo invierta
, es decir, que el primer elemento se convierta en el último y 
viceversa, luego imprime el array resultante por consola.  
El tamaño y los números  a contener pueden ser de tu elección.

IMPORTANTE: Debes invertir de forma permanente el orden de 
los elementos. Analiza si necesitas hacer uso de elementos 
auxiliares para concluir el ejercicio.
 */

public class complementario1 {
    public static void main(String[] args) {
        
  
            int[] numberArray = { 1, 2, 3, 4, 5 };
    
            int[] numberArrayInverso = new int[numberArray.length];
    
            for(int i=0; i<numberArray.length; i++ ){
                numberArrayInverso[i] = numberArray[numberArray.length - i - 1 ];
            }
    
            numberArray = numberArrayInverso;
    
            for(int i=0; i<numberArray.length; i++ ){
                System.err.println(numberArray[i]);
            
    }
}
}
