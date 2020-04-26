package com.company.GuiaObjetos03.Consigna03;

import java.security.InvalidParameterException;

public class Rectangle extends SquareFigure {
    public Rectangle(float height, float width) {
        super(height, width);
        if(height == width) {
          throw new InvalidParameterException("ERROR: Height and Width cannot be the same value. Please consider using a Square instead");
        }
    }

    public Rectangle(String color, float height, float width) {
        super(color, height, width);
    }

}
