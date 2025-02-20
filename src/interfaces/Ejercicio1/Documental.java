package interfaces.Ejercicio1;

public class Documental implements Reproducible {
    String tema;

    public Documental (String tema){
        this.tema = tema;
    }

    public void reproducir(){
        System.out.println("El documental se esta reproduciendo");
    }
    public void pausar(){
        System.out.println("El documental se pauso");
    }
    public void detener(){
        System.out.println("El documental se detuvo");
    }

}
