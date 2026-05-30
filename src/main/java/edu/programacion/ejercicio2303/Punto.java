package edu.programacion.ejercicio2303;

public class Punto {

    private Integer valorX;
    private Integer valorY;


    public Punto sumarValor(Integer unValor){
        setValorX(getValorX() + unValor);
        setValorY(getValorY() + unValor);
        return this;
    }

    public Punto sumarPunto(Punto unPunto){
        setValorX(getValorX() + unPunto.getValorX());
        setValorY(getValorY() + unPunto.getValorY());
        return this;
    }

    public Double dintanciaDe(Punto unPunto){
        return Math.sqrt(Math.pow(getValorX() - unPunto.getValorX(), 2) + Math.pow(getValorY() - unPunto.getValorY(), 2));
    }

    public Double distanciaAlOrigen(){
        return Math.sqrt(Math.pow(getValorX(), 2) + Math.pow(getValorY(), 2));
    }

    public Integer getValorX() {
        return valorX;
    }

    public void setValorX(Integer valorX) {
        this.valorX = valorX;
    }

    public Integer getValorY() {
        return valorY;
    }

    public void setValorY(Integer valorY) {
        this.valorY = valorY;
    }
}
