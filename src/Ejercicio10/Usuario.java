package Ejercicio10;

public class Usuario {
    void hacerReserva(Reservable alojamiento, String fecha) {
        alojamiento.reservar(fecha);
    }
    void cancelarReserva(Reservable alojamiento) {
        alojamiento.cancelarReserva();
    }
}
