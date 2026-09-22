package Corregido;

/** 
 * Coordina el envío de una confirmación mediante un mecanismo concreto. 
 * 
 * Problema que resuelve: 
 * En la propuesta inicial, Pedido estaba directamente acoplado al envío 
 * de correo. Si se necesitaba SMS u otro medio, habría que seguir agregando 
 * métodos dentro de Pedido.  (Violacion SRP y OCP)
 * 
 * Solución: 
 * La responsabilidad de enviar una confirmación se separa de Pedido. 
 * Confirmacion recibe el mecanismo que utilizará para realizar el envío. 
 * 
 * SOLID: 
 * - SRP: separa la coordinación de confirmaciones de la entidad Pedido. 
 * - DIP: recibe una dependencia para realizar la confirmación en lugar de 
 * concentrar directamente toda la lógica de comunicación. 
 */

public class Confirmacion {
    
    private Notificacion notificacion;

    Confirmacion(Notificacion notificacion) {

        this.notificacion = notificacion;

    }
    
    public void enviarConfirmacion(String mensaje) {

        notificacion.enviar(mensaje);
            
    }
}
