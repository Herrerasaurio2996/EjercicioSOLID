package Corregido;

public class Confirmacion {
    
    private Notificacion notificacion;

    Confirmacion(Notificacion notificacion) {

        this.notificacion = notificacion;

    }
    
    public void enviarConfirmacion(String mensaje) {

        notificacion.enviar(mensaje);
            
    }
}
