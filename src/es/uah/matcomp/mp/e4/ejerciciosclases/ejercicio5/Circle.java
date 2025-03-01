package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio5;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}