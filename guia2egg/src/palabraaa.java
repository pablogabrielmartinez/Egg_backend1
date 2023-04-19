
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
public class palabraaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase; //creamos la variable frase como cadena
        Scanner leer = new Scanner(System.in); // creamos el scanner
        System.out.println("Ingrese la frase, si comienza con A, sera correcto"); //pedimos la frase
        frase = leer.nextLine(); // guardamos lo que ingresamos en frase 
        if ("A".equals(frase.substring(0, 1))) { //condicional del equal en la primer letra usando substring
             System.out.println("frase correcta ! ");
       } else { // sino 
            System.out.println("frase incorrecta");
        }
    }
    
}
    
    

