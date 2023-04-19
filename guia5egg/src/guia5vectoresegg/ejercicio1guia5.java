/*
 * Realizar un algoritmo que llene un vector con los 100 primeros
números enteros y los muestre por pantalla en orden descendente.

 */
package guia5vectoresegg;

/**
 *
 * @author luks_
 */
public class ejercicio1guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] Vector = new int[100];
        
        for ( int i = 0 ; i < 100 ; i++){            
            Vector[i] = i;           
        }
       for (int i = Vector.length - 1; i >= 0; i--) {
          System.out.println(Vector[i]);
        }
    }
    
}

   
    
