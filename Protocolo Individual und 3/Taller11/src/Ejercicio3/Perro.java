/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Oscar Mercado
 */
public class Perro extends Animal{
    
    // Sobrescritura del método abstracto
    @Override
    public void comer() {
        System.out.println("El perro esta comiendo.");
    }

    // Intentar sobrescribir el método concreto
    @Override
    public void hacerSonido() {  // Esto no es necesario, pero lo hago para demostrar
        System.out.println("El perro hace guau.");
    }
    
}
