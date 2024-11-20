/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author Oscar Mercado
 */
abstract class Empleado {
    
    private String nombre;
    private String edad;

    // Constructor para inicializar nombre y edad
    public Empleado(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método abstracto para calcular el salario (debe ser implementado por las clases derivadas)
    public abstract double calcularSalario();

    // Método para mostrar los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + calcularSalario());
    }
    
}
