package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        Circle circle = new Circle(3.0);
        assertEquals(Math.PI * 3.0 * 3.0, circle.getArea());
    }

    @Test
    void setRadius() {
        Circle circle = new Circle();
        circle.setRadius(3.0);
        assertEquals(3.0, circle.getRadius());
    }

    @Test
    void setColor() {
        Circle circle = new Circle();
        circle.setColor("blue");
        assertEquals("blue", circle.getColor());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(2.0);
        assertEquals("Circle[radius=2.0 color=red]", circle.toString());
    }
}