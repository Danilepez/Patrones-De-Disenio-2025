package interfaces.Ejercicio7;

public class Alimento implements Producto, Almacenable {
    private double precio;
    private int stock;
    private String fechaCaducidad;

    public Alimento(double precio, int stock, String fechaCaducidad) {
        this.precio = precio;
        this.stock = stock;
        this.fechaCaducidad = fechaCaducidad;
    }

    public double obtenerPrecio() { return precio; }
    public int obtenerStock() { return stock; }
    public void guardarEnBodega() {
        if (fechaCaducidad.equals("2025-02-11")) {
            System.out.println("Alimento no vencido, guardado en bodega.");
        } else {
            System.out.println("Alimento vencido, no guardado en bodega.");
        }
    }
    public void retirarDeBodega() {
        if (!fechaCaducidad.equals("2025-02-11")) {
            System.out.println("Alimento vencido, retirado de bodega.");
        } else {
            System.out.println("Alimento no vencido, no retirado de bodega.");
        }
    }
}

