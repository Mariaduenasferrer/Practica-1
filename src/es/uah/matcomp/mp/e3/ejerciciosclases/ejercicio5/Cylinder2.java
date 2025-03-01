package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio5;

public class Cylinder2 {
    private Circle2 base;
    private double height;

    public Cylinder2() {
        base = new Circle2();
        height = 1.0;
    }

    public Cylinder2(double r, double h) {
        base = new Circle2(r);
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public Circle2 getBase() {
        return base;
    }

    public void setBase(Circle2 b) {
        base = b;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base.toString() + ", height=" + height + "]";
    }
}
