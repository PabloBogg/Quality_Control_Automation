/*
 * ✏️  Actividad: Validación de contraseña
Escribe un programa que solicite que ingreses una contraseña 
y la valide utilizando un bucle while. La contraseña correcta 
es "secreto". Continuará pidiéndote que ingreses la contraseña
hasta que sea correcta.
 */

import java.util.Scanner;

public class validaciónContraseña{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String password="secreto";
    System.out.println("Ingresar la contraseña: ");
    String contraseña=sc.nextLine();
    while(!contraseña.equals(password)){
        System.out.println("Por favor ingrese una contraseña valida: ");
        contraseña=sc.nextLine();
    };
    System.out.println("La contraseña es correcta!");
    sc.close();
}
}

