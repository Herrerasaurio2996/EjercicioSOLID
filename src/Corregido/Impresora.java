package Corregido;

/**
 * Abstracción para dispositivos capaces de imprimir recibos.
 *
 * Permite utilizar diferentes tipos de impresoras sin acoplar el sistema
 * a una implementación concreta o modificar el codigo pre-existente. (DIP y OCP)
 *
 * Aplica:
 * - DIP: los servicios dependen de esta abstracción.
 * - OCP: permite agregar nuevas impresoras.
 */

public interface Impresora {

    void imprimir(String texto);
    
}
