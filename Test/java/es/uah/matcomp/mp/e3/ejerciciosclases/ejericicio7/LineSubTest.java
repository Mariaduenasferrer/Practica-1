package es.uah.matcomp.mp.e3.ejerciciosclases.ejericicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {

    @Test
    void constructorWithCoordinates() {
        LineSub line = new LineSub(1, 2, 3, 4);
        assertEquals(1, line.getBeginX());
        assertEquals(2, line.getBeginY());
        assertEquals(3, line.getEndX());
        assertEquals(4, line.getEndY());
    }

    @Test
    void constructorWithPoints() {
        Point begin = new Point(5, 6);
        Point end = new Point(7, 8);
        LineSub line = new LineSub(begin, end);

        assertEquals(5, line.getBeginX());
        assertEquals(6, line.getBeginY());
        assertEquals(7, line.getEndX());
        assertEquals(8, line.getEndY());
    }

    @Test
    void getBegin() {
        LineSub line = new LineSub(10, 20, 30, 40);
        Point begin = line.getBegin();

        assertEquals(10, begin.getX());
        assertEquals(20, begin.getY());
    }

    @Test
    void getEnd() {
        LineSub line = new LineSub(1, 1, 5, 5);
        Point end = line.getEnd();

        assertEquals(5, end.getX());
        assertEquals(5, end.getY());
    }

    @Test
    void setBegin() {
        LineSub line = new LineSub(0, 0, 4, 4);
        Point newBegin = new Point(2, 2);

        line.setBegin(newBegin);

        assertEquals(2, line.getBeginX());
        assertEquals(2, line.getBeginY());
    }

    @Test
    void setEnd() {
        LineSub line = new LineSub(0, 0, 4, 4);
        Point newEnd = new Point(8, 8);

        line.setEnd(newEnd);

        assertEquals(8, line.getEndX());
        assertEquals(8, line.getEndY());
    }

    @Test
    void setBeginX() {
        LineSub line = new LineSub(0, 0, 4, 4);
        line.setBeginX(10);

        assertEquals(10, line.getBeginX());
    }

    @Test
    void setBeginY() {
        LineSub line = new LineSub(0, 0, 4, 4);
        line.setBeginY(15);

        assertEquals(15, line.getBeginY());
    }

    @Test
    void setBeginXY() {
        LineSub line = new LineSub(0, 0, 4, 4);
        line.setBeginXY(12, 18);

        assertEquals(12, line.getBeginX());
        assertEquals(18, line.getBeginY());
    }

    @Test
    void setEndX() {
        LineSub line = new LineSub(0, 0, 4, 4);
        line.setEndX(20);

        assertEquals(20, line.getEndX());
    }

    @Test
    void setEndY() {
        LineSub line = new LineSub(0, 0, 4, 4);
        line.setEndY(25);

        assertEquals(25, line.getEndY());
    }

    @Test
    void setEndXY() {
        LineSub line = new LineSub(0, 0, 4, 4);
        line.setEndXY(30, 35);

        assertEquals(30, line.getEndX());
        assertEquals(35, line.getEndY());
    }

    @Test
    void getLength() {
        LineSub line = new LineSub(0, 0, 3, 4);

        assertEquals(5, line.getLength());
    }

    @Test
    void getGradient() {
        LineSub line = new LineSub(0, 0, 1, 1);

        assertEquals(Math.PI / 4, line.getGradient(), 0.0001);
    }

    @Test
    void testToString() {
        LineSub line = new LineSub(1, 2, 3, 4);

        String expected = "LineSub from Point: (1, 2) to Point: (3, 4)";
        assertEquals(expected, line.toString());
    }
}