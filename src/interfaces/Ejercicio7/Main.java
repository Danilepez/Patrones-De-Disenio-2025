package interfaces.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        // Inventario
        Inventario inventario = new Inventario();
        Producto electronico = new Electronico(1200.99, 5);
        Producto alimento = new Alimento(5.99, 20, "2025-02-11");
        Producto ropa = new Ropa(49.99, 15);

        inventario.gestionarProducto(electronico);
        inventario.gestionarProducto(alimento);
        inventario.gestionarProducto(ropa);

        if (alimento instanceof Almacenable) {
            ((Almacenable) alimento).guardarEnBodega();
            ((Almacenable) alimento).retirarDeBodega();
        }
    }
}
