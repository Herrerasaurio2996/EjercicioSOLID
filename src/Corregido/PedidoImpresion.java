package Corregido;

public class PedidoImpresion {
    
    private Impresora impresora;

    PedidoImpresion(Impresora impresora) {

        this.impresora = impresora;

    }

    public void impresion() {

        impresora.imprimir(null);

    }

}
