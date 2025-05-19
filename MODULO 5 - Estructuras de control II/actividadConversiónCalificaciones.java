/* ✏️  Actividad: Conversión de Calificaciones
En esta actividad, desarrollarás un programa que solicitará al usuario
 ingresar una calificación numérica del 1 al 5. Luego, mostrará en pantalla
  la calificación correspondiente en letras, utilizando la siguiente escala:

1: "Muy deficiente"

2: "Deficiente"

3: "Suficiente"

4: "Notable"

5: "Sobresaliente */

import java.util.Scanner;

public class actividadConversiónCalificaciones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingregar la calificacion: ");
        int calificacion=sc.nextInt();

        switch (calificacion) {
        case 1->System.out.println("Muy deficiente");
        case 2->System.out.println("Deficiente");
        case 3->System.out.println("Suficiente");
        case 4->System.out.println("Notable");
        case 5->System.out.println("Sobresaliente");
        default ->System.out.println("La opcion es invalida");


        }
        sc.close();
    }

}
