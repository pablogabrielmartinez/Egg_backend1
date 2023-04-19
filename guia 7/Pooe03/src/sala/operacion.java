/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sala;

import java.util.Scanner;

/**
 *
 * @author luks_
 */
public class operacion {
private int numero1;
    private int numero2;

    public operacion() {
        // Constructor vacío
    }

    public operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        this.numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        this.numero2 = sc.nextInt();
    }

    public int sumar() {
        return this.numero1 + this.numero2;
    }

    public int restar() {
        return this.numero1 - this.numero2;
    }

    public int multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Error: no se puede multiplicar por cero.");
            return 0;
        }
        else {
            return this.numero1 * this.numero2;
        }
    }

    public float dividir() {
        if (this.numero2 == 0) {
            System.out.println("Error: no se puede dividir por cero.");
            return 0;
        }
        else {
            return (float) this.numero1 / this.numero2;
        }
    }
}    

