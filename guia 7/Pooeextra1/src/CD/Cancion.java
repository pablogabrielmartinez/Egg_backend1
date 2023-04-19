/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CD;

import java.util.Scanner;

/**
 *
 * @author luks_
 */
public class Cancion {
    private String titulo;
    private String autor;
    
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }
    
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void Ingreso(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese titulo : ");
        this.titulo = leer.nextLine();
        System.out.print("Autor : ");
        this.autor = leer.nextLine();  
    
}
}