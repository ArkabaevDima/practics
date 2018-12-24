package ru.mirea.arkabaev.pract3;

public class TestMovable {
    public static void main (String[] args) {

        Movable m1 = new MovablePoint(5, 6, 10, 10);
        System.out.println(m1.toString());
        System.out.println("m1.moveLeft()");
        m1.moveLeft();
        System.out.println(m1.toString() + "\n");

        Movable m2 = new MovableCircle(2, 1, 2, 20, 20);
        System.out.println(m2.toString());
        System.out.println("m2.moveRight()");
        m2.moveRight();
        System.out.println(m2.toString() + "\n");
    }
}

