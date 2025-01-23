import java.util.Arrays;

public class prueba {
    public static void main(String[] args) {
        String[] palabras = {"Hola", "mundo", "programación", "Java"};
        
        // Ordenar el array antes de usar binarySearch
        Arrays.sort(palabras);
        
        String palabraBuscada = "Java";
        int indice = Arrays.binarySearch(palabras, palabraBuscada);
        
        if(indice >= 0) {
            System.out.println("La palabra \"" + palabraBuscada + "\" fue encontrada en el array en el índice " + indice + ".");
        } else {
            System.out.println("La palabra \"" + palabraBuscada + "\" no fue encontrada en el array.");
        }
    }
}