package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Points2DTest {
    private Points2D points2D = new Points2D(3.0F, 5.0F);
    private Points2D points2D2 = new Points2D();

    @Test
    void Point2D(){
        assertEquals(0.0, points2D2.getX());
        assertEquals(0.0, points2D2.getY());
    }
    @Test
    void getX() {assertEquals(3, points2D.getX());}

    @Test
    void getY() {assertEquals(5, points2D.getY());}

    @Test
    void getXY() {assertArrayEquals(new float[]{3.0F, 5.0F}, points2D.getXY());}

    @Test
    void setX() {
        points2D.setX(4);
        assertEquals(4, points2D.getX());
    }

    @Test
    void setY() {
        points2D.setY(6);
        assertEquals(6, points2D.getY());
    }

    @Test
    void setXY() {
        points2D.setXY(5.0F, 8.0F);
        assertArrayEquals(new float[]{5.0F, 8.0F}, points2D.getXY());
    }

    @Test
    void testToString() {assertEquals("(3.0, 5.0)", points2D.toString());}
    }