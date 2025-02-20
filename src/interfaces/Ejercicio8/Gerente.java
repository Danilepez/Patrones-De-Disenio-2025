package interfaces.Ejercicio8;

public class Gerente implements Empleado, Bonificable {
    private double salarioBase;

    public Gerente(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() { return salarioBase * 1.5; }
    public String obtenerCargo() { return "Gerente"; }
    public double calcularBono() { return salarioBase * 0.2; }
}
