package ru.mirea.laba_3;

public class Circle extends Shape{
    private double radius = 0.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle, " + "radius = " + radius +
                ", area = " + this.getArea() +
                ", perimeter = " + this.getPerimeter();
    }
}
