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
        
         // Crear un objeto de tipo Circulo con un radio de 5
        Figura circulo = new Circulo(15);
        circulo.mostrarArea(); // Llamamos a mostrarArea() que usa calcularArea()

        // Crear un objeto de tipo Rectangulo con ancho 4 y alto 6
        Figura rectangulo = new Rectangulo(3, 11);
        rectangulo.mostrarArea(); // Llamamos a mostrarArea() que usa calcularArea()
        
    }
    
}
