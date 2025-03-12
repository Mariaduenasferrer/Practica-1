package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestGeometricObjectsTest {

    @Test
    void main() {
    }

    @Test
    void testCircle() {
        Circle circle = new Circle(4);
        assertEquals(Math.PI * 4 * 4, circle.getArea());
        assertEquals(2 * Math.PI * 4, circle.getPerimeter());
        assertEquals("Circle [radius=4.0]", circle.toString());
    }

    @Test
    void testRectangle() {
        Rectangle rectangle = new Rectangle(5, 5);
        assertEquals(5 * 5, rectangle.getArea());
        assertEquals(2 * (5 + 5), rectangle.getPerimeter());
        assertEquals("Rectangle [width=5.0, length=5.0]", rectangle.toString());
    }
}