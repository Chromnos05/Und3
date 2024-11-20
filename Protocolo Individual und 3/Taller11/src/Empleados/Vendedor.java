/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author Oscar Mercado
 */
public class Vendedor extends Empleado{
    
    private double ventasMensuales;
    private double comisionPorVenta;

    // Constructor para inicializar ventas mensuales y comisión por venta
    public Vendedor(String nombre, String edad, double ventasMensuales, double comisionPorVenta) {
        super(nombre, edad);
        this.ventasMensuales = ventasMensuales;
        this.comisionPorVenta = comisionPorVenta;
    }

    // Implementación del método calcularSalario para un vendedor
    @Override
    public double calcularSalario() {
        return ventasMensuales * comisionPorVenta; // El salario de un vendedor es la comisión por las ventas
    }
    
}
