package practicaGuiada;

public class Administrador implements Autenticable, Autorizable {
    public String usuario;
    public String contrasena;
    public String reglas;
    public Administrador(String usuario, String contrasena, String reglas) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.reglas = reglas;
    }
    public boolean iniciarSesion(String usuario, String contrasena) {
        return this.usuario.equals(usuario) && this.contrasena.equals(contrasena);
    }
    public void cerrarSesion() {
        System.out.println("El administrador ha cerrado sesión");
    }
    public boolean tienePermiso(String accion) {
        System.out.println("El administrador tiene permiso para " + accion);
        return true;
    }
}
