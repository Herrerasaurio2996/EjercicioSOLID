package Corregido;

/** 
 * Se encarga de enviar un recibo a una impresora. 
 * 
 * Problema que resuelve: 
 * En la propuesta inicial, Pedido creaba directamente una ImpresoraTermica 
 * y se encargaba de imprimir el recibo. Esto mezclaba la gestión del pedido 
 * con un detalle concreto de infraestructura, a su vez, se cargaba a Pedido
 * con otra responsabilidad y su funcionamiento dependia de una implementacion
 * concreta. (Violacion SRP y DIP) 
 * 
 * Solución: 
 * La impresión se separa en una clase especializada que recibe una 
 * ImpresoraTermica y delega en ella la operación física de imprimir. 
 * 
 * SOLID: 
 * - SRP: administra la operación de impresión del pedido. 
 * - DIP: recibe la dependencia de impresión en lugar de crearla internamente. 
 */

public class PedidoImpresion {
    
    private Impresora impresora;

    PedidoImpresion(Impresora impresora) {

        this.impresora = impresora;

    }

    public void impresion(String recibo) {

        impresora.imprimir(recibo);

    }

}