package Corregido;

import java.util.List;

public class App {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.setCliente("Ana");
        pedido.setTipoCliente("VIP");
        pedido.agregarPlato("Bandeja paisa", 28000);
        pedido.agregarPlato("Limonada", 6000);

        PedidoRepositorio repo = new PedidoRepositorio();
        GenerarRecibo generador = new GenerarRecibo();
        String recibo = generador.generar(pedido);
        ImpresoraTermica impt = new ImpresoraTermica();
        PedidoImpresion impresion = new PedidoImpresion(impt);
        CorreoConfirmacion cConfirmacion = new CorreoConfirmacion();
        SMSConfirmacion sConfirmacion = new SMSConfirmacion();
        Confirmacion cNotificacion = new Confirmacion(cConfirmacion);
        Confirmacion sNotificacion = new Confirmacion(sConfirmacion);
        

        System.out.println("Total: " + pedido.calcularTotal());
        repo.guardar();
        impresion.impresion(recibo);
        cNotificacion.enviarConfirmacion(pedido.getCliente());
        sNotificacion.enviarConfirmacion(pedido.getCliente());
        // El código cliente confía en que TODO MetodoPago se puede cobrar igual...
        List<MetodoPago> pagosDelDia = List.of(
            new PagoTarjeta(),
            new PagoEfectivo(),
            new PagoPuntosFidelidad()
        );

        for (MetodoPago pago : pagosDelDia) {
            pago.cobrar(15000);  // esto revienta con PagoPuntosFidelidad si el monto supera los puntos
        }

        // El mesero queda obligado a "implementar" trabajos que no le corresponden
        Empleado mesero = new Mesero();
        mesero.atenderMesa();
    }
}