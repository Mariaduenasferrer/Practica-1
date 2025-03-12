package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio2;

public class TestGeometricObjects1 {
    public static void main(String[] args) {
        GeometricObject1 circle = new Circle(4);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        GeometricObject1 rectangle = new Rectangle(5.0, 5.0);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
