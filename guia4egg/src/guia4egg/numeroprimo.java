/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4egg;

import java.util.Scanner;

/**
 *
 * @author luks_
 */
public class numeroprimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int nume=0;
        boolean condicion = 
        condicion= primo (nume); // subprograma

        if (condicion) {
            System.out.println(" El numero es primo "+"("+condicion+")");
        } else {
            System.out.println("El numero no es primo "+"("+condicion+")");
        }
    }

    public static boolean primo (int nume) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número  ");
        nume = scanner.nextInt();
        boolean primo = true;

        for (int i = 2; i < nume; i++) {
            if (nume % i == 0) {
                primo = false;
                break;

            }
        }
       return primo;
    }
}