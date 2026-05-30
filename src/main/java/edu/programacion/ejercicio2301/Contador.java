package edu.programacion.ejercicio2301;

public class Contador {
    private Integer valor;
    /**
     * algo
     * */
    public Contador(){}

    /**
     * algo
     * */
    public Integer iniciar(){
        setValor(0);
        return getValor();
    }
    /**
     * algo
     * */
    public Integer inicar(Integer n){
        setValor(n);
        return getValor();
    }
    /**
     * algo
     * */
    public Integer sumar(){
        setValor(getValor() + 1);
        return getValor();
    }
    /**
     * algo
     * */
    public Integer restar(){
        setValor(getValor() - 1);
        return getValor();
    }
    /**
     * algo
     * */
    public Integer sumar(Integer n){
        for(int i = 0; i < n; i++){
            sumar();
        }
        return getValor();
    }
    /**
     * algo
     * */
    public Integer restar(Integer n){
        for(int i = 0; i < n; i++){
            restar();
        }
        return getValor();
    }

    /**
     * algo
     * */
    public Integer getValor(){
        return this.valor;
    }
    /**
     * algo
     * */
    public void setValor(Integer unValor){
        this.valor = unValor;
    }
}
