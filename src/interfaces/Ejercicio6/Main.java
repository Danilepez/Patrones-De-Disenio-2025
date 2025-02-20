package interfaces.Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        TransportePublico taxi = new Taxi();
        TransportePublico bus = new Bus();
        TransportePublico bicicleta = new BicicletaCompartida();

        usuario.solicitarViaje(taxi, "Centro", "Aeropuerto");
        usuario.solicitarViaje(bus, "Plaza", "Universidad");
        usuario.solicitarViaje(bicicleta, "Parque", "Gimnasio");
    }
}
