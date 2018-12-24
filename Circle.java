package ru.mirea.arkabaev.pract3;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "Green";
        this.radius = 1;
    }

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
    double getArea(){
        return radius*radius*3.14;
    };

    @Override
    double getPerimeter(){
        return radius*3.14;
    };

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

