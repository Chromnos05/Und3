/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Oscar Mercado
 */
abstract class Animal {
    
    // Método concreto con implementación
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    // Método abstracto que debe ser sobrescrito
    public abstract void comer();
    
}
