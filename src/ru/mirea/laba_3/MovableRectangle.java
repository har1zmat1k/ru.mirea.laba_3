package ru.mirea.laba_3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x, int y,int xSpeed,int ySpeed) {
        topLeft = new MovablePoint(x, y, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public boolean checkedPointsSpeed(){
       return (topLeft.xSpeed == bottomRight.xSpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle " + "topLeft = " + topLeft
                + ", bottomRight = " + bottomRight;
    }

    @Override
    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
}
