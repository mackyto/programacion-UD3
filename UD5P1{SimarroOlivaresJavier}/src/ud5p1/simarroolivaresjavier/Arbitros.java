/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5p1.simarroolivaresjavier;

/**
 *
 * @author 29160712r
 */

public class Arbitros {
    
    // Datos de la clase.
    private String nombre;
    private String apellidos;
    private int edad;
    private String departamento;
    
    // Constructor.
    public Arbitros (String nombre, String apellidos, int edad, String departamento) {
    
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
            this.departamento = departamento;
    
    }
           
    // Setters.   
    public void setNombre(String nobre){this.nombre = nombre;}
    
    public void setApellidos(String apellidos){this.apellidos = apellidos;}
      
    public void setEdad(int edad){this.edad = edad;}
    
    public void setDepartamento(String departamento){this.departamento = departamento;}   
        
    // Getters.
    public String getNombre(){return nombre;}
    
    public String getApellidos(){return apellidos;}
       
    public int getEdad(){return edad;}
       
    public String getDepartamento(){return departamento;}
       
    public String getAll(){
        
        return 
            nombre.
            concat(", ").
            concat(apellidos).
            concat(", ").
            concat(String.valueOf(edad)).
            concat("años, Departamento  ").
            concat(departamento);
        
    }
    
}
