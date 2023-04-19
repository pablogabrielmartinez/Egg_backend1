
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
public class menu5sino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        boolean salida = false;

        do {
            System.out.println("Ingrese 2 números enteros positivos");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        } while (num1 < 0 || num2 < 0);

        do {
            String salir = "";
            System.out.println("******************");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
                    
            
            System.out.println("Elija opción:");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división es " + (double)num1 / num2);
                    break;
                case 5:
                    System.out.println("Desea salir del programa? S=si");
                    salir = leer.next();
                    if ("s".equalsIgnoreCase(salir)) {
                        salida = true;
                    } else {
                        do {
                            System.out.println("Ingrese 2 números enteros positivos");
                            num1 = leer.nextInt();
                            num2 = leer.nextInt();
                        } while (num1 < 0 || num2 < 0);
                    }
                    break;
                default:
                    System.out.println("La opcion no es correcta");
                    break;
            }

        } while (!salida);
        System.out.println("Programa finalizado");
    }
    
}


