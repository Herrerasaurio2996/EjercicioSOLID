package Corregido;

/**
 * Aplica la regla de descuento para clientes VIP.
 *
 * Problema que resuelve:
 * En la propuesta inicial, la regla del cliente VIP estaba dentro de Pedido,
 * haciendo que esa clase tuviera que modificarse cuando cambiaban o aparecían
 * nuevas reglas de descuento. (Violacion OCP)
 *
 * Solución:
 * La regla VIP se encapsula en una clase independiente que implementa
 * Descuento. De esta forma, Pedido simplemente utiliza la estrategia recibida
 * sin conocer cómo se calcula el descuento.
 *
 * SOLID:
 * - SRP: la clase tiene una única responsabilidad: calcular el descuento VIP.
 * - OCP: se pueden agregar otras estrategias sin modificar Pedido.
 * - LSP: puede utilizarse en cualquier lugar donde se espere un Descuento.
 */

public class DescuentoVIP implements Descuento{

    @Override
    public double aplicar(double subtotal) {

        return subtotal * 0.9;

    }

}
