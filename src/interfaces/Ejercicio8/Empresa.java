package interfaces.Ejercicio8;

public class Empresa {
    void gestionarEmpleado(Empleado empleado) {
        System.out.println("Cargo: " + empleado.obtenerCargo() + ", Salario: " + empleado.calcularSalario());
    }
}

