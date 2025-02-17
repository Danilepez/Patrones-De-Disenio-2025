package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Empleado admin = new Administrativo(2500);
        Empleado tecnico = new Tecnico(2800);
        Empleado gerente = new Gerente(5000);

        empresa.gestionarEmpleado(admin);
        empresa.gestionarEmpleado(tecnico);
        empresa.gestionarEmpleado(gerente);}
}
