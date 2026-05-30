package edu.programacion.ejercicio2304;

import edu.programacion.ejercicio2303.Punto;

public class Circulo {

    private Punto centro;
    private Double radio;

    public Double ampliar(Double unValor){
        setRadio(getRadio() + unValor);
        return getRadio();
    }

    public Double area(){
        return Math.PI * Math.pow(getRadio(), 2);
    }

    public Punto trasladar(Integer x, Integer y){
        Punto punto = new Punto();
        punto.setValorX(x);
        punto.setValorY(y);
        setCentro(getCentro().sumarPunto(punto));
        return getCentro();
    }


    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
}
