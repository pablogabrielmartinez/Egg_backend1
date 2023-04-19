/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4egg;

/**
 *
 * @author luks_
 */
public class ejercicio12guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1;
        String str2;
        String str3;
        for (int i=0; i<10; i++) 
        {
        for (int j=0; j<10; j++) 
        {
        for (int k=0; k<10; k++) 
        {
            str1 = Integer.toString(i);
            str2 = Integer.toString(j);
            str3 = Integer.toString(k);
            if (i==3) 
            {
            str1="E";
            }
            if (j==3) 
            {
            str2="E";
            }
            if (k==3) 
            {
            str3="E";
            }
            System.out.println(str1+"-"+str2+"-"+str3);
        }
        }
        }
    }
}

    
    

