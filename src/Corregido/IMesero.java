package Corregido;

/** 
 * Define únicamente las operaciones que corresponden a un mesero. 
 * 
 * Problema que resuelve: 
 * En la propuesta inicial existía una única interfaz Empleado que obligaba 
 * a todos los trabajadores a implementar atenderMesa(), cocinar(), 
 * repartirPedido() y cobrarEnCaja(), aunque muchos roles no realizaran 
 * esas actividades. 
 * 
 * Solución: 
 * Se divide la interfaz grande en interfaces pequeñas y específicas. 
 * El mesero solo implementa las capacidades que realmente necesita. 
 * 
 * SOLID: 
 * - ISP: los clientes no están obligados a depender de métodos que no utilizan. 
 */

public interface IMesero {
    
    void atenderMesa();

}
