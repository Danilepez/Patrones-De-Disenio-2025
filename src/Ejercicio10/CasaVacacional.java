package Ejercicio10;

public class CasaVacacional implements Reservable {
    public void reservar(String fecha) {
        System.out.println("Casa vacacional reservada para " + fecha);
    }
    public void cancelarReserva() {
        System.out.println("Reserva de casa vacacional cancelada.");
    }
}
