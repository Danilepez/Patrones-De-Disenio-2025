package Ejercicio3;

public class Articulo implements Interactuable {
    public void comentar(String comentario) {
        System.out.println("Comentario en artículo: " + comentario);
    }
    public void reaccionar(String tipoReaccion) {
        System.out.println("Reacción en artículo: " + tipoReaccion);
    }
    public void compartir() {
        System.out.println("Artículo compartido.");
    }
}
