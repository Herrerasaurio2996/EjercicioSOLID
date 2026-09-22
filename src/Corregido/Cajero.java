package Corregido;

/** 
 * Representa el comportamiento específico de un cajero. 
 * 
 * Problema que resuelve: 
 * La interfaz Empleado original obligaba al cajero a implementar operaciones 
 * que no pertenecían a su función, como cocinar o repartir pedidos. 
 * 
 * Solución: 
 * Cajero implementa únicamente ICajero y define exclusivamente la operación 
 * relacionada con cobrar en caja. 
 * 
 * SOLID: 
 * - ISP: la clase no depende de métodos innecesarios. 
 * - SRP: concentra su comportamiento en las operaciones propias del cajero. 
 */

public class Cajero implements ICajero{

    @Override
    public void cobrarEnCaja() {

        System.out.println("El cajero cobra en la caja.");

    }
    
}
