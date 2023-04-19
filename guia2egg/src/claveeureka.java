
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
public class claveeureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase; //creamos la variable frase como cadena
         Scanner leer = new Scanner(System.in); // creamos el scanner
        System.out. println("Ingrese la frase y encuentra la palabra misteriosa"); //pedimos la frase
    	frase = leer. nextLine(); // llenamos la variable frase con lo que escribimos en el scanner
        if ("eureka". equalsIgnoreCase(frase)) { //condicional: si "eureka" es igual (ignorando mayus o minus)de la var frase entonces...
    	System.out. println("usted ingreso la frase correcta ! ");
    	} else { // si no 
            System.out. println("usted no ingreso la frase correcta");
        }
}

    }
    
    
    

