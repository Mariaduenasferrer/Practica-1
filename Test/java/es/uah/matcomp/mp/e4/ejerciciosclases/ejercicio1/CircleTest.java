package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circle = new Circle(2.0, "yellow", true);

    @Test
    void getRadius() {
        assertEquals(2.0, circle.getRadius());
    }
    @Test
    void setRadius() {
        circle.setRadius(5.0);
        assertEquals(5.0, circle.getRadius());
    }
    @Test
    void getArea() {
        assertEquals(Math.PI * 2.0 * 2.0, circle.getArea());
    }
    @Test
    void getPerimeter() {
        assertEquals(2 * Math.PI * 2.0, circle.getPerimeter());
    }
    @Test
    void testToString() {
        String expected = "Circle[Shape{color=yellow, filled=true}, radius=2.0]";
        assertEquals(expected, circle.toString());
    }
}