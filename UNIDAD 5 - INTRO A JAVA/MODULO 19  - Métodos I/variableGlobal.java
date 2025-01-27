import java.util.Scanner;

public class variableGlobal {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        String nombre = obtenerNombre();
        int edad = obtenerEdad();
        imprimeNombreYEdad(nombre, edad);
        
    }

    public static String obtenerNombre() {
        System.out.println("Por favor ingresar un nombre");
        String nombre = sc.nextLine();
        return nombre;
    }

    public static int obtenerEdad() {
        System.out.println("Por favor ingresar Edad");
        int edad = sc.nextInt();
        return edad;
    }

    public static void imprimirNombre(String parametroNombre) {
        System.out.println("Mi nombre es " + parametroNombre);
    }

    public static void imprimeNombreYEdad(String parametroNombre, int parametroEdad) {
        System.out.println("Me llamo " + parametroNombre + " y tengo " + parametroEdad + " años");
    }
}
