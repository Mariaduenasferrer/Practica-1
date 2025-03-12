package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void CircleTest() {
        Circle c = new Circle();
        c.setRadius(10);
        assertEquals(10, c.getRadius());
    }

    @Test
    void CircleTest2() {
        Circle c = new Circle(10);
        assertEquals(10, c.getRadius());

    }

    @Test
    void getRadiusysetRadius() {
        Circle c = new Circle();
        c.setRadius(435);
        assertEquals(435, c.getRadius());
    }


    @Test
    void getArea() {
        Circle c = new Circle(Math.PI);
        assertEquals(Math.PI* Math.PI * Math.PI, c.getArea());
    }

    @Test
    void getCircumference() {
        Circle c = new Circle(Math.PI);
        assertEquals(Math.PI*2*Math.PI, c.getCircumference());
    }

    @Test
    void testToString() {
        Circle c = new Circle();
        assertEquals("Circle[radius=" + c.getRadius() + "]", c.toString());
    }
}