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
public class Guia5vectoresegg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int[][] matriz = new int[4][4];

for(int i = 0; i < 4; i++) {
  for(int j = 0; j < 4; j++) {
    if(i == j) {
      matriz[i][j] = 0;
    } else if((i + j) % 2 == 0) {
      matriz[i][j] = 1;
    } else {
      matriz[i][j] = -1;
    }
  }
}
    }
    
}
