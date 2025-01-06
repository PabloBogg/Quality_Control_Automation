/* En este ejercicio, crearás un programa que pedirá al usuario 
ingresar un número del 1 al 7, representando un día de la semana. 
El programa determinará si ese día es hábil o no. Se mostrará el 
resultado en pantalla. Se considera que los días hábiles son del 1 al 5 
(de lunes a viernes). Utilizaremos la estructura "switch" para 
implementar este programa. ( Ten en cuenta que los días hábiles 
son del 1 al 5 (de lunes a viernes).) */

import java.util.Scanner;

public class actividadEjerciciosComplementarios {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar dia de la semana, 1 al 7: ");
        int diaSemana=sc.nextInt();

        
        String resultado = switch (diaSemana){
            case 1,2,3,4,5-> "Es un dia habil";
            case 6,7->"Es fin de semana";
            default -> "Opcion invalida";

        };
        System.out.println(resultado);

sc.close();
    }
}
