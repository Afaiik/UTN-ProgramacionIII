package com.company.GuiaObjetos01.Consigna1;

public class Figura{
    private int ancho;
    private int alto;

    public Figura() {

    }

    public Figura(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    public void SetAncho(int ancho){
        this.ancho = ancho;
    }

    public int GetAncho(){
        return this.ancho;
    }

    public void SetAlto(int alto){this.alto = alto;}

    public int GetAlto(){
        return this.alto;
    }

    public int GetPerimetro(){
        return this.ancho * this.alto;
    }

    public double GetArea(){
        return Math.pow((this.ancho * this.alto), 2);
    }
}