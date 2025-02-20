package interfaces.Ejercicio1;

public class Pelicula implements Reproducible {
    String duracion;

    public Pelicula(String duracion){
        this.duracion=duracion;
    }

    public void reproducir(){
        System.out.println("La pelicula se esta reproduciendo");
    }
    public void pausar(){
        System.out.println("La pelicula se pauso");
    }
    public void detener(){
        System.out.println("La pelicula se detuvo");
    }
}
