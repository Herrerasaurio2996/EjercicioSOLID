package Corregido;

/** 
 * Implementa la política de descuento para clientes empleados. 
 * 
 * Problema que resuelve:
 * En la propuesta inicial, la regla del cliente Empleado estaba dentro de Pedido,
 * haciendo que esa clase tuviera que modificarse cuando cambiaban o aparecían
 * nuevas reglas de descuento. (Violacion OCP)
 *
 * Solución:
 * La regla Empleado se encapsula en una clase independiente que implementa
 * Descuento. De esta forma, Pedido simplemente utiliza la estrategia recibida
 * sin conocer cómo se calcula el descuento.
 * 
 * SOLID:
 * - SRP: la clase tiene una única responsabilidad: calcular el descuento empleado.
 * - OCP: se agrega esta política sin modificar Pedido.
 * - LSP: puede utilizarse donde se espere cualquier objeto Descuento.
 */

public class DescuentoEmpleado implements Descuento{

    @Override
    public double aplicar(double subtotal) {

        return subtotal * 0.5;

    }
    
}
