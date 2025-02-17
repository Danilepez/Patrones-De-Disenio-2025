package Ejercicio8;

public class Tecnico implements Empleado {
    private double salarioBase;

    public Tecnico(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() { return salarioBase * 1.1; }
    public String obtenerCargo() { return "Técnico"; }
}
