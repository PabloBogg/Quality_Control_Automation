/*
 * 2. Dibujando cuadrados

Realiza un programa para crear un cuadrado de N elementos 
por lado utilizando el carácter “*”.

Para ello  simplemente dibuja una línea de N asteriscos. 
Repite este proceso N veces para completar el cuadrado. 

Por ejemplo, si el cuadrado tiene 4 elementos por lado 
se deberá dibujar lo siguiente

****
*  *
*  *
****
image4
Observación: El cuadrado solo debe ser dibujado por sus lados.
 */

import java.util.Arrays;
import java.util.Scanner;

public class dibujandoCuadrados {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar lado del cuadrado: ");
        int ladoCuadrado=sc.nextInt();
        
        char [] arraySuperiorInferior= new char[ladoCuadrado];
        Arrays.fill(arraySuperiorInferior,'*'); 

        char [] arrayInterior= new char[ladoCuadrado];
        Arrays.fill(arrayInterior, ' ');
        arrayInterior[0]=arrayInterior[ladoCuadrado-1]='*';

        for (int i = 0; i < ladoCuadrado; i++) {
            if (i==0 || i==ladoCuadrado-1) {
                String superiorInferior = new String(arraySuperiorInferior);
                System.out.println(superiorInferior);
            }else{
                String interior = new String(arrayInterior);
                System.out.println(interior);
            }

        }









        sc.close();
    }
}
