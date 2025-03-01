package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio5;

public class Circle2 {
    private double radius;
    private String color;

    public Circle2() {
        radius = 1.0;
        color = "red";
    }
    public Circle2(double r) {
        radius = r;
        color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
