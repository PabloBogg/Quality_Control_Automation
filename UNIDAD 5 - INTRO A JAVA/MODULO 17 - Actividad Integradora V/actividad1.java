import java.util.Arrays;
import java.util.Scanner;

public class actividad1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        String frase = "";

        do {
            System.out.println("");
            System.out.println("------------------MENU----------------------");
            System.out.println("1- Crear oración o Borrar oración");
            System.out.println("2- Cantidad de caracteres de la oración");
            System.out.println("3- Cantidad de palabras de la oración");
            System.out.println("4- Mostrar palabras ordenadas alfabéticamente");
            System.out.println("5- Ingresar un número y devolver la palabra correspondiente");
            System.out.println("6- Buscar palabra dentro de la oración");
            System.out.println("7- Modificar palabra dentro de la oración");
            System.out.println("8- Agregar contenido a la oración");
            System.out.println("9- Salir");
            System.out.println("--------------------------------------------");
            System.out.println("");
            System.out.println("Ingresar una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion != 1 && frase.isEmpty()) {
                System.out.println("La frase esta vacia, primero debe ingresarla: ");
            } else {
                switch (opcion) {
                    case 1:
                        /*
                         * Si la oración está vacía, mostrar el mensaje "Crear oración".
                         * Si la oración tiene contenido, mostrar el mensaje "Borrar oración".
                         */
                        if (frase.isEmpty()) {
                            System.out.println("Crear oración");
                            System.out.println("Ingresar frase: ");
                            frase = sc.nextLine();
                        } else {
                            System.out.println("Borrar oración");
                            frase = "";
                            System.out.println("La frase fue borrada con exito.");
                        }
                        break;
                    case 2:
                        /*
                         * Calcular y mostrar la cantidad de palabras en la oración
                         */
                        System.out.println("La cantidad total de caracteres en la oración es: " + frase.length());
                        break;

                    case 3:
                        /*
                         * Calcular y mostrar la cantidad de palabras en la oración
                         */
                        String[] palabras = frase.split(" ");
                        System.out.println("La cantidad de palabras es: " + palabras.length);
                        break;

                    case 4:
                        /*
                         * Mostrar las palabras de la oración ordenadas alfabéticamente.
                         */
                        String[] ordenadas = frase.split(" ");
                        Arrays.sort(ordenadas);
                        System.out.println(Arrays.toString(ordenadas));
                        break;

                    case 5:
                        /*
                         * Solicitar al usuario ingresar un número y mostrar la palabra correspondiente
                         * a esa
                         * posición en la oración. Si se ingresa un número fuera del rango de número de
                         * palabras
                         * (la primera palabra corresponde al número 1), mostrar el mensaje "Número
                         * inválido.
                         * Intente nuevamente".
                         */
                        String[] posPalabra = frase.split(" ");
                        System.out.println("Ingrese un numero");
                        int numero = sc.nextInt();
                        sc.nextLine();

                        if (numero < 1 || numero > posPalabra.length) {
                            System.out.println("Numero invalido. Ingrese otro numero nuevamente");
                        } else {
                            System.out
                                    .println("La palabra en la posicion " + numero + " es: " + posPalabra[numero - 1]);
                        }
                        break;

                    case 6:
                        /*
                         * Solicitar al usuario ingresar una palabra y verificar si esa palabra se
                         * encuentra
                         * en la oración. Mostrar un mensaje indicando si la palabra fue encontrada y la
                         * posición en la que se encuentra.
                         */
                        String[] buscarPalabraArray = frase.split(" ");

                        System.out.println("Ingresar palabra a buscar: ");
                        String palabraParaBuscar = sc.nextLine();

                        boolean palabraExiste = false;
                        int indice = 0;
                        for (int i = 0; i < buscarPalabraArray.length; i++) {
                            if (buscarPalabraArray[i].equals(palabraParaBuscar)) {
                                palabraExiste = true;
                                indice = i + 1;
                            }
                        }
                        if (palabraExiste) {
                            System.out.println(
                                    "La palabra " + palabraParaBuscar + " se encuentra en la posicion " + indice);

                        } else {
                            System.out.println("La palabra " + palabraParaBuscar + " no se encuentra en la frase");
                        }

                        break;
                    case 7:
                        /*
                         * Solicitar al usuario ingresar la palabra que se quiere cambiar, mostrar un
                         * mensaje de error si no se encuentra y volver a solicitar la palabra.
                         * Si la palabra es correcta, solicitar una nueva palabra (o frase) y reemplazar
                         * la anterior. Mostrar la nueva oración modificada (recordar validar que solo
                         * contenga letras y espacios).
                         */
                        boolean palabraRemplazarExiste = false;
                        int indicePalabraRemplazar = 0;
                        String[] palabraRemplazarArray = frase.split(" ");

                        do {
                            System.out.println("Ingresar palabra a remplazar: ");
                            String palabraParaRemplazar = sc.nextLine();

                            for (int i = 0; i < palabraRemplazarArray.length; i++) {
                                if (palabraRemplazarArray[i].equals(palabraParaRemplazar)) {
                                    palabraRemplazarExiste = true;
                                    indicePalabraRemplazar = i;
                                }
                            }
                            if (palabraRemplazarExiste) {
                                String nuevaPalabra;
                                boolean palabraValida = false;
                                do {
                                    System.out.println(
                                            "Ingresar nueva palabra o frase a ingresar (solo letras y espacios): ");
                                    nuevaPalabra = sc.nextLine();
                                    if (nuevaPalabra.matches("^[a-zA-Z\s]+$")) {
                                        palabraValida = true;
                                    }
                                } while (!palabraValida);

                                palabraRemplazarArray[indicePalabraRemplazar] = nuevaPalabra;
                                System.out.println("Frase Original: " + frase);
                                frase = String.join(" ", palabraRemplazarArray);
                                System.out.println("Nueva frase: " + frase);

                            } else {
                                System.out.println("La palabra " + palabraParaRemplazar
                                        + " no exite en la frase, ingresar nuevamente una palabra valida.");
                            }

                        } while (!palabraRemplazarExiste);

                        break;

                    case 8:
                        /*
                         * Solicitar al usuario ingresar contenido y agregar ese contenido al final de
                         * la oración.
                         */
                        String nuevaPalabraOFrase;
                        boolean palabraOFraseValida = false;
                        do {
                            System.out.println(
                                    "Ingresar  palabra o frase a ingresar al final de la frase original (solo letras y espacios): ");
                            nuevaPalabraOFrase = sc.nextLine();
                            if (nuevaPalabraOFrase.matches("^[a-zA-Z\s]+$")) {
                                System.out.println("Frase original: "+frase);
                                frase=frase+" "+nuevaPalabraOFrase;
                                System.out.println("Nueva Frase: "+frase);
                                palabraOFraseValida = true;


                            }
                        } while (!palabraOFraseValida);

                        break;

                    default:
                        break;
                }
            }
        } while (opcion != 9);
        sc.close();

    }
}
