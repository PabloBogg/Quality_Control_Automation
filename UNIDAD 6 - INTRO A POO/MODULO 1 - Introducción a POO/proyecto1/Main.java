package proyecto1;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 35);
        Persona persona2 = new Persona("Roberto", 28);
        persona1.imprimirDatos();
        System.out.println("----");
        persona2.imprimirDatos();
    }

}
