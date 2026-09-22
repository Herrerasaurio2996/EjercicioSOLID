package Corregido;

/** 
 * Define la capacidad específica de cobrar en caja. 
 * 
 * Problema que resuelve: 
 * La interfaz Empleado original obligaba a trabajadores que no eran cajeros 
 * a implementar cobrarEnCaja(). 
 * 
 * Solución: 
 * Se crea una interfaz específica para esta responsabilidad. 
 * 
 * SOLID: 
 * - ISP: cada implementación depende solamente de las operaciones que realmente necesita.
 */

public interface ICajero {
    
    void cobrarEnCaja();

}
