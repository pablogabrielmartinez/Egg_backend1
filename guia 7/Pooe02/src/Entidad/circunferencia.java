/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author luks_
 */
public class circunferencia {
    private double radio;
    
    
    public circunferencia () {
        //
    }

    public circunferencia (double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = scanner.nextDouble();
    }

    public double area() {
        double area = Math.PI * radio * radio;
        System.out.println("Area : " + area );
        return area;
    }

    public double perimetro() {
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Perimetro : " + perimetro );
        return perimetro;
    }

    public void crearcircunferencia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

