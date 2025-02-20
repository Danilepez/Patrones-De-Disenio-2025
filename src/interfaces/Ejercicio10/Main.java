package interfaces.Ejercicio10;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Hotel hotel = new Hotel();
        Departamento departamento = new Departamento();
        CasaVacacional casa = new CasaVacacional();

        usuario.hacerReserva(hotel, "2025-06-15");
        usuario.hacerReserva(departamento, "2025-07-20");
        usuario.cancelarReserva(casa);

        hotel.calificar(5);
        departamento.reservar("2025-08-10");
        casa.reservar("2025-08-25");
    }
}
