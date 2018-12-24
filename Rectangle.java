package ru.mirea.arkabaev.pract3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        this.filled = false;
        this.color = "Black";
        width = 100;
        length = 50;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea(){
        return width * length;
    };

    @Override
    double getPerimeter(){
        return 2 * (width + length);
    };

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}

