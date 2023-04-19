
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luks_
 */
public class parimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num; // creamos la variable num
         Scanner leer = new Scanner(System.in); // creamos el scanner
        System.out. println("Ingrese el numero a analizar:"); //pedimos el numero por pantalla
        num = leer. nextInt(); //guardamos el valor del scanner leer en num
        if (num % 2 ==0 ) { //condicional: si num % (mod) 2 == (igual) a cero entonces... 
System.out. println("El numero ingresado es par"); 
}else { // si no 
System.out. println("El numero ingresado es impar");
}

        
    }
    

    }
    

