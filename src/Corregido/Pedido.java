package Corregido;

/** 
 * Representa la entidad principal de un pedido. 
 * 
 * Problema que resuelve: 
 * En la propuesta inicial, Pedido tenía varias responsabilidades que no le
 * correspondían: calcular descuentos, guardar en la base de datos, imprimir 
 * recibos y enviar correos. Además, conocía directamente cada tipo de cliente.
 * 
 * Solución:
 * Pedido conserva únicamente la información y operaciones propias del pedido.
 * El cálculo del descuento se delega a una estrategia Descuento, mientras que
 * la persistencia, impresión y notificación se manejan desde clases separadas.
 * 
 * SOLID:
 * - SRP: Pedido se concentra en administrar el pedido y calcular su subtotal.
 * - OCP: se pueden agregar nuevas estrategias de descuento sin modificar Pedido.
 * - DIP: Pedido depende de la abstracción Descuento y no de una implementación concreta.
 */

// ==========================================================
// Sistema de gestión de pedidos de un restaurante (versión CON violaciones)
// ==========================================================

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String cliente;
    private Descuento descuento;
    private List<String> platos = new ArrayList<>();
    private List<Double> precios = new ArrayList<>();

    Pedido(Descuento descuento) {

        this.descuento = descuento;

    }

    public void agregarPlato(String nombre, double precio) {
        platos.add(nombre);
        precios.add(precio);
    }

    public String getCliente() {return this.cliente;}

    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setDescuento(Descuento descuento) { this.descuento = descuento; }


    public double calcularTotal() {
        double subtotal = 0;
        for (double precio : precios) {
            subtotal += precio;
        }

        return descuento.aplicar(subtotal);
    }
}

/**
 * Punto de entrada de la aplicación.
 *
 * Coordina la creación y colaboración entre objetos sin concentrar la lógica
 * de pedidos, descuentos, pagos, persistencia o notificaciones.
 *
 * Aplica:
 * - SRP: la aplicación solo coordina el flujo principal.
 * - DIP: utiliza abstracciones en lugar de depender directamente de detalles.
 */