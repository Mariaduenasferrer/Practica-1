package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void moveUp() {
        MovableCircle circle = new MovableCircle(0, 0, 0, 2,5);
        circle.moveUp();
        assertEquals("(x=0,y=2),speed=(0,2),radius=5", circle.toString());
    }

    @Test
    void moveDown() {
        MovableCircle circle = new MovableCircle(0, 5, 0, 1,3);
        circle.moveDown();
        assertEquals("(x=0,y=4),speed=(0,1),radius=3", circle.toString());
    }

    @Test
    void moveLeft() {
        MovableCircle circle = new MovableCircle(5, 0, 3, 0,4);
        circle.moveLeft();
        assertEquals("(x=2,y=0),speed=(3,0),radius=4", circle.toString());
    }

    @Test
    void moveRight() {
        MovableCircle circle = new MovableCircle(0, 0, 2, 0,6);
        circle.moveRight();
        assertEquals("(x=2,y=0),speed=(2,0),radius=6", circle.toString());
    }
}