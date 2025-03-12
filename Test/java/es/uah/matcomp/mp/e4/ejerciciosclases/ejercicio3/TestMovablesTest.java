package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class TestMovablesTest {

    @Test
    void main() {
    }

    @Test
    void testConstructor() {
        MovablePoint point = new MovablePoint(5, 10, 2, 3);
        assertEquals(5, point.x);
        assertEquals(10, point.y);
        assertEquals(2, point.xSpeed);
        assertEquals(3, point.ySpeed);
    }
}
