package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void myPoint() {
        MyPoint point = new MyPoint();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    void MyPoint() {
        MyPoint point = new MyPoint(3, 4);
        assertEquals(3, point.getX());
        assertEquals(4, point.getY());
    }

    @Test
    void getX() {
        MyPoint point = new MyPoint(5, 7);
        assertEquals(5, point.getX());
    }

    @Test
    void setX() {
        MyPoint point = new MyPoint(1, 2);
        point.setX(10);
        assertEquals(10, point.getX());
    }

    @Test
    void getY() {
        MyPoint point = new MyPoint(5, 7);
        assertEquals(7, point.getY());
    }

    @Test
    void setY() {
        MyPoint point = new MyPoint(1, 2);
        point.setY(20);
        assertEquals(20, point.getY());
    }

    @Test
    void getXY() {
        MyPoint point = new MyPoint(5, 7);
        int[] expected = {5, 7};
        assertArrayEquals(expected, point.getXY());
    }

    @Test
    void setXY() {
        MyPoint point = new MyPoint(5, 7);
        point.setXY(20, 20);
        assertEquals(20, point.getX());
    }

    @Test
    void testToString() {
        MyPoint point = new MyPoint(3, 4);
        assertEquals("(3, 4)", point.toString());
    }

    @Test
    void distanceCoordinates() {
        MyPoint point = new MyPoint(3, 4);
        assertEquals(5.0, point.distance(0, 0));
    }

    @Test
    void distanceAnotherPoint() {
        MyPoint point1 = new MyPoint(1, 1);
        MyPoint point2 = new MyPoint(4, 5);
        assertEquals(5.0, point1.distance(point2));
    }

    @Test
    void distanceOrigin() {
        MyPoint point = new MyPoint(0, 0);
        assertEquals(0.0, point.distance(0, 0));
    }
    @Test
    void distance(){
        MyPoint point = new MyPoint();
        assertEquals(0.0, point.distance());
    }

}