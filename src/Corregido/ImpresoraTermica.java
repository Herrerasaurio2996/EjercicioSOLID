package Corregido;

/** 
 * Representa el dispositivo encargado de realizar una impresión térmica. 
 * 
 * Problema que resuelve: 
 * La propuesta inicial mezclaba el conocimiento del pedido con el detalle 
 * de cómo se realiza físicamente una impresión, a su vez dependiendo de 
 * una implementacion concreta. (Violacion DIP) 
 * 
 * Solución: 
 * El funcionamiento de la impresora queda encapsulado en su propia clase, 
 * permitiendo que las demás clases solo soliciten una impresión. 
 * 
 * SOLID: 
 * - SRP: se ocupa únicamente de la operación propia de la impresora. 
 * - DIP: puede ser recibida por PedidoImpresion en lugar de ser creada allí. 
 */

public class ImpresoraTermica implements Impresora{

    @Override
    public void imprimir(String texto) {

        System.out.println("[Impresora térmica] " + texto);

    }
}