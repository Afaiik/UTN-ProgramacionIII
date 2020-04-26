package com.company.GuiaObjetos03.Consigna01;

public class Cylinder extends Circle {
    private float height;

    public Cylinder() {
        super(1, "Red");
        this.height = 1;
    }

    public Cylinder(float radius, String color, float height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(float radius, float height) {
        super(radius);
        this.height = height;
    }

    public float getVolume(){
        return this.getArea() * this.height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
