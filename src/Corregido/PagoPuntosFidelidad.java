package Corregido;

/** 
 * Implementa el pago utilizando puntos de fidelidad.
 * 
 * Problema que resuelve: 
 * En la propuesta inicial, esta subclase heredaba de MetodoPago pero no 
 * podía cumplir siempre correctamente el comportamiento esperado por la 
 * abstracción, ya que podía rechazar el cobro lanzando una excepción. 
 * 
 * Solución: 
 * Se incorpora una operación tieneSaldo() para comprobar previamente si 
 * existen suficientes puntos. De esta manera, el código cliente puede 
 * validar la condición antes de solicitar el cobro. 
 * 
 * SOLID: 
 * - LSP: la implementación mantiene el contrato de MetodoPago cuando se 
 * llama a cobrar con un monto que puede cubrir. 
 * - SRP: la clase administra únicamente el comportamiento del pago con puntos.
 */

public class PagoPuntosFidelidad implements MetodoPagoConPuntos{

    private double puntosDisponibles = 200000.0;

    @Override
    public boolean tieneSaldo(double monto) {

        return monto <= puntosDisponibles;

    }

    public void cobrar(double monto) {

        puntosDisponibles -= monto;

        System.out.println("Cobrando $" + monto + " con puntos de fidelidad.");
        System.out.println("Puntos restantes: " + puntosDisponibles);

    }
    
}
