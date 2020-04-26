package com.company.GuiaObjetos03.Consigna03;

public class Circle extends Figure {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float)Math.pow(radius*Math.PI, 2);
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI) * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + this.getColor() +
                '}';
    }
}
