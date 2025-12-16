/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5p1.simarroolivaresjavier;

/**
 *
 * @author 29160712r
 */
public class Jugadores {
    
    // Datos de la clase.
    private String nombre;
    private String apellidos;
    private String posicion;
    private int edad;
    private String equipo;
    
    // Constructor.
    public void Arbitros (String nombre, String apellidos, String posicion, int edad, String equipo) {
    
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.posicion = posicion;
            this.edad = edad;
            this.equipo = equipo;
    
    }
           
    // Setters.   
    public void setNombre(String nombre){this.nombre = nombre;}
    
    public void setApellidos(String apellidos){this.apellidos = apellidos;}
      
    public void setPosicion(String posicion){this.posicion = posicion;}   

    public void setEdad(int edad){this.edad = edad;}

    public void setequipo(String equipo){this.equipo = equipo;}    
        
    // Getters.
    public String getNombre(){return nombre;}
    
    public String getApellidos(){return apellidos;}
       
    public String getPosicion(){return posicion;}

    public int getEdad(){return edad;}
       
    public String getEquipo(){return equipo;}
       
    public String getAll(){
        
        return 
            nombre.
            concat(", ").
            concat(apellidos).
            concat(", Posición").
            concat(posicion).
            concat(String.valueOf(edad)).
            concat("años, Equipo ").
            concat(equipo);
        
    }
    
}
