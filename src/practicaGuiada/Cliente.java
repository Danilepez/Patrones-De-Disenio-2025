package practicaGuiada;

public class Cliente implements Autenticable {
    public String usuario;
    public String contrasena;
    public String reglas;

    public Cliente(String usuario, String contrasena, String reglas) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.reglas = reglas;
    }

    public boolean iniciarSesion(String usuario, String contrasena) {
        return this.usuario.equals(usuario) && this.contrasena.equals(contrasena);
    }

    public void cerrarSesion() {
        System.out.println("El cliente ha cerrado sesión");
    }
}
