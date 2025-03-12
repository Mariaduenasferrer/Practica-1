package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    // Necesitamos crear una subclase concreta de Shape para poder instanciar un objeto
    private Shape shape = new Shape("blue", false) {
        @Override
        public double getArea() {
            return 0;
        }
        @Override
        public double getPerimeter() {
            return 0;
        }
    };

    @Test
    void testGetColor() {
        assertEquals("blue", shape.getColor());
    }

    @Test
    void testSetColor() {
        shape.setColor("green");
        assertEquals("green", shape.getColor());
    }

    @Test
    void testIsFilled() {
        assertFalse(shape.isFilled());
    }

    @Test
    void testSetFilled() {
        shape.setFilled(true);
        assertTrue(shape.isFilled());
    }

    @Test
    void testToString() {
        String expected = "Shape{color=blue, filled=false}";
        assertEquals(expected, shape.toString());
    }

    @Test
    void testGetArea() {
        assertEquals(0, shape.getArea());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(0, shape.getPerimeter());
    }
}