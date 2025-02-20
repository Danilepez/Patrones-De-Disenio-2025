package interfaces.Ejercicio7;

public class Ropa implements Producto {
    private double precio;
    private int stock;

    public Ropa(double precio, int stock) {
        this.precio = precio;
        this.stock = stock;
    }

    public double obtenerPrecio() { return precio; }
    public int obtenerStock() { return stock; }
}
