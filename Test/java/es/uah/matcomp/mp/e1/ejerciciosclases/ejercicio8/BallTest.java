package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BallTest {
    private Ball b= new Ball(1.0f, 1.0f, 2, 3.0f, 3.0f);

    @Test
    void test() {
        assertEquals(1, b.getX());
        assertEquals(1, b.getY());
        assertEquals(2, b.getRadius());
        assertEquals(3, b.getXDelta());
        assertEquals(3, b.getYDelta());
    }

    @Test
    public void testSettersygetters() {
        b.setX(5.0f);
        b.setY(5.0f);
        b.setRadius(15);
        b.setXDelta(4.0f);
        b.setYDelta(5.0f);

        assertEquals(5.0f, b.getX());
        assertEquals(5.0f, b.getY());
        assertEquals(15, b.getRadius());
        assertEquals(4.0f, b.getXDelta());
        assertEquals(5.0f, b.getYDelta());
    }

    @Test
    void move() {
        b.move();
        assertEquals(4.0f, b.getX());
        assertEquals(4.0f, b.getY());

    }

    @Test
    void reflectHorizontal() {
        b.reflectHorizontal();
        assertEquals(-3.0f, b.getXDelta());
    }

    @Test
    void reflectVertical() {
        b.reflectVertical();
        assertEquals(-3.0f, b.getYDelta());
    }

    @Test
    void testToString() {
        assertEquals("Ball[(" + b.getX() + "," + b.getY() + "),speed=(" + b.getXDelta() + "," + b.getYDelta() + ")]", b.toString());
    }
}