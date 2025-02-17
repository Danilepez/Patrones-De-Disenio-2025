package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Facturable facturaFisica = new FacturaFisica();
        Facturable facturaElectronica = new FacturaElectronica();
        MetodoPago tarjeta = new TarjetaCredito();
        MetodoPago paypal = new PayPal();
        MetodoPago transferencia = new TransferenciaBancaria();

        facturaFisica.generarFactura();
        facturaElectronica.generarFactura();
        tarjeta.procesarPago(1000);
        paypal.procesarPago(1000);
        transferencia.procesarPago(1000);
        Compra compra1 = new Compra(tarjeta, facturaFisica, 1000);
        Compra compra2 = new Compra(paypal, facturaElectronica, 1000);
        compra1.procesarCompra();
        compra2.procesarCompra();
    }
}
