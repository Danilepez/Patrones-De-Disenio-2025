package Ejercicio6;

class Bus implements TransportePublico {
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Bus iniciando viaje de " + origen + " a " + destino);
    }
    public void calcularTarifa() {
        System.out.println("Tarifa del bus calculada.");
    }
}
