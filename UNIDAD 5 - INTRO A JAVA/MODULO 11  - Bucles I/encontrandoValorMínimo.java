/*
 * ✏️  Actividad: Encontrando el valor mínimo 
Escribe un programa que recorra un array de enteros 
y encuentre el valor mínimo presente en el array. 
El tamaño y los números  a contener pueden ser de tu elección.
 */
public class encontrandoValorMínimo {
    public static void main(String[] args) {
        int[] array = {-897,-5,3,8,9,4,-89};

  int menor = array[0];

  for (int i = 0; i < array.length; i++) {
      if (array[i] < menor) {
          menor = array[i];
      }

  }

  System.out.println("El menor es: " + menor);
    }
}
