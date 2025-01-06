/*Actividad: Ejercicio de Días de la Semana
En esta actividad, escribirás un programa que solicite
al usuario ingresar un número del 1 al 7 que representará un día de la semana.
Luego, el programa mostrará en pantalla el nombre correspondiente a ese día.
Utilizaremos la estructura "switch" para implementar este programa. */


import java.util.Scanner;


public class actividadEjercicioDiasSemana {


    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese un número del 1 al 7, que representará un día de la semana: ");
        try {


            int diaSemana = sc.nextInt();


            switch (diaSemana) {
                case 1 :
                    System.out.println("El día de la semana que corresponde es: Lunes");
                   
                    break;
               
                case 2 :
                    System.out.println("El día de la semana que corresponde es: Martes");
                   
                    break;
   
                case 3 :
                    System.out.println("El día de la semana que corresponde es: Miércoles");
                   
                    break;
               
                case 4 :
                    System.out.println("El día de la semana que corresponde es: Jueves");
                   
                    break;
               
                case 5 :
                    System.out.println("El día de la semana que corresponde es: Viernes");
                   
                    break;
               
                case 6 :
                    System.out.println("El día de la semana que corresponde es: Sábado");
   
                    break;
   
                case 7 :
                    System.out.println("El día de la semana que corresponde es: Domingo");
                   
                    break;
   
                default:
                    System.out.println("Opción inválida, ingrese un número del 1 al 7.");
                    break;
   
            }
   
           
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Digite un número del 1 al 7: ");
        }
       
        finally {


            sc.close ();


        }
    }


}

