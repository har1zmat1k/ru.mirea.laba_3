package ru.mirea.laba_3;

public class TestClass {
    public static void main(String[] args) {

        Shape shape = new Shape("Green", false);
        System.out.println(shape.toString());
        shape.setColor("Red");
        if(!shape.isFilled()) {
            shape.setFilled(true);
        }
        System.out.println(shape.toString());

        Circle circle = new Circle(5, "Red", false);
        System.out.println(circle.toString());
        circle.setRadius(9);
        circle.setColor("Green");
        if(!circle.isFilled()) {
            circle.setFilled(true);
        }
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(5,4, "Green", false);
        System.out.println(rectangle.toString());
        rectangle.setLength(9);
        rectangle.setWidth(7);
        rectangle.setColor("blue");
        if(!rectangle.isFilled()) {
            rectangle.setFilled(true);
        }
        System.out.println(rectangle.toString());

        Square square = new Square(false, 5.1, 9, 6, "Blue");
        square.setSide(5.5);
        square.setLength(6);
        square.setWidth(7);
        square.setColor("Green");
        if(!square.isFilled()){
            square.setFilled(true);
        }
        System.out.println(square.toString());

        MovableCircle movableCircle = new MovableCircle(0, 0, 2, 1, 5);
        System.out.println(movableCircle.toString());
        movableCircle.moveDown();
        movableCircle.moveLeft();
        System.out.println(movableCircle.toString());

        MovableRectangle movableRectangle = new MovableRectangle(0, 0, 3, 2);
        System.out.println(movableRectangle.toString());
        if(movableRectangle.checkedPointsSpeed()){
            movableRectangle.moveUp();
            movableRectangle.moveRight();
        }
        System.out.println(movableRectangle.toString());

    }
}
