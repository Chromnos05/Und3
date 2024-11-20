/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Empleados;

/**
 *
 * @author Oscar Mercado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear un objeto de tipo Gerente
        Empleado gerente = new Gerente("Juan Perez", "45", 5000, 1000);
        gerente.mostrarDetalles(); // Muestra los detalles del gerente

        System.out.println();

        // Crear un objeto de tipo Vendedor
        Empleado vendedor = new Vendedor("Maria Lopez", "30", 20000, 0.05);
        vendedor.mostrarDetalles(); // Muestra los detalles del vendedor
        
    }
    
}
