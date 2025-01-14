/* ✏️  Actividad: Calculando el promedio 
Genera un array de 20 elementos de tipo float, inicializándolo
con los números de tu elección. Luego, suma todos los elementos
del array y calcula su promedio. Finalmente, muestra por consola
tanto el resultado de la suma como el promedio de los elementos.

Te sugerimos implementar el uso de la sintaxis de for-each. */

public class calculandoPromedio {
    public static void main(String[] args) {

        float array []={0.2f, 0.3f, 0.5f, 1.2f, 1.3f ,1.4f ,1.5f ,1.8f, 1.9f, 1.7f, 7.8f, 8.9f, 5.8f, 7.9f, 8.9f, 0.2f, 0.5f, 5.8f, 9.8f, 9.9f};
        float suma=0;

        for (float num:array){
            suma+=num;
            
        }
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+(suma/array.length));

    }
}
