package Corregido;

/**
 * Representa al empleado encargado de entregar pedidos.
 *
 * Separa la responsabilidad de reparto de las actividades de cocina,
 * atención al cliente y cobro.
 *
 * Aplica:
 * - SRP: únicamente gestiona el reparto.
 * - ISP: implementa solo IRepartidor.
 */

public class Repartirdor implements IRepartidor{

    @Override
    public void repartirPedido() {

        System.out.println("El repartirdor reparte el pedido.");

    }
    
}
