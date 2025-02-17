package Ejercicio5;

public class CursoExamen implements Curso, Evaluable {
    public void iniciar() {
        System.out.println("Iniciando examen en línea.");
    }
    public void completar() {
        System.out.println("Examen completado.");
    }
    public void calificar(int puntaje) {
        System.out.println("Examen calificado con puntaje: " + puntaje);
    }
}
