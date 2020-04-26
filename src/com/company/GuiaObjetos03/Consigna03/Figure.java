package com.company.GuiaObjetos03.Consigna03;

public abstract class Figure {
    private String color;
    public Figure(){}
    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract float getArea();
    public abstract float getPerimeter();
    public abstract String toString();
}
