package es.uah.matcomp.mp.e3.ejerciciosclases;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);   // Construct a Point
        System.out.println(p1);

        // Try setting p1 to (100, 10).
        p1.setXY(100, 10);
        System.out.println("Updated: " + p1);
    }
}
