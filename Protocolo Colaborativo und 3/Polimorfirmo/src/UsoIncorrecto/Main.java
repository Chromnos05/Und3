/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UsoIncorrecto;

/**
 *
 * @author Oscar Mercado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        claseBase objeto = new claseDerivada();

        // Intentar invocar un método único no disponible en la clase base
        //objeto.metodoUnico(); // Esto generará un error de compilación
        
        /*
        En el código proporcionado, la línea comentada que intenta invocar objetoBase.metodoUnico() 
        generará un error de compilación. Esto se debe a cómo funciona el polimorfismo en Java y a 
        las reglas de accesibilidad de métodos.

        Contexto del error
        Tipo de referencia vs. Tipo de objeto:

        objetoBase tiene como tipo de referencia la clase Base.
        Sin embargo, el tipo del objeto instanciado es Derivada.
        En Java, el tipo de referencia determina qué métodos y propiedades 
        están disponibles en tiempo de compilación, independientemente del tipo real del objeto.

        Disponibilidad de métodos:

        El compilador revisa el tipo de referencia (Base) para determinar qué métodos se pueden invocar.
        La clase Base no tiene un método llamado metodoUnico. Aunque el objeto en sí sea una 
        instancia de Derivada (que sí tiene metodoUnico), el compilador no lo sabe porque se basa 
        en el tipo de referencia.
        Por eso, el intento de llamar a objetoBase.metodoUnico() genera un error de compilación.
        */
        
    }
    
}
