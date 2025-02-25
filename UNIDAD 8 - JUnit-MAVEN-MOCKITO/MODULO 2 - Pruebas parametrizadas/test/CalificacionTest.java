package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvFileSources;
import org.junit.jupiter.params.provider.CsvSource;



import src.Calificacion;

public class CalificacionTest {

    private InputStream standarIn = System.in;

    @ParameterizedTest
    @CsvSource({ "92,La clasificación correspondiente a la puntuación 92 corresponde a la letra A",
            "80,La clasificación correspondiente a la puntuación 80 corresponde a la letra B",
            "72,La clasificación correspondiente a la puntuación 72 corresponde a la letra C",
            "64,La clasificación correspondiente a la puntuación 64 corresponde a la letra D",
            "220,La clasificación correspondiente a la puntuación 220 corresponde a la letra : Error - El número ingresado está fuera del rango válido." })
    void testMensajePuntuacion(int puntuacion, String mensaje) {
        Assertions.assertEquals(mensaje, Calificacion.mensajePuntuacion(puntuacion));
    }

    @ParameterizedTest
    @CsvSource({ "95,A", "85,B", "72,C", "64,D", "10,F",
            "-5,: Error - El número ingresado está fuera del rango válido.",
            "154,: Error - El número ingresado está fuera del rango válido." })

    void testObtenerNota(int puntuacion, String mensaje) {

        Assertions.assertEquals(mensaje, Calificacion.obtenerNota(puntuacion));

    }

    @AfterEach
    public void tearDown() {
        System.setIn(standarIn);
    }

    @ParameterizedTest
    //@CsvSource({ "92,92", "80,80" })
    @CsvFileSource(resources="/test/archivo.csv")
    void testObtenerPuntuacion(int valorIngresado, int valorEsperado) {

        ByteArrayInputStream in = new ByteArrayInputStream((valorIngresado + "\n").getBytes());
        System.setIn(in);
        Calificacion.lecturaDato = new Scanner(System.in);
        Assertions.assertEquals(valorEsperado, Calificacion.obtenerPuntuacion());

    }
}
