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
    Equipos equipoLocal;
    Equipos equipoVisitante;
    Arbitros Arbitro;

    // Constructor.
    public Partidos(int jornada, LocalDateTime fechaPartido, int golesLocal, int golesVisitante, Equipos equipoLocal, Equipos equipoVisitante, Arbitros Arbitro) {
        this.jornada = jornada;
        this.fechaPartido = fechaPartido;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.Arbitro = Arbitro;
    }

    // Setters.
    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    public void setFechaPartido(LocalDateTime fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public void setGGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public void setEquipoLocal(Equipos equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public void setEquipoVisitante(Equipos equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public void setArbitro(Arbitros Arbitro) {
        this.Arbitro = Arbitro;
    }

    // getters.
    public int getJornada() {
        return jornada;
    }

    public LocalDateTime getFechaPartido() {
        return fechaPartido;
    }

    public int getGGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public Equipos getEquipoLocal() {
        return equipoLocal;
    }

    public Equipos setEquipoVisitante() {
        return equipoVisitante;
    }

    public Arbitros getArbitro() {
        return Arbitro;
    }

    // Metodos de la clase.
    public void GolLocal() {
        golesLocal++;
    }

    public void GolVisitante() {
        golesVisitante++;
    }

    public void anularGolesLocal() {
        golesLocal--;
    }

    public void anularGolesVisitante() {
        golesVisitante--;
    }

    public String DatosPârtido() {

        return "Jornada: ".
                concat(String.valueOf(jornada)).
                concat(", ").
                concat(String.valueOf(fechaPartido)).
                concat(", ").
                concat(equipoLocal.getNombre()).
                concat(" Vs  ").
                concat(equipoVisitante.getNombre()).
                concat(String.valueOf(golesLocal)).
                concat("/").
                concat(String.valueOf(golesVisitante)).
                concat(" Arbitro ").
                concat(Arbitro.getNombre().
                        concat(", ").
                        concat(Arbitro.getApellidos()));

    }

}
