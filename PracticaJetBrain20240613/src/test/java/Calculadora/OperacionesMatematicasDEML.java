package Calculadora;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OperacionesMatematicasDEML {

    OperacionesMatematicas operaciones;

    @BeforeEach
    void alIniciar() {
        operaciones = new OperacionesMatematicas();
    }

    @AfterEach
    void alFinalizar() {
        operaciones = null;
    }

    @BeforeAll
    static void alIniciarTodasLasPruebas() {
        System.out.println("Iniciar todas las pruebas");
    }

    @AfterAll
    static void alFinalizarTodasLasPruebas() {
        System.out.println("Finalizar todas las pruebas");
    }

    @Test
    @Order(1)
    void calcularRaizCuadradaNumeroPositivo() {
        double numero = 25.0;
        double resultadoEsperado = 5.0;
        double resultado = operaciones.calcularRaizCuadrada(numero);
        assertEquals(resultadoEsperado, resultado, 0.0001);
    }

    @Test
    @Order(2)
    void calcularRaizCuadradaDeCero() {
        double numero = 0.0;
        double resultadoEsperado = 0.0;
        double resultado = operaciones.calcularRaizCuadrada(numero);
        assertEquals(resultadoEsperado, resultado, 0.0001);
    }

    @Test
    @Order(3)
    void calcularRaizCuadradaNumeroNegativo() {
        double numero = -25.0;
        assertThrows(IllegalArgumentException.class, () -> {
            operaciones.calcularRaizCuadrada(numero);
        });
    }
}