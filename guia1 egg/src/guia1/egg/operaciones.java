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
public class operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num, resu; //creamos las variables enteras 
        double resuraiz; //creamos la variable de tipo real (double=real en pseint)
        Scanner leer = new Scanner(System.in); //hacemos el scanner para tomar los datos
        
        System.out.println("Ingrese el numeo a trabajar;");
        num = leer.nextInt();//el next tiene que albergar enteros, por eso es leer.nextInt
        resu = num * 2; // hacemos el doble
        System.out.println("El doble del numero ingresado es: "+ resu);
        resu = num * 3; // ahora el triple
          System.out.println("El triple del numero ingresado es: "+ resu);
    resuraiz = Math.sqrt(num); //la variable resuraiz SE OBTIENE usando este recurso
        System.out.println("La raiz del numero ingresado es: "+ resuraiz);
    }
    
}
    
    

