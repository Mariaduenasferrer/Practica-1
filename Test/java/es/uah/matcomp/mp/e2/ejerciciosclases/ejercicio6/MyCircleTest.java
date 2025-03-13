package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyCircleTest {

    @Test
    void testDefaultConstructor() {
        MyCircle circle = new MyCircle();
        assertEquals(1, circle.getRadius());
        assertEquals(0, circle.getX());
        assertEquals(0, circle.getY());
    }

    @Test
    void testConstructorWithCoordinates() {
        MyCircle circle = new MyCircle(3, 4, 5);
        assertEquals(5, circle.getRadius());
        assertEquals(3, circle.getX());
        assertEquals(4, circle.getY());
    }

    @Test
    void testConstructorWithMyPoint() {
        MyPoint center = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals(5, circle.getRadius());
        assertEquals(3, circle.getX());
        assertEquals(4, circle.getY());
    }

    @Test
    void testSetygetCenter() {
        MyCircle circle = new MyCircle(3, 4, 5);
        MyPoint newCenter = new MyPoint(7, 8);
        circle.setCenter(newCenter);
        assertEquals(7, circle.getX());
        assertEquals(8, circle.getY());
    }

    @Test
    void testSetygetRadius() {
        MyCircle circle = new MyCircle(3, 4, 5);
        circle.setRadius(10);
        assertEquals(10, circle.getRadius());
    }

    @Test
    void testSetygetCenterXY() {
        MyCircle circle = new MyCircle(3, 4, 5);
        circle.setCenterXY(7, 8);
        assertEquals(7, circle.getX());
        assertEquals(8, circle.getY());
    }

    @Test
    void testToString() {
        MyCircle circle = new MyCircle(3, 4, 5);
        assertEquals("MyCircle[radius=" + circle.getRadius() + ", center= (" + circle.getCenter() + "]", circle.toString());
    }

    @Test
    void testGetArea() {
        MyCircle circle = new MyCircle(3, 4, 5);
        assertEquals(Math.PI * 5 * 5, circle.getArea(), 0.01);
    }

    @Test
    void testGetCircumference() {
        MyCircle circle = new MyCircle(3, 4, 5);
        assertEquals(2 * Math.PI * 5, circle.getCircumference(), 0.01);
    }
    @Test
    void testDistance() {
        MyCircle circle1 = new MyCircle(3, 4, 5);

        MyCircle circle2 = new MyCircle(7, 8, 3);

        int deltaX = circle2.getX() - circle1.getX();
        int deltaY = circle2.getY() - circle1.getY();

        double centerDistance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        assertEquals(centerDistance, circle1.distance(circle2), 0.01);
    }
}