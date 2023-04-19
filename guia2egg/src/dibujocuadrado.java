
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
public class dibujocuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int large;
        
        System.out.println("Ingrese el tamaño del cuadrado");
        large = leer.nextInt();
        
        for (int i = 0; i < large; i++) {
            for (int j = 0; j < large; j++) {
                if  (i==0 || i== large-1 || j==0 ||j== large-1) {
                    System.out.print("* ");
                   
                } else {
                    System.out.print("  "); 
                }
                
               
            }
            
             System.out.println(); 
        }
    }
    
}
   
    

