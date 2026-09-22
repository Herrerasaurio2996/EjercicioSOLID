package Corregido;

/** 
 * Se encarga de almacenar un pedido en el sistema de "persistencia". 
 * 
 * Problema que resuelve: 
 * En la propuesta inicial, Pedido tenía el método guardarEnBaseDeDatos(), 
 * por lo que la entidad debía conocer detalles relacionados con la 
 * persistencia y la base de datos, a su vez de que se le estaba encargando 
 * dicha responsabilidad a la clase Pedido. (Violacion SRP) 
 * 
 * Solución: 
 * La responsabilidad de guardar pedidos se extrae a una clase independiente. 
 * Pedido ya no necesita saber cómo se conecta o cómo se almacena la información. 
 * 
 * SOLID: 
 * - SRP: la persistencia tiene su propia responsabilidad y clase. 
 * - DIP: permite que Pedido no dependa directamente de detalles de la BD. 
 */

//REVISAR (2): La responsabilidad de guardar la informacion del pedido ahora esta en su clase propia
public class PedidoRepositorio {
    
    public void guardar() {
        System.out.println("Conectando a la BD...");
        System.out.println("INSERT INTO pedidos VALUES (...)");
    }

}
