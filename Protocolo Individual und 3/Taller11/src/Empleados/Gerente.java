/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author Oscar Mercado
 */
public class Gerente extends Empleado{
    
    private double salarioBase;
    private double bono;

    // Constructor para inicializar el salario base y bono
    public Gerente(String nombre, String edad, double salarioBase, double bono) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    // Implementación del método calcularSalario para un gerente
    @Override
    public double calcularSalario() {
        return salarioBase + bono; // El salario de un gerente es el salario base + bono
    }
    
}
