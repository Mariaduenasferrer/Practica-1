package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio3;

import static org.junit.Assert.*;
import org.junit.Test;

public class MovablePointTest {

    @Test
    public void moveUp() {
        MovablePoint point = new MovablePoint(0, 0, 0, 1);
        point.moveUp();
        assertEquals(-1, point.y);
    }

    @Test
    public void moveDown() {
        MovablePoint point = new MovablePoint(0, 0, 0, 1);
        point.moveDown();
        assertEquals(1, point.y);
    }

    @Test
    public void moveLeft() {
        MovablePoint point = new MovablePoint(0, 0, 1, 0);
        point.moveLeft();
        assertEquals(-1, point.x);
    }

    @Test
    public void moveRight() {
        MovablePoint point = new MovablePoint(0, 0, 1, 0);
        point.moveRight();
        assertEquals(1, point.x);
    }

    @Test
    public void testToString() {
        MovablePoint point = new MovablePoint(5, 10, 2, 3);
        String expected = "(5,10), Speed=(2,3)";
        assertEquals(expected, point.toString());
    }
}