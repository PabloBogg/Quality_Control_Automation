
/*
 * ✏️  Actividad: Rellenando un arreglo
El método fill() de la clase Arrays cambia todos los elementos en un arreglo 
por un valor estático, desde el índice start (por defecto 0) hasta el índice 
end (por defecto array.length) y devuelve el arreglo modificado. Vamos a 
escribir un programa que solicite al usuario el tamaño para un arreglo y un 
número entero con el que quiera rellenarlo. Luego crea el arreglo y utiliza 
Arrays.fill(). Finalmente, imprime el arreglo resultante.
 */
import java.util.Arrays;
import java.util.Scanner;

public class rellenandoArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud del arreglo");
        int longitud = scanner.nextInt();
        System.out.println("Ingrese un número entero con el que rellenar el arreglo");
        int num = scanner.nextInt();

        int[] arreglo = new int[longitud];
        Arrays.fill(arreglo, num);
        System.out.println(Arrays.toString(arreglo));
        scanner.close();
    }
}
