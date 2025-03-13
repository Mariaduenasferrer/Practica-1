package es.uah.matcomp.mp.e3.ejerciciosclases.ejericicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    private Point point = new Point(3, 4);
    @Test
    void testToString() {assertEquals("Point: (3, 4)", point.toString());}

    @Test
    void getX() {assertEquals(3, point.getX());}

    @Test
    void getY() {assertEquals(4, point.getY());}

    @Test
    void setX() {
        point.setX(5);
        assertEquals(5, point.getX());
    }

    @Test
    void setY() {
        point.setY(5);
        assertEquals(5, point.getY());
    }

    @Test
    void setXY() {
        point.setXY(20, 25);
        assertEquals(20, point.getX());
        assertEquals(25, point.getY());
    }
}