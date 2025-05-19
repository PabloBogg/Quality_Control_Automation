import java.util.Scanner;
public class actividadIntegradoraDosBis {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Ingresar el primer numero: ");
        float num1=teclado.nextFloat();

        System.out.println("Ingresar el segundo numero: ");
        float num2=teclado.nextFloat();

        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Elija una opción (1-4): ");
        int opcion = teclado.nextInt();

        float resultado= opcion==1 ? (num1+num2): 
                        opcion==2 ? (num1-num2):
                        opcion==3 ? (num1*num2):
                        opcion==4 ? (num1/num2):0;

        System.out.println((opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4) ? "Opcion incorrecta":"El resultado es: "+resultado ); 
        teclado.close();  


    }
}
