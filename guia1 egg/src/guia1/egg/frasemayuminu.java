/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1.egg;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author luks_
 */
public class frasemayuminu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String frase; // creamos la variable frase
              Scanner leer = new Scanner(System.in); //creamos el scanner
              System.out.println("Ingrese la frase para convertir en mayuscula y minusculas !:"); //pedimos la frase
              frase = leer.nextLine(); //la guardamos, linea completa
             System.out.println(toUpperCase(frase)); // pedimos un sout(tab) que adentro tenga esa clase y que despues la dejamos importada 
             System.out.println(toLowerCase(frase)); // pedimos un sout(tab) que adentro tenga esa clase y que despues la dejamos importada
             
              
    
    }
    
}   
    
    

