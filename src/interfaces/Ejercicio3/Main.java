package interfaces.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Articulo articulo = new Articulo();
        Video video = new Video();
        Foto foto = new Foto();
        Usuario usuario = new Usuario();
        usuario.interactuar(articulo, "¡Qué buen artículo!", "Me gusta");
        usuario.interactuar(video, "¡Qué buen video!", "Me encanta");
        usuario.interactuar(foto, "¡Qué buena foto!", "Me divierte");
    }
}
