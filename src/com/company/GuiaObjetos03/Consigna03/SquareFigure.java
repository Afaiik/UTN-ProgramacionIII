package com.company.GuiaObjetos03.Consigna03;

public abstract class SquareFigure extends Figure {
    private float height;
    private float width;

    public SquareFigure(){};
    public SquareFigure(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public SquareFigure(String color, float height, float width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public float getArea() {
        return (float)Math.pow(height*width, 2);
    }

    @Override
    public float getPerimeter() {
        return height*width;
    }

    @Override
    public String toString() {
        return "SquareFigure{" +
                "height=" + height +
                ", width=" + width +
                ", color=" + this.getColor() +
                '}';
    }
}
