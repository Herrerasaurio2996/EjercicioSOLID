package Corregido;

/** 
 * Implementa el pago mediante efectivo. 
 * 
 * Problema que resuelve: 
 * El efectivo tiene una forma de procesamiento diferente a otros métodos 
 * de pago y no debería estar mezclado con las reglas de los demás. 
 * 
 * Solución: 
 * Se encapsula su comportamiento en una clase independiente que cumple 
 * el contrato de MetodoPago. 
 * 
 * SOLID: 
 * - SRP: maneja únicamente el cobro en efectivo. 
 * - OCP: se pueden agregar otros métodos sin modificar esta clase. 
 * - LSP: puede utilizarse donde se espere un MetodoPago.
 */

public class PagoEfectivo implements MetodoPago{
    
    @Override
    public void cobrar(double monto) {

        System.out.println("Cobrando $" + monto + " en efectivo.");

    }
    
}
