import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NombreyEdadTest {

    // Configurar la captura de salida
    private final PrintStream standarOut = System.out;
    private final ByteArrayOutputStream ouutputStreamCaptor = new ByteArrayOutputStream();

    // Redirigir la salida de System.out
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(ouutputStreamCaptor));
    }

    // Restaurar la salida estándar
    @AfterEach
    public void tearDown() {
        System.setOut(standarOut);
    }

    @Test
    void testMain() {

        NombreyEdad.main(new String[1]);
        String resultado=ouutputStreamCaptor.toString();
        Assertions.assertEquals("Me llamo PEPE y tengo 25 años\r\n", resultado);

    }
}
