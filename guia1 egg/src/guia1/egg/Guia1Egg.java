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
public class Guia1Egg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Hola, por favor escribe tu nombre");//poniendo sout+(tab) atajo : ESCRIBIR DE PSEINT
        nombre = leer.nextLine();//llenamos la variable nombre con lo que se escriba en la linea completa en el Scanner leer
        System.out.println("Bueno, te llamas "+ nombre + " y estas aprendiendo JAVA"); // sacamos otro sout concatenando. 
    }
    
}
   
    

