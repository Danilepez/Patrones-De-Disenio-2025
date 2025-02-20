package practicaGuiada;

public interface Autenticable {
    public boolean iniciarSesion(String usuario, String contrasena);
    public void cerrarSesion();
}
