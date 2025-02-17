package Ejercicio7;

public class Inventario {
    void gestionarProducto(Producto producto) {
        System.out.println("Precio: " + producto.obtenerPrecio() + ", Stock: " + producto.obtenerStock());
    }
}
