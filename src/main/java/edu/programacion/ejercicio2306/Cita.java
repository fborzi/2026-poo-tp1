package edu.programacion.ejercicio2306;

import java.time.LocalDate;

public class Cita {
    private LocalDate fecha;
    private Persona contacto;
    private Lugar lugar;
    private Integer importancia;


    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Persona getContacto() {
        return contacto;
    }

    public void setContacto(Persona persona) {
        this.contacto = persona;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Integer getImportancia() {
        return importancia;
    }

    public void setImportancia(Integer importancia) {
        this.importancia = importancia;
    }
}
