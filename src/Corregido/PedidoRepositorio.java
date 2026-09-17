package Corregido;

//REVISAR (2): La responsabilidad de guardar la informacion del pedido ahora esta en su clase propia
public class PedidoRepositorio {
    
    public void guardar() {
        System.out.println("Conectando a la BD...");
        System.out.println("INSERT INTO pedidos VALUES (...)");
    }

}
