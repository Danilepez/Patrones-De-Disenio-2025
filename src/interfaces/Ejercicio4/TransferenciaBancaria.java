package interfaces.Ejercicio4;

public class TransferenciaBancaria implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("Pago de " + monto + " realizado por transferencia bancaria.");
    }
}

