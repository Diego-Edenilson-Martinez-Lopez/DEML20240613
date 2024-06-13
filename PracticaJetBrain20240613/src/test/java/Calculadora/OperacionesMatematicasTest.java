package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasTest {

    @org.junit.jupiter.api.Test
    public void testCalcularRaizCuadrada() {
        OperacionesMatematicas operaciones = new OperacionesMatematicas();

        // Caso 1: Raíz cuadrada de un número positivo
        double resultadoPositivo = operaciones.calcularRaizCuadrada(25.0);
        assertEquals(5.0, resultadoPositivo, 0.0001);

        // Caso 2: Raíz cuadrada de cero
        double resultadoCero = operaciones.calcularRaizCuadrada(0.0);
        assertEquals(0.0, resultadoCero, 0.0001);

        // Caso 3: Raíz cuadrada de un número negativo (debe lanzar una excepción)
        assertThrows(IllegalArgumentException.class, () -> {
            operaciones.calcularRaizCuadrada(-25.0);
        });
    }

}