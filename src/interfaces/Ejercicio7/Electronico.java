package interfaces.Ejercicio7;

public class Electronico implements Producto {
    private double precio;
    private int stock;

    public Electronico(double precio, int stock) {
        this.precio = precio;
        this.stock = stock;
    }

    public double obtenerPrecio() { return precio; }
    public int obtenerStock() { return stock; }
}
