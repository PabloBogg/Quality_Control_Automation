/* ✏️  Actividad:Validación de contraseña
Escribe un programa que solicite al usuario 
que ingrese una contraseña y verifique si cumple con los siguientes
 criterios para considerarse segura:

1- La contraseña debe tener al menos 8 caracteres.

2- La contraseña debe contener al menos una letra mayúscula y una letra minúscula.

3- La contraseña debe contener al menos un número.

4- La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).

5- El programa debe mostrar un mensaje indicando si la contraseña es segura o no, según 
los criterios establecidos. 

Puedes utilizar métodos de la clase String para verificar cada uno de los criterios. */

import java.util.Scanner;

public class desafioDos {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor ingrese la contraseña: ");
        String contraseña=sc.next();

        
        if (contraseña.length()<8){
            System.out.println("La contraseña debe tener al menos 8 caracteres");
        }
        else if (!(contraseña.matches(".*[A-Z].*") && contraseña.matches(".*[a-z].*"))) {
            System.out.println("La contraseña debe contener al menos una letra mayúscula y una letra minúscula");
        }
        else if (!(contraseña.matches(".*[0-9].*"))){
            System.out.println("La contraseña debe contener al menos un número");
        }
        else if (!(contraseña.matches(".*[ !, @, #, $, %, ^, &, *, (, ), _, +, -, {, }, [, ], :, ;, \", ', <, >, ?, /, |].*"))){
            System.out.println("La contraseña debe contener al menos un carácter especial");
        }
        else {
            System.out.println("La contraseña es segura!");
        }
        sc.close();

    }
}

