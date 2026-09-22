package Corregido;

/** 
 * Implementa el pago mediante tarjeta. 
 * 
 * Problema que resuelve: 
 * El procesamiento de tarjeta necesita comportarse de manera diferente 
 * al efectivo o a otros métodos de pago.
 * 
 * Solución: 
 * Se encapsula el comportamiento de tarjeta en una implementación concreta 
 * de MetodoPago. 
 * 
 * SOLID: 
 * - SRP: se ocupa únicamente de realizar el cobro mediante tarjeta. 
 * - OCP: puede incorporarse sin modificar MetodoPago ni otros pagos. 
 * - LSP: puede utilizarse como cualquier MetodoPago.
 */

public class PagoTarjeta implements MetodoPago{

    @Override
    public void cobrar(double monto) {

        System.out.println("Cobrando $" + monto + " con tarjeta.");

    }
    
}
