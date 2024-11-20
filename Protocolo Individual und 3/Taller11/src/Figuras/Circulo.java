/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Oscar Mercado
 */
public class Circulo extends Figura{
    
    private double radio;

    // Constructor para inicializar el radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea para un círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; // Fórmula para el área de un círculo
    }
    
}
