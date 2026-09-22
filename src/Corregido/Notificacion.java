package Corregido;

/**
 * Abstracción para enviar notificaciones al cliente.
 *
 * Permite utilizar correo, SMS u otros canales sin modificar el código
 * que solicita la notificación.
 *
 * Aplica:
 * - OCP: admite nuevos canales de notificación.
 * - DIP: los consumidores dependen de una abstracción.
 */

public interface Notificacion {
    
 void enviar(String mensaje);

}
