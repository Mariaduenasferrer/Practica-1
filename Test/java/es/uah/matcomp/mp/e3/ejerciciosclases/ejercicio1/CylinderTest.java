package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void Cylinder(){
        Cylinder cylinder = new Cylinder(4.0);
        assertEquals(4.0, cylinder.getHeight());
    }
    @Test
    void setHeight() {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(4.0);
        assertEquals(4.0, cylinder.getHeight());
    }

    @Test
    void getArea() {
        Cylinder cylinder = new Cylinder(3.0, 5.0);
        double baseArea = Math.PI * 3.0 * 3.0; // Área de la base
        double lateralArea = 2 * Math.PI * 3.0 * 5.0; // Área lateral
        double expectedArea = (2 * baseArea) + lateralArea; // Área total
        assertEquals(expectedArea, cylinder.getArea());
    }

    @Test
    void getVolume() {
        Cylinder cylinder = new Cylinder(3.0, 5.0);
        double expectedVolume = Math.PI * 3.0 * 3.0 * 5.0;
        assertEquals(expectedVolume, cylinder.getVolume());
    }

    @Test
    void testToString() {
        Cylinder cylinder = new Cylinder(2.0, 3.0);
        assertEquals("Cylinder: subclass of Circle[radius=2.0 color=red] height=3.0", cylinder.toString());
    }
}