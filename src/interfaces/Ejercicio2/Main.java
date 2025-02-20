package interfaces.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        PedidoEnMesa pedidoEnMesa = new PedidoEnMesa();
        PedidoParaLlevar pedidoParaLlevar = new PedidoParaLlevar();
        Repartidor repartidor = new Ciclista();
        PedidoDomicilio pedidoDomicilio = new PedidoDomicilio(repartidor);
        restaurante.gestionarPedido(pedidoEnMesa);
        restaurante.gestionarPedido(pedidoParaLlevar);
        restaurante.gestionarPedido(pedidoDomicilio);
    }
}
