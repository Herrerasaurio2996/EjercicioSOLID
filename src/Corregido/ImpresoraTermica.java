package Corregido;

public class ImpresoraTermica implements Impresora{

    @Override
    public void imprimir(String texto) {

        System.out.println("[Impresora térmica] " + texto);

    }
}