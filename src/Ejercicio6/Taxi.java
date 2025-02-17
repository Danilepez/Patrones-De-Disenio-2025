package Ejercicio6;

public class Taxi implements TransportePublico, Conductor {
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Taxi iniciando viaje de " + origen + " a " + destino);
    }
    public void calcularTarifa() {
        System.out.println("Tarifa del taxi calculada.");
    }
    public void aceptarPasajero() {
        System.out.println("Pasajero aceptado en taxi.");
    }
    public void finalizarViaje() {
        System.out.println("Viaje en taxi finalizado.");
    }
}
