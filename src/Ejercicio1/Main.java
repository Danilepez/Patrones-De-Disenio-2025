package Ejercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("2 horas");
        Documental documental = new Documental("Historia");
        Serie serie = new Serie(10);
        Usuario usuario = new Usuario();
        usuario.agregarReproducible(pelicula);
        usuario.agregarReproducible(documental);
        usuario.agregarReproducible(serie);
    }
}