package interfaces.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        CursoExamen cursoExamen = new CursoExamen();
        cursoExamen.iniciar();
        cursoExamen.calificar(100);

        CursoPDF cursoPDF = new CursoPDF();
        CursoVideo cursoVideo = new CursoVideo();

        Estudiante estudiante = new Estudiante();
        estudiante.inscribirse(cursoExamen);
        estudiante.completarCurso(cursoPDF);
        estudiante.completarCurso(cursoVideo);

    }
}
