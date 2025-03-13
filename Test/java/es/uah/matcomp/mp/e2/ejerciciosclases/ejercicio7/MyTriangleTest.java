package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyTriangleTest {
    private   MyTriangle triangle = new MyTriangle(0, 0, 3, 0, 0, 4);

    @Test
    void testConstructorWithCoordinates() {
        assertEquals("(0, 0)", triangle.toString().contains("(0, 0)"));
        assertEquals("(3, 0)", triangle.toString().contains("(3, 0)"));
        assertEquals("(0, 4)", triangle.toString().contains("(0, 4)"));
    }

    @Test
    void testGetPerimeter() {
        assertEquals(4, triangle.getPerimeter());


    }

    @Test
    void testConstructorWithMyPointObjects() {
        MyPoint v1 = new MyPoint(0, 0);
        MyPoint v2 = new MyPoint(3, 0);
        MyPoint v3 = new MyPoint(0, 4);
        MyTriangle triangle = new MyTriangle(v1, v2, v3);


        assertEquals("(0, 0)", triangle.toString().contains("(0, 0)"));
        assertEquals("(3, 0)", triangle.toString().contains("(3, 0)"));
        assertEquals("(0, 4)", triangle.toString().contains("(0, 4)"));



    }
    @Test
    void toStringTest() {
        assertEquals(v1.distance(v2) + v2.distance(v3) + v3.distance(v1), triangle.toString());
    }
}


