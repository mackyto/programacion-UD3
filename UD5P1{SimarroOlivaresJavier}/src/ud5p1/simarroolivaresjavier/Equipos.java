/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5p1.simarroolivaresjavier;

/**
 *
 * @author 29160712r
 */
public class Equipos {
    
    private String nombre;
    private String categoria;
    
    // Constructor.
    public void equipos(String nombre, String categoria){
        this.nombre = nombre;
        this.categoria = categoria;
    }   
    
    //Setters.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    // Getters.
    public String getNombre(){
        return nombre;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    
}
