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
    private List<Jugadores> futbolista;

    // Constructor.
    public Equipos(String nombre, String categoria, List<Jugadores> futbolista) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.futbolista = futbolista;
    }

    //Setters.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setFutbolistas(List<Jugadores> futbolista) {
        this.futbolista = futbolista;
    }

    // Getters.
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public List<Jugadores> getJugadores() {
        return futbolista;
    }
    
    public Jugadores getFutbolistas(int id){
        return futbolista.get(id);
    }
    
    // Metodos de la clase.
    public void añadeJugador (Jugadores jugador){
        futbolista.add(jugador);
    }

    public void eliminaJugador (Jugadores jugador){
        futbolista.remove(jugador);
    }

    public void eliminaJugadorId (int id){
        futbolista.remove(id);
    }
    
    public Jugadores buscaJugadorNombre (String nombre, String apellidos){
        for (Jugadores f: futbolista){
            if (f.getNombre().equalsIgnoreCase(nombre) && f.getApellidos().equalsIgnoreCase(apellidos)){
                return f;
            }
        }
        return null;
    }

    public int buscaJugadorNombreId (String nombre, String apellidos){
        for (int i = 0; i < futbolista.size(); i++){
            Jugadores f = futbolista.get(i);
            if (f.getNombre().equalsIgnoreCase(nombre) && f.getApellidos().equalsIgnoreCase(apellidos)){
                return i;
            }
        }
        return -1;
    }
    
    
}
