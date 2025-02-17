package Ejercicio1;

import java.util.LinkedList;

public class Usuario {
    public void agregarReproducible(Reproducible reproducible){
        LinkedList<Reproducible> lista = new LinkedList<>();
        lista.add(reproducible);
        System.out.println("Se agrego el reproducible: " + reproducible);
    }
}
