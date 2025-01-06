
import java.util.Scanner;
public class actividadOperadoresBasicosParteC {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresar el numero a: ");
        int a=teclado.nextInt();
        System.out.println("Ingresar el numero b: ");
        int b=teclado.nextInt();
        teclado.close();
        System.out.println("Suma: "+a+"+"+b+"="+(a+b));


    }
    
}
