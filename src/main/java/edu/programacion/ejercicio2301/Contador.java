package edu.programacion.ejercicio2301;

public class Contador {
    private Integer valor;

    public Contador(){}

    public Integer iniciar(){
        setValor(0);
        return getValor();
    }

    public Integer inicar(Integer n){
        setValor(n);
        return getValor();
    }

    public Integer sumar(){
        setValor(getValor() + 1);
        return getValor();
    }

    public Integer restar(){
        setValor(getValor() - 1);
        return getValor();
    }

    public Integer sumar(Integer n){
        for(int i = 0; i < n; i++){
            sumar();
        }
        return getValor();
    }

    public Integer restar(Integer n){
        for(int i = 0; i < n; i++){
            restar();
        }
        return getValor();
    }


    public Integer getValor(){
        return this.valor;
    }

    public void setValor(Integer unValor){
        this.valor = unValor;
    }
}
