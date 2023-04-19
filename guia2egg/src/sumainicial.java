
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
public class sumainicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int lim;
        int numaux;//creamos las variables limite, numero y num aux que albergara la suma
        numaux = 0;//inicializamos la variable de la suma
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero limite:");
        lim = leer.nextInt();
        do { //hacer <- este es el bucle repetitivo... 
        System.out.println("Ahora ingrese un numero (se sumaran hasta que supere el numero limite)");
        num = leer.nextInt();
        numaux = numaux + num;
        } while (numaux <= lim);//mientras que numaux(la suma) sea menor o igual al limite
        System.out.println("El numero al que se llego es " + numaux + " superando el limite.");
        
        
    }
    
}
    
    

