package Corregido;

/**
 * Define el comportamiento específico de los pagos realizados con puntos.
 *
 * Separa la regla de validación y consumo de puntos de los demás métodos
 * de pago.
 *
 * Aplica:
 * - SRP: gestiona únicamente pagos con puntos.
 * - OCP: incorpora una modalidad de pago independiente.
 */

public interface MetodoPagoConPuntos {
    
    boolean tieneSaldo(double monto);

    void cobrar(double monto);
    
}
