package Corregido;

/** 
 * Implementa la política de descuento para clientes regulares.
 * 
 * Problema que resuelve:
 * En la propuesta inicial, la regla del cliente Regular estaba dentro de Pedido,
 * haciendo que esa clase tuviera que modificarse cuando cambiaban o aparecían
 * nuevas reglas de descuento. (Violacion OCP)
 *
 * Solución:
 * La regla Regular se encapsula en una clase independiente que implementa
 * Descuento. De esta forma, Pedido simplemente utiliza la estrategia recibida
 * sin conocer cómo se calcula el descuento.
 * 
 * SOLID: 
 * - SRP: la clase se encarga únicamente de la política regular. 
 * - OCP: la política puede cambiarse o ampliarse sin modificar Pedido. 
 * - LSP: cumple el contrato definido por Descuento. 
 */

public class DescuentoRegular implements Descuento {

    @Override
    public double aplicar(double subtotal) {

        return subtotal;

    }
}