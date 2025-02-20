package interfaces.Ejercicio2;

public class PedidoDomicilio implements Pedido {
    private Repartidor repartidor;

    public PedidoDomicilio(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public void preparar() {
        System.out.println("Preparando pedido para domicilio.");
    }
    public void entregar() {
        repartidor.repartir();
        System.out.println("Pedido en camino al domicilio.");
    }
}
