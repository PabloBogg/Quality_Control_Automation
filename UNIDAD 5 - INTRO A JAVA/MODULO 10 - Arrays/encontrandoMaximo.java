/*
 ✏️  Actividad: Encontrando el máximo
Escribe un programa en el cual se cree una variable de tipo array
que contenga cinco elementos de tipo entero, ingresados por el 
usuario. El programa debe buscar el máximo e imprimir por consola 
el resultado utilizando solamente las herramientas adquiridas 
hasta el momento. 
 */

 import java.util.Scanner;

 public class encontrandoMaximo {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         //Definicion del array
         int[] array= new int[5];
 
         // Ingreso de valores por teclado
         System.out.println("Ingresar el 1° valor: ");
         array[0]=sc.nextInt();
         System.out.println("Ingresar el 2° valor: ");
         array[1]=sc.nextInt();
         System.out.println("Ingresar el 3° valor: ");
         array[2]=sc.nextInt();
         System.out.println("Ingresar el 4° valor: ");
         array[3]=sc.nextInt();
         System.out.println("Ingresar el 5° valor: ");
         array[4]=sc.nextInt();
 
         // Calculo del maximo
         int numMaximo=array[0];
         if (array[0]<array[1]){
            numMaximo=array[1];
         }
         else if (array[0]<array[2]){
            numMaximo=array[2];
         }
         else if (array[0]<array[3]){
            numMaximo=array[3];
         }
         else if (array[0]<array[4]){
            numMaximo=array[4];
         }
 
         // Mostrar resultados por pantalla
         System.out.println("Array: [" + array[0]+", "+ array[1]+", "+ array[2]+", "+ array[3]+"]");
         System.out.println("El valor maximo del array es: " + numMaximo);
         
              sc.close();
     }
 }
