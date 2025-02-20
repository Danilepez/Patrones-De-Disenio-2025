package interfaces.Ejercicio4;

public class TarjetaCredito implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("Pago de " + monto + " realizado con tarjeta de crédito.");
    }
}
