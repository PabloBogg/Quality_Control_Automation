/* ✏️  Actividad:Extracción de Subcadena
Escribe un programa que solicite al usuario ingresar 
una frase y dos números enteros, que representen un índice
 inicial y un índice final. Utiliza el método substring() 
 de la clase String para extraer la subcadena que se encuentra 
 entre los índices ingresados por el usuario, y muestra la subcadena
  resultante en pantalla. */

import java.util.Scanner;

public class actividadExtracciónSubcadena {
    public static void main(String[] args) {
        
        try {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar frase: ");
        String frase=sc.nextLine();
        System.out.println("Ingresar indice inicial: ");
        int indiceInicio=sc.nextInt();
        System.out.println("Ingresar indice final: ");
        int indiceFinal=sc.nextInt();

        System.out.println("La subcadena es: "+ frase.substring(indiceInicio, indiceFinal));
        
        sc.close();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error, ingresar un indice correcto. "+ e.getMessage());
            
        }


    }
}
