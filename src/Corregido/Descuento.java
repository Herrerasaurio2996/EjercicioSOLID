package Corregido;

/**
 * Representa el metodo (can do) de descuento que puede utilizar un pedido.
 *
 * Problema que resuelve:
 * En la propuesta inicial, Pedido tenía que conocer todos los tipos de cliente
 * y decidir el descuento mediante if/else. Esto obligaba a modificar Pedido
 * cada vez que aparecía un nuevo tipo de cliente. (Violacion OCP)
 *
 * Solución:
 * Se crea una abstracción Descuento que permite que cada regla de descuento
 * tenga su propia implementación. Pedido solo conoce la abstracción y delega
 * en ella el cálculo del descuento.
 *
 * SOLID:
 * - OCP: permite agregar nuevos descuentos creando nuevas clases sin modificar Pedido.
 * - SRP: separa la responsabilidad de calcular descuentos de la gestión del pedido.
 * - DIP: Pedido depende de la abstracción Descuento y no de descuentos concretos.
 */

public interface Descuento {
    
    double aplicar(double subtotal);

}
