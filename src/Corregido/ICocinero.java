package Corregido;

/** 
 * Define únicamente la capacidad de cocinar. 
 * 
 * Problema que resuelve: 
 * La interfaz Empleado original obligaba al cocinero a implementar métodos 
 * relacionados con otras funciones que no eran responsabilidad de su rol. 
 * 
 * Solución: 
 * Se crea una interfaz específica para cocinar. 
 * 
 * SOLID: 
 * - ISP: cada clase depende únicamente de las operaciones que necesita.
 */

public interface ICocinero {
    
    void cocinar();

}
