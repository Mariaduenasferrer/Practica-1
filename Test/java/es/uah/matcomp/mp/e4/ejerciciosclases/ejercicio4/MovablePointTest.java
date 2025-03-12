package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio4;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class MovablePointTest {

    @Test
    void moveUp() {
        MovablePoint point = new MovablePoint(0,0,0,5);
        point.moveUp();
        assertEquals("(x=0,y=5),speed=(0,5)", point.toString());
    }

    @Test
    void moveDown() {
        MovablePoint point = new MovablePoint(0, 5, 0,3);
        point.moveDown();
        assertEquals("(x=0,y=2),speed=(0,3)", point.toString());
    }

    @Test
    void moveLeft() {
        MovablePoint point = new MovablePoint(5, 0, 2,0);
        point.moveLeft();
        assertEquals("(x=3,y=0),speed=(2,0)", point.toString());
    }

    @Test
    void moveRight() {
        MovablePoint point = new MovablePoint(0, 0, 4,0);
        point.moveRight();
        assertEquals("(x=4,y=0),speed=(4,0)", point.toString());
    }
}