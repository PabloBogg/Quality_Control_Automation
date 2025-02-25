import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HolaMundoTest {

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
        HolaMundo.main(new String[1] );
        String resultado=ouutputStreamCaptor.toString();
        Assertions.assertEquals("Hola mundo!\r\n", resultado);
    }

}
