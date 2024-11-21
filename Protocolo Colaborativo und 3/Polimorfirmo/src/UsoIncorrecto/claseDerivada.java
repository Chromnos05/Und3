/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UsoIncorrecto;

/**
 *
 * @author Oscar Mercado
 */
public class claseDerivada extends claseBase{
    
    @Override
    public void metodoBase() {
        System.out.println("Método sobrescrito en la clase derivada.");
    }

    public void metodoUnico() {
        System.out.println("Método único de la clase derivada.");
    }
    
}
