package interfaces.Ejercicio6;

public class BicicletaCompartida implements TransportePublico {
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Bicicleta compartida tomada de " + origen + " a " + destino);
    }
    public void calcularTarifa() {
        System.out.println("Tarifa de bicicleta calculada.");
    }
}
