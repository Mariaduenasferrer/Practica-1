package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointMTest {
    private PointM pointM = new PointM(2.0F, 3.0F);
    @Test
    void getX() {assertEquals(2.0F, pointM.getX());}

    @Test
    void getY() {assertEquals(3.0F, pointM.getY());}

    @Test
    void setY() {
        pointM.setY(4.0F);
        assertEquals(4.0F, pointM.getY());
    }

    @Test
    void setX() {
        pointM.setX(5.0F);
        assertEquals(5.0F, pointM.getX());
    }

    @Test
    void setXY() {
        pointM.setXY(5.0F, 6.0F);
        assertArrayEquals(new float[] {5.0F, 6.0F}, pointM.getXY());
    }

    @Test
    void getXY() {assertArrayEquals(new float[] {2.0F, 3.0F}, pointM.getXY());}

    @Test
    void testToString() {assertEquals("(2.0,3.0)",pointM.toString() );
    }
}
