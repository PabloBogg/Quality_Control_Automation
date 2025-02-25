package src;
public class NumeroAleatorio {

    public static void main(String[] args) {
    }

    public static int NumeroAleatorioEnRango(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException();
        } else {
            int num = (int) (((max - min) + 1) * Math.random() + min);
            return num;
        }
    }
}
