package Corregido;

/** 
 * Representa el mecanismo concreto para enviar confirmaciones por correo. 
 * 
 * Problema que resuelve: 
 * En la propuesta inicial, Pedido contenía directamente la lógica de envío 
 * de correos, mezclando la gestión del pedido con las notificaciones. 
 * 
 * Solución: 
 * El envío de correo se encapsula en una clase independiente y puede ser 
 * utilizado por una clase de coordinación de confirmaciones. 
 * 
 * SOLID: 
 * - SRP: se ocupa únicamente de enviar confirmaciones por correo. 
 * - DIP: puede utilizarse como dependencia de la abstracción de confirmación.
 */

public class CorreoConfirmacion implements Notificacion{
    
    @Override
    public void enviar(String mensaje) {

        System.out.println("Enviando correo de confirmación a " + mensaje + "...");

    }
}
