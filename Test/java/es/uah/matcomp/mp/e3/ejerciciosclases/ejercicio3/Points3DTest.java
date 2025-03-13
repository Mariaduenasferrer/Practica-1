package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Points3DTest {
    private Points3D points3D = new Points3D(3.0F, 4.0F, 5.0F);
    @Test
    void getZ() {assertEquals(5.0F, points3D.getZ());}

    @Test
    void getXYZ() {assertArrayEquals(new float[]{3.0F, 4.0F, 5.0F}, points3D.getXYZ());}

    @Test
    void setZ() {
        points3D.setZ(4.0F);
        assertEquals(4.0F, points3D.getZ(), 0);
    }

    @Test
    void setXYZ() {
        points3D.setXYZ(4.0F, 5.0F, 6.0F);
        assertArrayEquals(new float[]{4.0F, 5.0F, 6.0F}, points3D.getXYZ(), 0);
    }

    @Test
    void testToString() {assertEquals("(3.0, 4.0, 5.0)", points3D.toString());}
    }
