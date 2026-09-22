package Corregido;

/** 
 * Representa el mecanismo concreto para enviar confirmaciones por SMS. 
 * 
 * Problema que resuelve: 
 * Agregar nuevos medios de comunicación directamente dentro de Pedido 
 * aumentaría las responsabilidades de esa clase. 
 * 
 * Solución: 
 * El envío de SMS se encapsula en una clase especializada, independiente 
 * de la entidad Pedido. 
 * 
 * SOLID: 
 * - SRP: se ocupa únicamente del envío de confirmaciones mediante SMS. 
 * - OCP: se pueden incorporar otros medios de comunicación sin modificar Pedido.
 */

public class SMSConfirmacion implements Notificacion{
    
    @Override
    public void enviar(String mensaje) {

        System.out.println("Enviando SMS de confirmacion a " + mensaje + "...");

    }

}
