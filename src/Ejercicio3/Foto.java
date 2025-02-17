package Ejercicio3;

public class Foto implements Interactuable {
    public void comentar(String comentario) {
        System.out.println("Comentario en foto: " + comentario);
    }
    public void reaccionar(String tipoReaccion) {
        System.out.println("Reacción en foto: " + tipoReaccion);
    }
    public void compartir() {
        System.out.println("Foto compartida.");
    }
}
