/*
 * ✏️  Actividad:Fibonacci
Escribe un programa que imprima los primeros 8 términos de la serie de 
Fibonacci utilizando un bucle while. La serie de Fibonacci es una secuencia 
en la que cada número es la suma de los dos anteriores.

La serie de Fibonacci comienza de la siguiente manera:

Posición 0: 0

Posición 1: 1

Posición 2: 1 (la suma de la posición 0 y la posición 1, 0 + 1 = 1)

Posición 3: 2 (la suma de la posición 1 y la posición 2, 1 + 1 = 2)

Posición 4: 3 (la suma de la posición 2 y la posición 3, 1 + 2 = 3)

Entonces, los primeros 5 términos (considerando el índice inicial 0) 
de la serie de Fibonacci son: 0, 1, 1, 2, 3.
 */
public class fibonacci {
    public static void main(String[] args) {
        int contador=2;
        int resultado=0;
        int aux_1=0;
        int aux_2=1;

        System.out.println("Posicion 0: "+aux_1); 
        System.out.println("Posicion 1: "+aux_2);

        while(contador<=8){
            resultado=aux_1+aux_2;
            aux_1=aux_2;
            aux_2=resultado;
            System.out.println("Posicion "+ contador+": "+resultado);
            contador++;
        }
    }
    
}
