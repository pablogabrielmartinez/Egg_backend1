/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooeextra3;

import Adivinanza.Juego;
import java.awt.AWTException;

/**
 *
 * @author luks_
 */
public class Pooeextra3 {

    /**
     * @param args the command line arguments
     * @throws java.awt.AWTException
     */
    public static void main(String[] args) throws AWTException {
        // TODO code application logic here
        Juego Juego = new Juego();
        Juego.iniciar_juego();
        System.out.println("Jugador 1 ha ganado " + Juego.getJugador1Ganadas() + " veces");
        System.out.println("Jugador 2 ha ganado " + Juego.getJugador2Ganadas() + " veces");
    }

}
    
    

