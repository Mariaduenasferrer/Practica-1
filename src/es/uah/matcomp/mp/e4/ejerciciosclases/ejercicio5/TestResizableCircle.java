package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio5;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(10);

        System.out.println(resizableCircle);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());

        resizableCircle.resize(50);
        System.out.println(resizableCircle);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());

        resizableCircle.resize(200);
        System.out.println(resizableCircle);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());
    }
}

