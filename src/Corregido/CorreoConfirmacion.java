package Corregido;

public class CorreoConfirmacion implements Notificacion{
    
    @Override
    public void enviar(String mensaje) {

        System.out.println("Enviando correo de confirmación a " + mensaje + "...");

    }
}
