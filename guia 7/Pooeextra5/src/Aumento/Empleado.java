/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aumento;

import java.util.Scanner;

/**
 *
 * @author luks_
 */
public class Empleado {
 private String nombre;
    private int edad;
    private int salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void cargarEmpleado(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado :");
        this.nombre = leer.nextLine();
        System.out.println("Ingrese edad :");
        this.edad = leer.nextInt();
        System.out.println("Ingrese salario :");
        this.salario =  leer.nextInt();
    }
    
    public void calcularAumento(){
        System.out.println("---- CALCULANDO AUMENTO ----");
        double aumento;
        if (this.edad > 30) {
            aumento = this.salario * 0.1;
        } else {
            aumento = this.salario * 0.05;
        }
        System.out.println("Salario actual : " + (salario+aumento));
        }
}  
   

