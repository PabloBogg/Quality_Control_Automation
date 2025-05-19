/* 2. Cálculo de Descuento:
En este ejercicio, desarrollarás un programa que solicitará al usuario el 
precio de un producto y determinará si tiene derecho a un descuento. 
Si el precio es igual o mayor a $100, se aplicará un descuento del 10% y 
se mostrará el nuevo precio con descuento. De lo contrario, se mostrará el precio original sin descuento
 */
import java.util.Scanner;
public class actividadEjerciciosComplementariosDos {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese el precio del producto: ");
       double precio = sc.nextDouble();
       if (precio >= 100) {System.out.println("El precio con descuento es: " + (precio * 0.9));}
       else {System.out.println("El precio sin descuento es: " + precio);}
       sc.close();


   }
}
