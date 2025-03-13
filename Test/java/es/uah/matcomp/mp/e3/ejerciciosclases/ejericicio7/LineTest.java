package es.uah.matcomp.mp.e3.ejerciciosclases.ejericicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void constructorWithPoints() {
        Point begin = new Point(1, 2);
        Point end = new Point(3, 4);
        Line line = new Line(begin, end);

        assertEquals(begin, line.getBegin());
        assertEquals(end, line.getEnd());
    }

    @Test
    void constructorWithCoordinates() {
        Line line = new Line(1, 2, 3, 4);

        assertEquals(1, line.getBeginX());
        assertEquals(2, line.getBeginY());
        assertEquals(3, line.getEndX());
        assertEquals(4, line.getEndY());
    }

    @Test
    void getAndSetBegin() {
        Line line = new Line(0, 0, 5, 5);
        Point newBegin = new Point(2, 2);

        line.setBegin(newBegin);

        assertEquals(newBegin, line.getBegin());
    }

    @Test
    void getAndSetEnd() {
        Line line = new Line(0, 0, 5, 5);
        Point newEnd = new Point(8, 8);

        line.setEnd(newEnd);

        assertEquals(newEnd, line.getEnd());
    }

    @Test
    void setBeginXY() {
        Line line = new Line(1, 1, 4, 4);

        line.setBeginXY(10, 20);

        assertEquals(10, line.getBeginX());
        assertEquals(20, line.getBeginY());
    }

    @Test
    void setEndXY() {
        Line line = new Line(1, 1, 4, 4);

        line.setEndXY(15, 25);

        assertEquals(15, line.getEndX());
        assertEquals(25, line.getEndY());
    }

    @Test
    void setBeginXAndY() {
        Line line = new Line(0, 0, 5, 5);

        line.setBeginX(7);
        line.setBeginY(9);

        assertEquals(7, line.getBeginX());
        assertEquals(9, line.getBeginY());
    }

    @Test
    void setEndXAndY() {
        Line line = new Line(0, 0, 5, 5);

        line.setEndX(12);
        line.setEndY(15);

        assertEquals(12, line.getEndX());
        assertEquals(15, line.getEndY());
    }

    @Test
    void getLength() {
        Line line = new Line(0, 0, 3, 4);

        assertEquals(5, line.getLength());
    }

    @Test
    void getGradient() {
        Line line = new Line(0, 0, 1, 1);

        assertEquals(Math.PI / 4, line.getGradient(), 0.0001);
    }

    @Test
    void testToString() {
        Line line = new Line(1, 2, 3, 4);

        String expected = "Line from Point: (1, 2) to Point: (3, 4)";
        assertEquals(expected, line.toString());
    }
}
