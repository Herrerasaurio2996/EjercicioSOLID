package Corregido;

public class GenerarRecibo {

    public String generar(Pedido pedido) {
        return "Recibo de " + pedido.getCliente()
                + ": $" + pedido.calcularTotal();
    }
}