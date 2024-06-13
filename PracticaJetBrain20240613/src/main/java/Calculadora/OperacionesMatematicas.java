package Calculadora;

public class OperacionesMatematicas {

    public double calcularRaizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }

}
