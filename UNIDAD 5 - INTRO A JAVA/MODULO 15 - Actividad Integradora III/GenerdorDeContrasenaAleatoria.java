/*
 * ✏️  Actividad: Generando contraseñas
Vas a desarrollar un programa en Java que genere una contraseña aleatoria. Esta contraseña estará compuesta por una mezcla de letras mayúsculas, letras minúsculas y dígitos. La contraseña será almacenada en un arreglo de caracteres.

Para generar la contraseña, utilizarás un bucle for que repetirá la operación tantas veces como la longitud de la contraseña especificada por el usuario.

Para asegurarte de que la contraseña generada contenga al menos una letra mayúscula, una letra minúscula y un dígito, usaré bucles do-while y while junto con los métodos isUpperCase, isLowerCase e isDigit de la clase Character.

Finalmente, convertirás el arreglo de caracteres en un String con un bucle for y luego imprimirás la contraseña generada en la consola.
 */
import java.util.Scanner;
import java.util.Random;

public class generdorDeContrasenaAleatoria {
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