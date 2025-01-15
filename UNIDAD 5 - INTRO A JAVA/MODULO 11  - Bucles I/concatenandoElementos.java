/*
 * ✏️  Actividad: Concatenando elementos
Crea un array del tamaño que prefieras que contenga elementos de
tipo cadena. Luego, concatena los elementos en una sola cadena, 
separados por espacios, e imprime el resultado por consola.
 */
public class concatenandoElementos {
    public static void main(String[] args) {
        String[] array = { "Hola", ",","como", "estas", "?" };

        for (String elemento : array) {
            System.out.print(elemento+" ");
        }
    }
}
