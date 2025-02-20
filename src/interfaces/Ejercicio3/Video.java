package interfaces.Ejercicio3;

public class Video implements Interactuable {
    public void comentar(String comentario) {
        System.out.println("Comentario en video: " + comentario);
    }
    public void reaccionar(String tipoReaccion) {
        System.out.println("Reacción en video: " + tipoReaccion);
    }
    public void compartir() {
        System.out.println("Video compartido.");
    }
}
