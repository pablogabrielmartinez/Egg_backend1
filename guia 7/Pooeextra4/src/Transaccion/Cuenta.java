/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaccion;

import java.util.Scanner;

/**
 *
 * @author luks_
 */
public class Cuenta {
  private int saldo = 1000;
    private String titular = "Edu";

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    } 
    
    public void retirarDinero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto dinero desea retirar ? " );
        int dinero = leer.nextInt();
        saldo = saldo - dinero;
         if (saldo < 0){
             System.out.println("Ya no tiene dinero en la cuenta");          
        }else{System.out.println("Dinero Restante en cuenta :" + saldo );  
        }            
    } 
    
}  

