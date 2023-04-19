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
public class sumanumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3; // creamos las variables enteras
        Scanner leernum = new Scanner(System.in); //creamos el scanner
        System.out.println("Ingrese los dos numeros a sumar, por favor"); //pedimos los numeros sout+tab
        num1 = leernum.nextInt(); //cargamos num1
        num2 = leernum.nextInt(); //cargamos num2
        num3 = num1 + num2; //los sumamos
        System.out.println("El valor de la suma de los numeros ingresados es " + num3);//mostramos en pantalla
                
    }
    
}
