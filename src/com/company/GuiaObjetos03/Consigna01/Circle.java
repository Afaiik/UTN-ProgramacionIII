package com.company.GuiaObjetos03.Consigna01;

public class Circle {
    private float radius;
    private String color;

    public Circle(){
        this.radius = 1;
        this.color = "red";
    }
    public Circle(float radius) {
        this.radius = radius;
        this.color = "Red";
    }
    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getArea(){
        return (float)Math.pow(this.radius * Math.PI, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
