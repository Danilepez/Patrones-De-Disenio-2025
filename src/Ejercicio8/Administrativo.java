package Ejercicio8;

public class Administrativo implements Empleado {
    private double salarioBase;

    public Administrativo(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() { return salarioBase; }
    public String obtenerCargo() { return "Administrativo"; }
}