package Corregido;

/** 
 * Representa la abstracción para los métodos de pago.
 * 
 * Problema que resuelve: 
 * El sistema necesita manejar diferentes formas de pago sin que el código 
 * que procesa un pago tenga que conocer los detalles de cada una.
 * 
 * Solución: 
 * Se define una operación común cobrar(). Cada método de pago implementa 
 * esta operación según su propia lógica. 
 * 
 * SOLID: 
 * - OCP: se pueden agregar nuevos métodos de pago sin modificar los existentes. 
 * - LSP: cualquier implementación puede utilizarse donde se espere un MetodoPago. 
 * - DIP: el código que procesa pagos puede depender de esta abstracción. 
  */

public interface MetodoPago {
    
    void cobrar(double monto);

}
