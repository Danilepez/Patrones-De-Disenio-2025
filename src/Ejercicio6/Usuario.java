package Ejercicio6;

public class Usuario {
    void solicitarViaje(TransportePublico transporte, String origen, String destino) {
        transporte.iniciarViaje(origen, destino);
        transporte.calcularTarifa();
        if (transporte instanceof Conductor) {
            ((Conductor) transporte).aceptarPasajero();
            ((Conductor) transporte).finalizarViaje();
        }
    }
}
