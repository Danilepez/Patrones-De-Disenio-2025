package Ejercicio3;

public class Usuario {
    public void interactuar(Interactuable publicacion, String comentario, String reaccion) {
        publicacion.comentar(comentario);
        publicacion.reaccionar(reaccion);
        publicacion.compartir();
    }
}