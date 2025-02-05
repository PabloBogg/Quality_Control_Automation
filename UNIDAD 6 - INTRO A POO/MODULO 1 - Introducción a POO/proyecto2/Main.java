package proyecto2;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("KIA", "Seratto", 2022);
        Auto auto2 = new Auto("FIAT", "Cronos");
        Auto auto3 = new Auto("Honda");
        Auto auto4 = new Auto();

        auto1.imprimirDatos();
        auto2.imprimirDatos();
        auto3.imprimirDatos();
        auto4.imprimirDatos();
}
}