package ru.mirea.laba_3;

public class Square extends Rectangle {
    private double side = 0.0;

    public Square() {}

    public Square(double side) {
        this.side = side;
    }

    public Square(boolean filled, double side, double width,
                  double length, String color) {
        super(width, length, color, filled);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square, " + "color = " + this.getColor() +  ", side = " + this.getSide();
    }
}
