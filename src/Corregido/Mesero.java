package Corregido;

/** 
 * Representa el comportamiento específico de un mesero.
 *  
 * Problema que resuelve: 
 * En la propuesta inicial, Mesero estaba obligado a implementar métodos 
 * de cocina, reparto y caja que no correspondían a su función. 
 * 
 * Solución: 
 * Mesero implementa únicamente IMesero, por lo que solo debe proporcionar 
 * el comportamiento relacionado con atender mesas. 
 * 
 * SOLID: 
 * - ISP: no se obliga al mesero a implementar operaciones innecesarias. 
 * - SRP: la clase representa únicamente las acciones propias del mesero.
 */

public class Mesero implements IMesero{

    @Override
    public void atenderMesa() {

        System.out.println("El mesero atiende la mesa.");

    }
    
}
