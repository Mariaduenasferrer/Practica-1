package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio5;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10);

        System.out.println(circle);
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}

