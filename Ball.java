package ru.mirea.arkabaev.pract1;

public class Ball {
    double Radius;
    String Color;
    String Materials;

    public String toString() {
        return Radius + " " + Color + " " + Materials;
    }

    public Ball(double Radius, String Color, String Material) {
        this.Radius = Radius;
        this.Color = Color;
        this.Materials = Material;
    }
}
