package Ejercicio2;

public class PedidoParaLlevar implements Pedido {
    public void preparar() {
        System.out.println("Preparando pedido para llevar.");
    }
    public void entregar() {
        System.out.println("Pedido para llevar listo para ser recogido.");
    }
}
