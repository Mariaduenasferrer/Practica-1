package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio2;

public class Rectangle implements GeometricObject {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", length=" + length + "]";
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
