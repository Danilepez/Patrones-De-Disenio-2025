package interfaces.Ejercicio4;

public class PayPal implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("Pago de " + monto + " realizado con PayPal.");
    }
}
