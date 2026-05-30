package edu.programacion.ejercicio2304;

import edu.programacion.ejercicio2303.Punto;

public class Circulo {

    private Punto centro;
    private Double radio;
    /**
     * algo
     * */
    public Double ampliar(Double unValor){
        setRadio(getRadio() + unValor);
        return getRadio();
    }
    /**
     * algo
     * */
    public Double area(){
        return Math.PI * Math.pow(getRadio(), 2);
    }
    /**
     * algo
     * */
    public Punto trasladar(Integer x, Integer y){
        Punto punto = new Punto();
        punto.setValorX(x);
        punto.setValorY(y);
        setCentro(getCentro().sumarPunto(punto));
        return getCentro();
    }

    /**
     * algo
     * */
    public Punto getCentro() {
        return centro;
    }
    /**
     * algo
     * */
    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    /**
     * algo
     * */
    public Double getRadio() {
        return radio;
    }
    /**
     * algo
     * */
    public void setRadio(Double radio) {
        this.radio = radio;
    }
}
