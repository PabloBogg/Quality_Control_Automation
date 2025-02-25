package test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import src.NumeroAleatorio;

public class NumeroAleatorioTest {
    @ParameterizedTest
    @CsvSource({"1,10", "-10,10", "5,5", "200,300", "3,2"})
    void testNumeroAleatorioEnRango(int min, int max) {
        int resultado = NumeroAleatorio.NumeroAleatorioEnRango(min, max);
        Assertions.assertTrue(resultado >= min && resultado <= max, "EL NUMERO ESTA FUERA DE RANGO");
    }
}
