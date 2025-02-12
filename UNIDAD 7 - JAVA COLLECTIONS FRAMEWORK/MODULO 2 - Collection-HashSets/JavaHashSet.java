

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {

    HashSet<String> invitados;

    public JavaHashSet() {
        invitados = new HashSet<String>();
    }

    public void agregarInvitado(String nombre) {
        nombre = normalizar(nombre);
        if (invitados.add(nombre)) {
            System.out.println("Agregado correctamente");
        } else {
            System.out.println("No se pudo agregar");
        }
    }

    public void eliminarInvitado(String nombre) {
        nombre = normalizar(nombre);
        if (invitados.remove(nombre)) {
            System.out.println("Eliminado correctamente");
        } else {
            System.out.println("No se pudo eliminar");
        }
    }

    public void mostrarInvitados() {
        for (String invitado : invitados) {
            System.out.println(invitado);
        }
    }

    private String normalizar(String nombre) {
        return nombre.toLowerCase();

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JavaHashSet jv = new JavaHashSet();

        int opcion;
        do {
            System.out.println("MENU:");
            System.out.println("1- Agregar");
            System.out.println("2- Eliminar");
            System.out.println("3- Mostrar");
            System.out.println("4- SALIR");

            System.out.println("INGRESE LA OPERACION A REALIZAR");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Agrega el nombre del invitado");
                    jv.agregarInvitado(scan.nextLine());
                    break;
                case 2:
                    System.out.println("Ingresa el nombre del invitado a eliminar");
                    jv.eliminarInvitado(scan.nextLine());
                    break;
                case 3:
                    jv.mostrarInvitados();
                    break;
                case 4:
                    System.out.println("ADIOS");
                    break;
                default:
                    System.out.println("DEBE SER DE 1 A 5");
                    break;
            }
        } while (opcion != 4);

        scan.close();

    }

}
