package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleTest {
    private Circle circle = new Circle(5.0);

    @Test
    public void getArea() {
        double expectedArea = Math.PI * 5.0 * 5.0;
        assertEquals(expectedArea, circle.getArea(), 0.0001);
    }

    @Test
    public void getPerimeter() {
        double expectedPerimeter = 2 * Math.PI * 5.0;
        assertEquals(expectedPerimeter, circle.getPerimeter(), 0.0001);
    }

    @Test
    public void testToString() {
        String expectedString = "Circle [radius=5.0]";
        assertEquals(expectedString, circle.toString());
    }
}