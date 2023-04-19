/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5vectoresegg;

/**
 *
 * @author luks_
 */
public class ejercicio13guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[5];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*10);
        }
        
        System.out.println("Matriz");
        
        for(int elem: vector){
            System.out.print(elem + " ");
        }
    }
    
}
