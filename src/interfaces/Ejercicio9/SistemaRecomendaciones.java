package interfaces.Ejercicio9;

public class SistemaRecomendaciones {
    void sugerirProductos(Recomendable usuario, Producto[] productos) {
        usuario.obtenerRecomendaciones();
        for (Producto producto : productos) {
            System.out.println(producto.nombre);
        }
    }
}
