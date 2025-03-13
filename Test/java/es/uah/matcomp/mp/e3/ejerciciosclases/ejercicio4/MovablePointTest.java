package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    private MovablePoint movablePoint = new MovablePoint(2.0F, 3.0F, 1.0F, 2.0F);
    @Test
    void getXSpeed() {assertEquals(1.0F, movablePoint.getXSpeed());}

    @Test
    void setXSpeed() {
        movablePoint.setXSpeed(2.0F);
        assertEquals(2.0F, movablePoint.getXSpeed());
    }

    @Test
    void getYSpeed() {assertEquals(2.0F, movablePoint.getYSpeed());}

    @Test
    void setYSpeed() {
        movablePoint.setYSpeed(3.0F);
        assertEquals(3.0F, movablePoint.getYSpeed());
    }

    @Test
    void setSpeed() {
        movablePoint.setSpeed(3.0F, 2.0F);
        assertArrayEquals(new float[] {3.0F, 2.0F}, movablePoint.getSpeed());
    }

    @Test
    void getSpeed() {assertArrayEquals(new float[] {1.0F, 2.0F}, movablePoint.getSpeed());}

    @Test
    void testToString() {assertEquals("(2.0,3.0), speed=(1.0,2.0)", movablePoint.toString());
    }

    @Test
    void move() {
        movablePoint.move();
        assertEquals("(3.0,5.0), speed=(1.0,2.0)", movablePoint.toString());}
    }


