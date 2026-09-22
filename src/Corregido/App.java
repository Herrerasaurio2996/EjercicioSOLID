package Corregido;

import java.util.List;

/** 
 * Punto de entrada de la aplicación. 
 * 
 * Problema que resuelve: 
 * En la propuesta inicial, Pedido concentraba muchas responsabilidades. 
 * Al separar esas responsabilidades, era necesario que alguna parte de la 
 * aplicación coordinara los diferentes objetos. 
 * 
 * Solución: 
 * App crea las dependencias y coordina el flujo principal: pedido, persistencia, 
 * recibo, impresión, notificaciones, pagos y empleados. Las reglas de negocio 
 * permanecen en las clases especializadas. 
 * 
 * SOLID: 
 * - SRP: App se encarga principalmente de iniciar y coordinar la aplicación. 
 * - DIP: trabaja con abstracciones como MetodoPago y Confirmacion cuando corresponde. 
 * 
 * Nota: * App puede tener muchas instanciaciones porque su función es precisamente 
 * ensamblar los objetos del sistema; esto no significa que deba contener 
 * la lógica interna de cada responsabilidad. 
 */

public class App {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(new DescuentoVIP());

        pedido.setCliente("Ana");
        pedido.agregarPlato("Bandeja paisa", 28000);
        pedido.agregarPlato("Limonada", 6000);
        double total = pedido.calcularTotal();

        PedidoRepositorio repo = new PedidoRepositorio();
        GenerarRecibo generador = new GenerarRecibo();
        String recibo = generador.generar(pedido);
        ImpresoraTermica impt = new ImpresoraTermica();
        PedidoImpresion impresion = new PedidoImpresion(impt);
        CorreoConfirmacion cConfirmacion = new CorreoConfirmacion();
        SMSConfirmacion sConfirmacion = new SMSConfirmacion();
        Confirmacion cNotificacion = new Confirmacion(cConfirmacion);
        Confirmacion sNotificacion = new Confirmacion(sConfirmacion);
        PagoPuntosFidelidad puntos = new PagoPuntosFidelidad();
        

        System.out.println("Total: " + total);
        repo.guardar();
        impresion.impresion(recibo);
        cNotificacion.enviarConfirmacion(pedido.getCliente());
        sNotificacion.enviarConfirmacion(pedido.getCliente());

        
        List<MetodoPago> pagosDelDia = List.of(
            new PagoTarjeta(),
            new PagoEfectivo()
        );

        if (puntos.tieneSaldo(total)) {
            puntos.cobrar(total);
        } else {
            System.out.println("No hay puntos suficientes.");
        }

        for (MetodoPago pago : pagosDelDia) {
            pago.cobrar(total);
        }


        IMesero mesero = new Mesero();
        mesero.atenderMesa();

        ICocinero cocinero = new Cocinero();
        cocinero.cocinar();

        IRepartidor repartidor = new Repartirdor();
        repartidor.repartirPedido();

        ICajero cajero = new Cajero();
        cajero.cobrarEnCaja();
    }
}