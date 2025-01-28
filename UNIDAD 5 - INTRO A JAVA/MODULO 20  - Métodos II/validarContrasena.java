/*
 * 2. Validación de contraseña: Basándote en el ejercicio que ya has realizado, 
 * crea un método "esSegura()" que reciba por parámetro un "String" y devuelva 
 * un booleano para comprobar que la contraseña cumple con los criterios establecidos. 
 * También, crea los métodos: "tieneLongitudCorrecta()", "tieneMayuscula()", 
 * "tieneMinuscula()", "tieneNumero()" y "tieneCaracterEspecial()", que reciban 
 * por parámetro un "String" y devuelvan un "booleano".
 */
import java.util.Scanner;

public class validarContrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una contraseña: ");
        String contrasena = sc.nextLine();

        if(esSegura(contrasena)){
            System.out.println("La contraseña es SEGURA.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos...");
        }
        sc.close();

    }

    public static boolean esSegura(String contrasena) {
        return tieneLongitudCorrecta(contrasena) &&
                tieneMayuscula(contrasena) &&
                tieneMinuscula(contrasena) &&
                tieneNumero(contrasena) &&
                tieneCaracterEspecial(contrasena);
    }

    public static boolean tieneLongitudCorrecta(String contrasena) {
        return contrasena.length() >= 8;
    }

    public static boolean tieneMayuscula(String contrasena) {
        for (char c : contrasena.toCharArray()){
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean tieneMinuscula(String contrasena) {
        for (char c : contrasena.toCharArray()){
            if(Character.isLowerCase(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean tieneNumero(String contrasena) {
        for (char c : contrasena.toCharArray()){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean tieneCaracterEspecial(String contrasena) {
        String caracteresEspeciales = "!@#$%^&*()_+-=[]{}|;':\",./<>?";
        for (char c : contrasena.toCharArray()){
            if(caracteresEspeciales.contains(String.valueOf(c))){
                return true;
            }
        }
        return false;


    }

}
