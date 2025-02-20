package practicaGuiada;

public class SistemaDeSeguridad {
    private Autenticable autenticable;

    public SistemaDeSeguridad(Autenticable autenticable) {
        this.autenticable = autenticable;
    }

    public void acceder(String usuario, String contrasena, String accion) {
        if (autenticable.iniciarSesion(usuario, contrasena)) {
            if (autenticable instanceof Autorizable autorizable && autorizable.tienePermiso(accion)) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Acceso denegado, no es autorizable");
            }
        } else {
            System.out.println("Acceso denegado");
        }
        autenticable.cerrarSesion();
    }
}