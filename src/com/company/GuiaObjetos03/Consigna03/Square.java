package com.company.GuiaObjetos03.Consigna03;

import java.security.InvalidParameterException;

public class Square extends SquareFigure {
    public Square(float height) {
        super(height, height);
    }

    public Square(String color, float height) {
        super(color, height, height);
    }

}
