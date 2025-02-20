package interfaces.Ejercicio2;

public class PedidoEnMesa implements Pedido {
    public void preparar() {
        System.out.println("Preparando pedido en mesa.");
    }
    public void entregar() {
        System.out.println("Pedido servido en la mesa.");
    }
}
