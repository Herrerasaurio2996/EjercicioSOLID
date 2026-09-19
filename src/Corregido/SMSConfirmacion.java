package Corregido;

public class SMSConfirmacion implements Notificacion{
    
    @Override
    public void enviar(String mensaje) {

        System.out.println("Enviando SMS de confirmacion a " + mensaje + "...");

    }

}
