package Corregido;

/** 
* Implementa la política de descuento para clientes estudiantes.
* 
 * Problema que resuelve:
 * En la propuesta inicial, la regla del cliente Estudiante estaba dentro de Pedido,
 * haciendo que esa clase tuviera que modificarse cuando cambiaban o aparecían
 * nuevas reglas de descuento. (Violacion OCP)
 *
 * Solución:
 * La regla Estudiante se encapsula en una clase independiente que implementa
 * Descuento. De esta forma, Pedido simplemente utiliza la estrategia recibida
 * sin conocer cómo se calcula el descuento.
* 
* SOLID: 
* - SRP: contiene únicamente la regla de descuento para estudiantes.
* - OCP: permite extender el sistema agregando una nueva estrategia. 
* - LSP: puede sustituir a cualquier implementación de Descuento. 
*/

public class DescuentoEstudiante implements Descuento{

    @Override
    public double aplicar(double subtotal) {

        return subtotal * 0.4;

    }
}