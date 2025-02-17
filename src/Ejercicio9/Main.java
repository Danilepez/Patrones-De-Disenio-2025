package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = {
            new Producto("Producto 1", "Categoria 1", 100),
            new Producto("Producto 2", "Categoria 2", 200),
            new Producto("Producto 3", "Categoria 3", 300),
            new Producto("Producto 4", "Categoria 4", 400),
            new Producto("Producto 5", "Categoria 5", 500)
        };

        SistemaRecomendaciones sistema = new SistemaRecomendaciones();
        sistema.sugerirProductos(new UsuarioRegular(), productos);
    }
}
