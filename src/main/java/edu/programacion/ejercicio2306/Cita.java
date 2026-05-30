package edu.programacion.ejercicio2306;

import java.time.LocalDate;

public class Cita {
    private LocalDate fecha;
    private Persona contacto;
    private Lugar lugar;
    private Integer importancia;

    /**
     * algo
     * */
    public LocalDate getFecha() {
        return fecha;
    }
    /**
     * algo
     * */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    /**
     * algo
     * */
    public Persona getContacto() {
        return contacto;
    }
    /**
     * algo
     * */
    public void setContacto(Persona persona) {
        this.contacto = persona;
    }
    /**
     * algo
     * */
    public Lugar getLugar() {
        return lugar;
    }
    /**
     * algo
     * */
    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
    /**
     * algo
     * */
    public Integer getImportancia() {
        return importancia;
    }
    /**
     * algo
     * */
    public void setImportancia(Integer importancia) {
        this.importancia = importancia;
    }
}
