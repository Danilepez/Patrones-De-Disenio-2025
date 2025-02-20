package interfaces.Ejercicio10;

public class Departamento implements Reservable {
    public void reservar(String fecha) {
        System.out.println("Departamento reservado para " + fecha);
    }
    public void cancelarReserva() {
        System.out.println("Reserva de departamento cancelada.");
    }
}
