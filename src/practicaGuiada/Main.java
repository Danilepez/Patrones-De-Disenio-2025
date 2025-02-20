package practicaGuiada;
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Daniel", "12345", "Regla 1");
        Empleado empleado = new Empleado("Juan", "12345", "Regla 2");
        SistemaDeSeguridad sistema = new SistemaDeSeguridad(empleado);
        sistema.acceder("Juan", "12345", "Regla 2");
    }
}