package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyTriangleTest {
    private   MyTriangle triangle = new MyTriangle(0, 0, 3, 0, 0, 4);

    @Test
    void testConstructorWithCoordinates() {
        assertEquals(true, triangle.toString().contains("(0, 0)"));
        assertEquals(true, triangle.toString().contains("(3, 0)"));
        assertEquals(true, triangle.toString().contains("(0, 4)"));
    }

    @Test
    void testGetPerimeter() {
        assertEquals(12, triangle.getPerimeter());


    }

    @Test
    void testConstructorWithMyPointObjects() {
        MyPoint v1 = new MyPoint(0, 0);
        MyPoint v2 = new MyPoint(3, 0);
        MyPoint v3 = new MyPoint(0, 4);
        MyTriangle triangle = new MyTriangle(v1, v2, v3);


        assertEquals(true, triangle.toString().contains("(0, 0)"));
        assertEquals(true, triangle.toString().contains("(3, 0)"));
        assertEquals(true, triangle.toString().contains("(0, 4)"));



    }
    @Test
    void toStringTest() {
        MyPoint v1 = new MyPoint(0, 0);
        MyPoint v2 = new MyPoint(3, 0);
        MyPoint v3 = new MyPoint(0, 4);
        MyTriangle triangle = new MyTriangle(v1, v2, v3);
        assertEquals("MyTriangle (v1 = (0, 0), v2 = (3, 0), v3 = (0, 4))", triangle.toString());
    }
}


