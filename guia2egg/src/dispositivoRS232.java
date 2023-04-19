
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
public class dispositivoRS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        
        int correct, incorrect;
        correct= 0;
        incorrect = 0;
        String cadena;
        
        System.out.println("Dispositivo RS232:");
        
        while (true) {
            System.out.print("Ingrese secuencia: ");
            cadena = leer.nextLine();
            
            if (cadena.equals("&&&&&")) {
                correct++;
                break;
            }
            
            else if ((cadena.length() == 5) && (cadena.substring(0, 1).equals("X")) && (cadena.substring(4).equals("O"))) {
                correct++;
            } else {
                incorrect++;
            }
        }
        
        System.out.println("Resultado ");
        System.out.println("Lecturas correctas: " + correct + " | Lecturas incorrectas: " + incorrect);
    }
}
    
    

