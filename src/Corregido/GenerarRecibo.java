package Corregido;

/** 
 * Genera el contenido textual de un recibo a partir de un pedido. 
 * 
 * Problema que resuelve: 
 * En la propuesta inicial, Pedido calculaba el total y además se encargaba 
 * de preparar información para imprimir un recibo. (Violacion SRP)
 * 
 * Solución: 
 * La generación del contenido del recibo se separa de la entidad Pedido. 
 * Esta clase transforma la información del pedido en el texto necesario. 
 * 
 * SOLID: 
 * - SRP: su única responsabilidad es generar el contenido del recibo. 
 * - OCP: el formato puede evolucionar sin modificar Pedido. 
 */

public class GenerarRecibo {

    public String generar(Pedido pedido) {
        return "Recibo de " + pedido.getCliente()
                + ": $" + pedido.calcularTotal();
    }
}