import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    @Test
    void testDoble() {
        Integer resultado = Ejercicio1.doble(3);
        Assertions.assertEquals(6, resultado);
    }

}

