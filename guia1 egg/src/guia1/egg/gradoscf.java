/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1.egg;

import java.util.Scanner;

/**
 *
 * @author luks_
 */
public class gradoscf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int F, C; // creamos las variables enteras
        Scanner leer = new Scanner(System.in); //el scanner para pedir los datos
        System.out.println("Ingrese el valor de grados CENTIGRADOS;");
        C = leer.nextInt(); //aca pedimos C
        F = 32 + (9 * C/5); // hacemos la formula...
        System.out.println("El equivalente en grados Farenheit es: "+ F); // la mostramos
        
    }
    
}
        
    
    

