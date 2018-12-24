package ru.mirea.arkabaev.pract3;

public class Square extends Rectangle{
    protected double side;
    public Square() {
        this.filled = false;
        this.color = "BLUE";
        this.width = 100;
        this.length = 100;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double width, double length, String color, boolean filled, double side) {
        super(width, length, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side) {
        this.side = side;
    }
    public void setLength(double side) {
        this.side = side;
    }
    @Override
    double getArea(){
        return side * side;
    };

    @Override
    double getPerimeter(){
        return 2 * (side + side);
    };

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
