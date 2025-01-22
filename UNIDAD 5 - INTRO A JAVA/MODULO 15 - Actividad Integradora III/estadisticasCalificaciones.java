/*
 * ✏️  Actividad: Estadísticas de calificaciones
Vas a desarrollar un programa en Java que genere un arreglo de calificaciones de manera aleatoria. 
Estas calificaciones se almacenarán en un arreglo de Strings.

Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos, 
separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y 
excelente (>=10). Necesitarás convertir los String a double para lograrlo.

Luego calcula el promedio del arreglo original y de cada uno de los nuevos arreglos.

Por último, imprimiré los resultados en consola.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class estadisticasCalificaciones {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingresar la cantidad de notas: ");
        int cantidadNotas=sc.nextInt();
        String [] notas= new String[cantidadNotas];

        int cantidadDesaprobados=0;
        int cantidadAprobados=0;
        int cantidadExcelentes=0;

        for (int i=0;i<cantidadNotas;i++){
            notas[i]=Integer.toString(rand.nextInt(0,10));
            Double opcion=Double.valueOf(notas[i]);

            if (opcion>=0 && opcion<4) {
                cantidadDesaprobados++;   
            }else if(opcion>=4 && opcion<10){
                cantidadAprobados++;
            }else {
                cantidadExcelentes++;
            } 
        }

        Double [] desaprobados= new Double[cantidadDesaprobados];
        Double [] aprobados= new Double[cantidadAprobados];
        Double [] excelentes= new Double[cantidadExcelentes];
        int indiceDesaprobados=0;
        int indiceAprobados=0;
        int indiceExcelentes=0;
        Double sumaDesaprobados=0.0;
        Double sumaAprobados=0.0;
        Double sumaExelentes=0.0;
        Double sumaNotas=0.0;


        for (String valor:notas){
            Double opcion=Double.valueOf(valor);
            sumaNotas=sumaNotas+opcion;
            if (opcion>=0 && opcion<4) {
                desaprobados[indiceDesaprobados]=opcion;  
                indiceDesaprobados++;
                sumaDesaprobados=sumaDesaprobados+opcion; 
            }else if(opcion>=4 && opcion<10){
                aprobados[indiceAprobados]=opcion;
                indiceAprobados++;
                sumaAprobados=sumaAprobados+opcion;
            }else {
                excelentes[indiceExcelentes]=opcion;
                indiceExcelentes++;
                sumaExelentes=sumaExelentes+opcion;
            }

        }
        System.out.println(Arrays.toString(notas));
        System.out.println("El promedio de las Notas es: "+(sumaNotas/cantidadNotas));

        if (cantidadDesaprobados>0) {
            System.out.println("El promedio de Desaprobados es: "+(sumaDesaprobados/cantidadDesaprobados));
        }else{
            System.out.println("No hay Desaprobados");
        }

        if (cantidadAprobados>0) {
            System.out.println("El promedio de Aprobados es: "+(sumaAprobados/cantidadAprobados));
        }else{
            System.out.println("No hay Aprobados");
        }    

        if (cantidadExcelentes>0) {
            System.out.println("El promedio de Excelentes es: "+(sumaExelentes/cantidadExcelentes));
        }else{
            System.out.println("No hay Excelentes");
        }

        
        
        
        

        sc.close();
    }
}
