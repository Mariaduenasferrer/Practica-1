package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Rectangle rectangle = new Rectangle(4.0, 6.0);

    @Test
    public void testGetArea() {
        assertEquals(4.0 * 6.0, rectangle.getArea());
    }

    @Test
    public void testGetPerimeter() {
        assertEquals(2 * (4.0 + 6.0), rectangle.getPerimeter());
    }

    @Test
    public void testToString() {
        String expectedString = "Rectangle [width=4.0, length=6.0]";
        assertEquals(expectedString, rectangle.toString());
    }
}