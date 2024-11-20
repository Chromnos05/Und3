/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Oscar Mercado
 */
public class Rectangulo extends Figura{
    
    private double ancho;
    private double alto;

    // Constructor para inicializar el ancho y el alto
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Implementación del método calcularArea para un rectángulo
    @Override
    public double calcularArea() {
        return ancho * alto; // Fórmula para el área de un rectángulo
    }
    
}
