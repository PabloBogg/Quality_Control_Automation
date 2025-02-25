package com.nombreempresa;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void createMockObject() {
        List<String> listaMock = Mockito.mock(List.class);
        listaMock.size();

        verify(listaMock).size();
        when(listaMock.size()).thenReturn(1);
    }

    @Test
    void configureMockObject2() {
        List<String> listaMock = Mockito.mock(List.class);
        listaMock.size();

        when(listaMock.size()).thenReturn(1);
        verify(listaMock).size();
    }

}
