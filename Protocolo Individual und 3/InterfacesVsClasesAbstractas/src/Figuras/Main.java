/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Figuras;

/**
 *
 * @author Oscar Mercado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Figura rectangulo = new Rectangulo(5, 3);
        Figura triangulo = new Triangulo(4, 2);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        
    }
    
}
