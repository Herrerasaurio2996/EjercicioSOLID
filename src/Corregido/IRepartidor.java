package Corregido;

/** 
 * Representa el comportamiento específico de un repartidor. 
 * 
 * Problema que resuelve: 
 * En la propuesta inicial, un repartidor tendría que implementar también 
 * operaciones de cocina, atención de mesas y caja aunque no fueran parte 
 * de su trabajo. 
 * 
 * Solución: 
 * La clase implementa solamente IRepartidor y, por tanto, solo debe definir 
 * repartirPedido(). 
 * 
 * SOLID: 
 * - ISP: depende únicamente de la operación necesaria para su rol. 
 * - SRP: se concentra en el reparto de pedidos. 
 */

public interface IRepartidor {

    void repartirPedido();
    
}
