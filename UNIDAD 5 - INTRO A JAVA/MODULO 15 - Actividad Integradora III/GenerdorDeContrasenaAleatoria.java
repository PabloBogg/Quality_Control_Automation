
import java.util.Scanner;
import java.util.Random;

public class GenerdorDeContrasenaAleatoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("ingrese la longitud de la contraseña a generar");
        int longitud = scanner.nextInt();
        char[] contrasena = new char[longitud];
        int auxiliar;
        boolean validacionMayus = false, validacionMinus = false, validacionNum = false;
        do {
            validacionMayus = false;
            validacionMinus = false;
            validacionNum = false;
            for (int i = 0; i < longitud; i++) {


                auxiliar = ran.nextInt(48, 122);
                contrasena[i] = (char) auxiliar;
                if (Character.isUpperCase(contrasena[i])) {
                    validacionMayus = true;
                } else if (Character.isLowerCase(contrasena[i])) {
                    validacionMinus = true;
                } else if (Character.isDigit(contrasena[i])) {
                    validacionNum = true;
                }
            }
        }    while (!validacionMayus || !validacionMinus  || !validacionNum );
        String cadena = new String(contrasena);
        System.out.println(cadena);
        
        scanner.close();
    }
}