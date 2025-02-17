package Ejercicio10;

public class Hotel implements Reservable, Calificable {
    public void reservar(String fecha) {
        System.out.println("Habitación de hotel reservada para " + fecha);
    }
    public void cancelarReserva() {
        System.out.println("Reserva de hotel cancelada.");
    }
    public void calificar(int estrellas) {
        System.out.println("Hotel calificado con " + estrellas + " estrellas.");
    }
}
