package interfaces.Ejercicio1;

public class Serie implements Reproducible {
    int cant_episodios;

    public Serie(int cant_episodios){
        this.cant_episodios=cant_episodios;
    }

    public void reproducir(){
        System.out.println("La serie se esta reproduciendo");
    }
    public void pausar(){
        System.out.println("La serie se pauso");
    }
    public void detener(){
        System.out.println("La serie se detuvo");
    }
}
