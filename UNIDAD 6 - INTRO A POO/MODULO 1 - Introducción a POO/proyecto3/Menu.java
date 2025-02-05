package proyecto3;



public class Menu {
    public static void main(String[] args) {
        

        Rectangulo[] rectangulos=new Rectangulo[3];
        rectangulos[0]=new Rectangulo(10, 5);
        rectangulos[1]=new Rectangulo(15, 10);
        rectangulos[2]=new Rectangulo(20, 15);

        
        Rectangulo.imprimirContador();

        for (Rectangulo rectangulo : rectangulos) {
            System.out.println("---");

            rectangulo.imprimirArea();
            rectangulo.imprimirPerimetro();
            
            
            System.out.println("---");
        }

        



    }
}
