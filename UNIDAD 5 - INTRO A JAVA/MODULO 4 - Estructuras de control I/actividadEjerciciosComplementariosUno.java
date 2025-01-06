//1. Verificación de Contraseña:
//En este ejercicio, escribirás un programa que pida al usuario una contraseña y verificará si coincide con una contraseña predefinida.
// Si la contraseña ingresada es correcta, se mostrará un mensaje de "Acceso concedido".
//En caso contrario, se mostrará un mensaje de "Acceso denegado".


import java.util.Scanner;
public class actividadEjerciciosComplementariosUno {
   
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese la contraseña: ");
         String passw = sc.nextLine();


         String contra = "1234";


         if (passw.equals(contra)){
         
            System.out.print("Acceso concedido");




         } else {


            System.out.print("Acceso denegado");


       
         }


       sc.close();






    }
}

