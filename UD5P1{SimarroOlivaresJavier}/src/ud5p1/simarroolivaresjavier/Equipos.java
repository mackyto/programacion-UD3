/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5p1.simarroolivaresjavier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 29160712r
 */
public class Equipos {
    
    private String nombre;
    private String categoria;
    private List<Jugadores> futbolistas;
    
    // Constructor.
    public Equipos(String nombre, String categoria, List<Jugadores> futbolistas){
        this.nombre = nombre;
        this.categoria = categoria;
        this.futbolistas = futbolistas;
    }   
    
    //Setters.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void setFutbolistas(List<Jugadores> futbolistas){
        this.futbolistas = futbolistas;
    }
    
    // Getters.
    public String getNombre(){
        return nombre;
    }
    
    public String getCategoria(){
        return categoria;
    }

    public List<Jugadores> getFutbolistas(){
        return futbolistas;
    }
    
    
}
