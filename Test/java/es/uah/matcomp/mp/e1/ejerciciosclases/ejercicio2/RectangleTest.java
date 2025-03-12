package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class RectangleTest {

    @Test
    void RectangleTest() {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(10);
        assertEquals(10, r.getLength());
        assertEquals(10, r.getWidth());

    }
    @Test
    public void RecangleTest2() {
        Rectangle r = new Rectangle(2.5f, 3.5f);
        assertEquals(2.5f, r.getLength());
        assertEquals(3.5f, r.getWidth());
    }
    @Test
    void getLength() {
        Rectangle r = new Rectangle();
        assertEquals(1.0, r.getLength());

    }

    @Test
    void setLength() {
        Rectangle r = new Rectangle(11, 10);
        r.setLength(11);
        assertEquals(11, r.getLength());

    }

    @Test
    void getWidth() {
        Rectangle r = new Rectangle();
        assertEquals(1.0, r.getWidth());

    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle();
        r.setWidth(11);
        assertEquals(11, r.getWidth());
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle(10, 10);
        assertEquals(100, r.getArea());

    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(10, 10);
        assertEquals(40, r.getPerimeter());

    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle();
        assertEquals("Rectangle[length=" + r.getLength() + ", width=" + r.getWidth() + "]", r.toString());

    }
}