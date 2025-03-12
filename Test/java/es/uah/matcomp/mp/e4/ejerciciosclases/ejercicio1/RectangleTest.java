package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rectangle = new Rectangle(4.0, 5.0, "green", true);

    @Test
    void getWidth() {
        assertEquals(4.0, rectangle.getWidth());
    }

    @Test
    void setWidth() {
        rectangle.setWidth(7.0);
        assertEquals(7.0, rectangle.getWidth());
    }

    @Test
    void getLength() {
        assertEquals(5.0, rectangle.getLength());
    }

    @Test
    void setLength() {
        rectangle.setLength(10.0);
        assertEquals(10.0, rectangle.getLength());
    }

    @Test
    void getArea() {
        assertEquals(4.0 * 5.0, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals((2 * 4.0) + (2 * 5.0), rectangle.getPerimeter());
    }

    @Test
    void testToString() {
        String expected = "Rectangle[Shape{color=green, filled=true}, width=4.0 length=5.0]";
        assertEquals(expected, rectangle.toString());
    }
}