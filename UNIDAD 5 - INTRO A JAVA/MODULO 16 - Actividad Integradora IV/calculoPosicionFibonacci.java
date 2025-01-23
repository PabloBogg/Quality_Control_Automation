import java.util.Scanner;
// Actividad:  Serie Fibonacci mejorada
// En esta actividad, te propongo un desafío adicional relacionado con la serie de Fibonacci.
// La tarea consiste en crear un programa que te permita ingresar la posición de un número en 
//la serie de Fibonacci y, a continuación, mostrar el valor correspondiente a esa posición.
// Recuerda que la serie de Fibonacci comienza con valores específicos para las primeras posiciones:
// Posición 0: 0
// Posición 1: 1
// Posición 2: 1
// Posición 3: 2
// Posición 4: 3
// Tu objetivo es desarrollar un programa que sea capaz de calcular y mostrar el valor de la 
// serie de Fibonacci para cualquier posición ingresada por el usuario. Este ejercicio te 
// ayudará a consolidar tu comprensión sobre cómo generar y trabajar con la serie de Fibonacci.
//  ¡Anímate a enfrentar este reto y sigue profundizando en tus habilidades de programación!

public class calculoPosicionFibonacci {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una posición");
        int posicion = leer.nextInt();
        if(posicion > 1){
        int [] arreglo = new int [posicion+1];
        arreglo[0] = 0;
        arreglo[1] = 1;
        
        for(int i=2; i<=posicion; i++){
            arreglo[i] = arreglo[i-1] + arreglo[i-2];

        }
        System.out.println("Posicion:" + posicion + "; Valor:"+arreglo[posicion]);
    }
       
        else if(posicion == 0){
            System.out.println("Posicion:" + posicion + "; Valor: 0");
        }
        else if(posicion ==1){
            System.out.println("Posicion:" + posicion + "; Valor: 1");
        }
        leer.close();
    }
  		
}