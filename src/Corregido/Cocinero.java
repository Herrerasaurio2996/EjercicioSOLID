package Corregido;

/** 
 * Representa el comportamiento específico de un cocinero. 
 * 
 * Problema que resuelve: 
 * La implementación anterior obligaba al cocinero a declarar métodos como 
 * atenderMesa(), repartirPedido() y cobrarEnCaja(), terminando en 
 * UnsupportedOperationException. 
 * 
 * Solución: 
 * Cocinero implementa únicamente ICocinero y proporciona solo la operación 
 * que realmente corresponde a su rol. 
 * 
 * SOLID: 
 * - ISP: evita implementar métodos que no pertenecen al rol del cocinero. 
 * - SRP: concentra el comportamiento propio de cocinar.
 */

public class Cocinero implements ICocinero{

    @Override
    public void cocinar() {

        System.out.println("El cocinero prepara el plato.");

    }
    
}
