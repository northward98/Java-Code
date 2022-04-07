package com.design_principles.substitution.after;

/**
 * 正方形
 */

public class Square implements Quadrilateral{
    //边长
    private double side;
    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
