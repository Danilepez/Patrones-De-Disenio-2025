package interfaces.Ejercicio5;

public class Estudiante {
    void inscribirse(Curso curso) {
        System.out.println("Estudiante inscrito en el curso.");
        curso.iniciar();
    }
    void completarCurso(Curso curso) {
        curso.completar();
    }
}
