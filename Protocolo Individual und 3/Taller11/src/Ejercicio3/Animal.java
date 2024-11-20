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
    
    // Método abstracto (sin implementación)
    public abstract void hacerSonido();

    // Método concreto (con implementación)
    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }
    
}
