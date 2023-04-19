/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5vectoresegg;

import java.util.Scanner;

/**
 *
 * @author luks_
 */
public class ejercicio6guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        int sumaMagica;

        // Pedimos los números teclado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce el número de la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                int num = input.nextInt();
                // entre 1 y 9
                while (num < 1 || num > 9) {
                    System.out.println("El número introducido no es válido. Introduce un número entre 1 y 9.");
                    num = input.nextInt();
                }
                cuadrado[i][j] = num;
            }
        }

        // la suma mágica
        sumaMagica = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];

        // suma fila,columna y diagonal
        boolean esMagico = true;
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += cuadrado[i][j];
                sumaColumna += cuadrado[j][i];
            }
            if (sumaFila != sumaMagica || sumaColumna != sumaMagica) {
                esMagico = false;
                break;
            }
        }
        if (esMagico && cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2] == sumaMagica
                && cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0] == sumaMagica) {
            System.out.println("¡El cuadrado es mágico!");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }

        input.close();
    }

}
    
    

