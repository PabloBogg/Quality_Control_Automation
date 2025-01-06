/* . Calculadora de Área y Perímetro:

Pide al usuario que ingrese el valor de la base y de la altura de un rectángulo.
Almacena estos valores en variables previamente declaradas llamadas baseRectangulo y alturaRectangulo, respectivamente.
Calcula y almacena el perímetro del rectángulo utilizando la fórmula: Perímetro = 2 × base + 2 × altura.
Muestra el resultado del perímetro por consola junto con un mensaje adecuado.
Calcula y almacena el área del rectángulo utilizando la fórmula: Área = base × altura.
Muestra el resultado del área por consola junto con un mensaje adecuado.

💡 Recuerda: Al declarar las variables, ten en cuenta si los valores ingresados por el usuario pueden 
ser decimales. En tal caso, debes utilizar variables de tipo flotante o doble para garantizar una precisión decimal adecuada.
 */
import java.util.Scanner;
 public class actividadComplementariados {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresar base del rectangulo: ");
        float baseRectangulo=teclado.nextFloat();
        System.out.println("Ingresar altura del rectangulo: ");
        float alturaRectangulo=teclado.nextFloat();
        float perimetro=2*baseRectangulo+2*alturaRectangulo;
        System.out.println("El perimetro del rectangulo es: "+perimetro);
        float area=baseRectangulo*alturaRectangulo;
        System.out.println("El area del rectangulo es: "+area);
    }
}
