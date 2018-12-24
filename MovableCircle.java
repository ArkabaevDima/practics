package ru.mirea.arkabaev.pract3;

public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center.x=" + center.x +
                ", center.y=" + center.y +
                ", center.xSpeed=" + center.xSpeed +
                ", center.ySpeed=" + center.ySpeed +
                ", radius=" + radius +
                '}';
    }
}
