/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooe03;

import sala.operacion;

/**
 *
 * @author luks_
 */
public class Pooe03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        operacion M1 = new operacion();

        M1.crearOperacion();
        System.out.println("Suma : " + M1.sumar() );
        System.out.println("Resta : " + M1.restar() );
        System.out.println("Dividision : " + M1.dividir() );
        System.out.println("Multiplicacion : " + M1.multiplicar() );
    }
    }
    

