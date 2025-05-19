import java.util.Scanner;


public class actividadPracticandoConEstructurasDeControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("por favor ingrese un numero entre 0 y 100: ");
        int nota = sc.nextInt();


        if (nota >= 90 && nota <= 100){
            System.out.println("SU CALIFICACION ES A");
        }
        else if (nota >= 80 && nota < 90){
            System.out.println("SU CALIFICACION ES B");
            }
        else if (nota >= 70 && nota < 80){
            System.out.println("SU CALIFICACION ES C");
            }
        else if (nota >= 60 && nota < 70){
            System.out.println("SU CALIFICACION ES D");
            }
        else if (nota >= 0 && nota < 60){
                System.out.println("SU CALIFICACION ES F");
                }
                else{
                    System.out.println("el número ingresado está fuera del rango válido");
                    }

            sc.close();
}
}

