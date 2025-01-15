/*
 * ✏️  Actividad: Adivinando un número 
Escribe un programa que genere un número aleatorio entre 1 y 20, 
y muestra por consola un mensaje pidiéndote que adivines ese número 
utilizando un bucle do-while. El programa te indicará si el número que 
ingresas es mayor o menor que el número aleatorio, y seguirá pidiéndote 
que adivines hasta que lo hagas correctamente.
 */
import java.util.Scanner;

public class adivinandoNumero  {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int aleatorio = (int)(Math.random() * (20 - 1) + (1));
        int numero;
        System.out.println(aleatorio);

        do{
            System.out.println("Intenta adivinar el numero aleatorio entre 1 y 20: ");
            numero = input.nextInt();
            
            if (numero > aleatorio) {
                System.out.println("Te pasaste");
            }
            else if (numero < aleatorio) {
                System.out.println("El numero que elegiste es menor");
            }
        } while(numero != aleatorio );

        System.out.println("Adivinaste");
        input.close();
    }
}
