package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio5;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {
    private Circle2 circle = new Circle2(3.0, "red");
    @Test
    void getRadius() {assertEquals(3.0, circle.getRadius());}

    @Test
    void setRadius() {
        circle.setRadius(4.0);
        assertEquals(4.0, circle.getRadius());
    }

    @Test
    void getColor() {assertEquals("red", circle.getColor());}

    @Test
    void setColor() {
        circle.setColor("blue");
        assertEquals("blue", circle.getColor());
    }

    @Test
    void getArea() {assertEquals(Math.PI*9.0, circle.getArea());}

    @Test
    void testToString() {assertEquals("Circle[radius=3.0, color=red]", circle.toString());}
    }