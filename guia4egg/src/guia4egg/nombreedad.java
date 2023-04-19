/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4egg;

import static guia4egg.devoveralmain1.sc;

/**
 *
 * @author luks_
 */
public class nombreedad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
      String validacion;
      int c=1; // contador a partir de la 1 persona
      String nombre;
      do {
          System.out.println("cargue el nombre de la persona "+c);
          nombre=sc.next();
          System.out.println("cargue la edad de la persona "+c);
          edad=sc.nextInt();
          mayorEdad(nombre, edad);
          System.out.println("desea cargar mas personas?  S/N");
          validacion= sc.next();
          c++; //cuenta la cantidad de personas ingresadas
      }while(validacion.equalsIgnoreCase("s"));
    }
    public static void mayorEdad(String nombre, int edad){
        if (edad>17){
            System.out.println(nombre+" tiene "+edad+" es mayor de edad ");
        }else {
            System.out.println(nombre+" tiene "+edad+" no es mayor de edad ");
        }
    }
}
   
    

