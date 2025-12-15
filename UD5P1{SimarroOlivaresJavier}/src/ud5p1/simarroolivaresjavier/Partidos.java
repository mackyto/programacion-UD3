/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5p1.simarroolivaresjavier;

import java.time.LocalDateTime;

/**
 *
 * @author 29160712r
 */
public class Partidos {
    
    private int jornada;
    private LocalDateTime fechaPartido;
    private int golesLocal;
    private int golesVisitante;
//    private Equipos equipoLocal = new Equipos(nombre, categoria);
//    private Equipos equipoVisitante = new Equipos(nombre, categoria);
//    private Arbitros arbitro = new Arbitros(nombre, apellidos, edad, departamento);
    String equipoLocal;
    String equipoVisitante;
    String Arbitro;

    public void partidos (int jornada, LocalDateTime fechaPartido, int golesLocal, int golesVisitante, String equipoLocal, String equipoVisitante, String Arbitro){
        this.jornada = jornada;
        this.fechaPartido = fechaPartido;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.Arbitro = Arbitro;
    }
    
    public void setJornada (int jornada){
        this.jornada = jornada;
    }    
        
    public void setFechaPartido (LocalDateTime fechaPartido){
        this.fechaPartido = fechaPartido;
    }
        
    public void setGGolesLocal (int golesLocal){    
        this.golesLocal = golesLocal;
    }
    
    public void setGolesVisitante (int golesVisitante){
        this.golesVisitante = golesVisitante;
    }    
        
    public void setEquipoLocal (String equipoLocal){    
        this.equipoLocal = equipoLocal;
    }
    
    public void setEquipoVisitante (String equipoVisitante){
        this.equipoVisitante = equipoVisitante;
    }    
    
    public void setArbitro (String Arbitro){
        this.Arbitro = Arbitro;
    }
    
    
    
    
    
}
