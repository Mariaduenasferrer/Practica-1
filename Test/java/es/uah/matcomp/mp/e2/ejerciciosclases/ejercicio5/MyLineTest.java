package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio5;

import org.junit.jupiter.api.Test;

class MyLineTest {

    @Test
    void testConstructorWithCoordinates() {
        MyLine line = new MyLine(1, 2, 3, 4);
        assertEquals(1, line.getBeginX());
        assertEquals(2, line.getBeginY());
        assertEquals(3, line.getEndX());
        assertEquals(4, line.getEndY());
    }

    @Test
    void testConstructorWithMyPointObjects() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 4);

        MyLine line = new MyLine(begin, end);

        assertEquals(1, line.getBeginX());
        assertEquals(2, line.getBeginY());
        assertEquals(3, line.getEndX());
        assertEquals(4, line.getEndY());
    }

    @Test
    void testGetLength() {
        MyLine line = new MyLine(1, 2, 4, 6);
        assertEquals(1.0, line.getLength(), 0.01);  // La distancia entre (1,2) y (4,6) es 5
    }

    @Test
    void testGetGradient() {
        MyLine line = new MyLine(1, 2, 4, 6);
        double expectedGradient = Math.atan2(6 - 2, 4 - 1);
        assertEquals(expectedGradient, line.getGradient(), 0.01);
    }

    @Test
    void testSetBegin() {
        MyLine line = new MyLine(1, 2, 3, 4);

        MyPoint newBegin = new MyPoint(5, 6);
        line.setBegin(newBegin);
        assertEquals(5, line.getBeginX());
        assertEquals(6, line.getBeginY());
    }

    @Test
    void testSetEnd() {
        MyLine line = new MyLine(1, 2, 3, 4);

        MyPoint newEnd = new MyPoint(7, 8);
        line.setEnd(newEnd);
        assertEquals(7, line.getEndX());
        assertEquals(8, line.getEndY());
    }

    @Test
    void testSetBeginXY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setBeginXY(5, 6);
        assertEquals(5, line.getBeginX());
        assertEquals(6, line.getBeginY());
    }

    @Test
    void testSetEndXY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setEndXY(7, 8);
        assertEquals(7, line.getEndX());
        assertEquals(8, line.getEndY());
    }

    // Estas pruebas estaban incorrectas, porque los valores esperados no son correctos
    @Test
    void getBegin() {
        MyLine line = new MyLine(1, 2, 3, 4);
        assertEquals(1, line.getBeginX());  // El valor correcto es 1
    }

    @Test
    void getEnd() {
        MyLine line = new MyLine(1, 2, 3, 4);
        assertEquals(3, line.getEndX());  // El valor correcto es 3
    }

    @Test
    void getBeginX() {
        MyLine line = new MyLine(1, 2, 3, 4);
        assertEquals(1, line.getBeginX());  // El valor correcto es 1
    }

    @Test
    void getBeginY() {
        MyLine line = new MyLine(1, 2, 3, 4);
        assertEquals(2, line.getBeginY());  // El valor correcto es 2
    }

    @Test
    void getEndX() {
        MyLine line = new MyLine(1, 2, 3, 4);
        assertEquals(3, line.getEndX());  // El valor correcto es 3
    }

    @Test
    void setEndX() {
        MyLine line = new MyLine(1, 2, 3, 4);
        line.setEndX(7);
        assertEquals(7, line.getEndX());
    }

    @Test
    void getEndY() {
        MyLine line = new MyLine(1, 2, 3, 4);
        assertEquals(4, line.getEndY());  // El valor correcto es 4
    }

    @Test
    void setEndY() {
        MyLine line = new MyLine(1, 2, 3, 4);
        line.setEndY(7);
        assertEquals(7, line.getEndY());
    }

    @Test
    void getBeginXY() {
        MyLine line = new MyLine(1, 2, 3, 4);
        int[] expected = {1, 2};
        assertArrayEquals(expected, line.getBeginXY());  // Verificar que el arreglo devuelto sea [1, 2]
    }

    @Test
    void setBeginXY() {
        MyLine line = new MyLine(1, 2, 3, 4);
        line.setBeginXY(7, 8);
        int[] expected = {7, 8};
        assertArrayEquals(expected, line.getBeginXY());  // Verificar que el arreglo devuelto sea [7, 8]
    }

    @Test
    void getEndXY() {
        MyLine line = new MyLine(1, 2, 3, 4);
        int[] expected = {3, 4};
        assertArrayEquals(expected, line.getEndXY());  // Verificar que el arreglo devuelto sea [3, 4]
    }

    @Test
    void setEndXY() {
        MyLine line = new MyLine(1, 2, 3, 4);
        line.setEndXY(7, 8);
        int[] expected = {7, 8};
        assertArrayEquals(expected, line.getEndXY());  // Verificar que el arreglo devuelto sea [7, 8]
    }

    @Test
    void testToString() {
        MyLine line = new MyLine(1, 2, 3, 4);
        assertEquals("MyLine[begin=(1, 2), end=(3, 4)]", line.toString());
    }
}
